package ch03;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
	}
	@Override//오버라이드
	protected void attack() {
		System.out.println(name + "기본 공격을 합니다.");
	}
	public void freezing() {
		
	}
}
