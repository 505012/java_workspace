package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		//자동차라는 클래스를 메모리에 올려 보자
		Engin engin1 = new Engin("v8",2_000);
		Engin engin2 = new Engin("v6",1_000);
		Car car1 = new Car("벤츠", 8_000, engin2);
		int a = car1.getEngin().getPrice();
		System.out.println(car1.getEngin().getName());
	}

}
