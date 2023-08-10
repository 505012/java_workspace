package Starcraft;

public class Zergling extends Unit{
	public Zergling(String name) {
	super(name);
	super.power = 2;
	super.hp = 25;
	}
//	public void attack(Zealot zealot) {
//		zealot.beAttack(super.power);
//		System.out.println(name + "가" + zealot.getName() + "을 공격 합니다.");
//
//	}
//
//	public void attack(Marine marine) {
//		marine.beAttack(super.power);
//		System.out.println(name + "가" + marine.getName() + "을 공격 합니다.");
//	}

}