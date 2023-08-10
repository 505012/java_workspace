package ch01;

public class A {
	String name;
	int height;
	int weight;
	int age;
	
    //main 함수 테스트 - 잠시 자리만        빌림
	public static void main(String[] args) {
		C c1 = new C();
		c1.age = 100;
		System.out.println(c1.age);
		
	}

}// end of class

// 하나의 .java 안에서 여러개의 클래스를 설계할 수 있다.
//단, 하나의 자바 파일에서 public class는 단 하나만 설계 가능하다.
class B {
	String name;
	int height;
	int weight;
	int age;
	String tel;
}

class C extends A {
	String phone;

}
