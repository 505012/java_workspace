package ch10;

public interface RemoteController {

	// 인터페이스란?
	//구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도
	//특징
	//맴버 변수, 일반 구현 메서드를 가질 수 없다.
	//오직 추상 메서드와 상수만을 맴버로 가질 수 있다.
	//인퍼테이스는 표준,약속(강제성있는),규약을 으미한다
	//추상 클래스보다 추상화가 더 높다 기능적인 측면으로 활용이 된다.
	public static final int SERAIAL_NUMBAER = 100;//상수만을 가질 수 있다
	//public int number//맴버면수 사용불가
	public abstract void turnOm();//추상 메서드만 가질 수 있다
	//public void turnOff(){}
	//end of interface

	//인터페이스 안에 선언하는 기능은 전부 public abstract이다.
	//public abstract 생략가능하다
	void turnOff();
}