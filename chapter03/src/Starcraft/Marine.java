package Starcraft;

public class Marine extends Unit {
	public Marine(String name) {
		super(name);
		super.hp = 50;
		super.power = 3;
	}
//	public void attack(Zealot zealot) {
//		zealot.beAttack(super.power);
//		System.out.println(name + "가" + zealot.getName() + "을 공격 합니다.");
//
//	}
//
//	public void attack(Zergling zergling) {
//		zergling.beAttack(super.power);
//		System.out.println(name + "가" + zergling.getName() + "을 공격 합니다.");
//	}

}
