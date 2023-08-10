package ch03;

public class Warrior extends Hero {
	//부모 클래스에 사용자 정의 생성자가 있다면 자식 클래스에 반드시 부모생성자를 먼저 호출 해야한다
	public Warrior(String name, int hp) {
		//super <-부모를 의미한다.
		//System.out.println("dsdd");부모가 태어나기 전에 먼저 생성할 수 없다.
		super(name, hp);//부모생성자를 먼저 호출 해야한다.
	}
	@Override //어노테이션
	protected void attack() {
		//super.attack();//super.
		System.out.println( this.name + "전사가 기본 공격을 합니다.");
	}
	public void comboAttack() {
		System.out.println("2단 공격");
	}
	
}
