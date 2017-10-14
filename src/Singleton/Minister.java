package Singleton;

public class Minister {

	public static void main(String[] args) {
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					Emperor.getInstance().say();
				}
			}
		};
		
		Thread thread1=new Thread(runnable);
		Thread thread2=new Thread(runnable);
		Thread thread3=new Thread(runnable);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
