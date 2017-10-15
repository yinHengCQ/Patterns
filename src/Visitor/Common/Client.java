package Visitor.Common;

public class Client {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Element e1=ObjectStruture.createElement();
			e1.accept(new Visitor());
		}
	}
}
