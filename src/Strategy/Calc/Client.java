package Strategy.Calc;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		args=new String[]{"2","+","3"};
		int a=Integer.parseInt(args[0]);
		String symbol=args[1];
		int b=Integer.parseInt(args[2]);
		System.out.println("输入的参数为："+Arrays.toString(args));
		System.out.println("运算结果为："+a+symbol+b+"="+Calculator.ADD.exec(a, b));
	}
}
