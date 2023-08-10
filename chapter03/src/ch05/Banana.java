package ch05;

public class Banana extends Fruit{
	String origin;
	public Banana(String name, int price) {
		super(name, price);//부모생성자 호출해 주어야 한다.
		origin = "필리핀";
	}
	
}
