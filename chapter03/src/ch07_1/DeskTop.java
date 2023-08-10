package ch07_1;

public class DeskTop extends Computer{
	
	//구현 메서드 오버라이드
	@Override
	public void display() {
	System.out.println("화면 출력");
	}
	@Override
	public void typing() {
		System.out.println("글자 입력");
	}
}
