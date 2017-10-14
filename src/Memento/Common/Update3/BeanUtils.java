package Memento.Common.Update3;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {

	public static HashMap<String, Object> backupProp(Object bean){
		HashMap<String, Object> result=new HashMap<>();
		try {
			BeanInfo beanInfo=Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors=beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor des : descriptors) {
				String fieldName=des.getName();
				Method getter=des.getReadMethod();
				Object fieldValue=getter.invoke(bean, new Object[]{});
				if (!fieldName.equalsIgnoreCase("class")) {
					result.put(fieldName, fieldValue);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void restoreProp(Object bean,HashMap<String, Object> propMap){
		try {
			BeanInfo beanInfo=Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors=beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor des : descriptors) {
				String fieldName=des.getName();
				if (propMap.containsKey(fieldName)) {
					Method setter=des.getWriteMethod();
					setter.invoke(bean, new Object[]{propMap.get(fieldName)});
				}
			}
		} catch (Exception e) {
			System.out.println("shit");
			e.printStackTrace();
		}
	}
}
