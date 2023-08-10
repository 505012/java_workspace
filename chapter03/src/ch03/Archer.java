package ch03;

public class Archer extends Hero {
	

	public Archer(String name, int hp) {
		super(name,hp);
	}

	@Override//오버라이드
	protected void attack() {
		System.out.println(name + "기본공격을 합니다.");
	}
	public void fireArrow(){
		System.out.println("불화살 공격");
	}
}
