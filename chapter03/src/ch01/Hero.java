package ch01;

public class Hero {
	int hp = 20;
	int atk = 4;
	int def = 2;

	public static void main(String[] args) {
	Archer archer = new Archer();
	System.out.println(archer.hp + "hp상속");
	System.out.println(archer.atk + "atk상속");
	System.out.println(archer.def + "def상속");
	System.out.println(archer.range);
	}
}

class Archer extends Hero {
	int range = 5;
}