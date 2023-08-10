package ch05;

public class FruitMainTest1 {

	public static void main(String[] args) {
		//다형성
		//용어 - 업캐스팅
		Banana fruit1 = new Banana("델몬트바나나",2000);
		Fruit fruit2 = new Peach("청도복숭아",3000);
		fruit1.showInfo();
		fruit2.showInfo();
		//업캐스팅 된 상태에서는 컴파일 시점만 확인을 한다.
		//System.out.println(fruit1.origin);오류 확인
		//??컴파일 시점에 어떻게 origin이라는 변수를 출력할까?
		//1단계 다운캐스팅을 하자
		fruit1.d(fruit2);
		System.out.println(fruit1.origin);
		//2단계 다운캐스팅
		String checkOrigin = ((Banana)fruit1).origin;
	}

}
