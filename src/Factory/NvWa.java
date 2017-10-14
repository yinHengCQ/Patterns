package Factory;

public class NvWa {
	
	public static void main(String[] args) {
		AbstractHumanFactory YinYangLu = new HumanFactory();
		System.out.println("--����ĵ�һ�����ǰ�ɫ����--");
		Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("--����ĵڶ������Ǻ�ɫ����--");
		Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("--����ĵ������ǻ�ɫ����--");
		Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
