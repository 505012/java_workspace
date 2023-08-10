package Starcraft;

public class MainTest1 {

	public static void main(String[] args) {
		//Zealot z1 = new Zealot("질럿1");
		Unit z1 = new Zealot("질럿1");
		Marine m1 = new Marine("마린1");
		
		Zergling zerg1 = new Zergling("저글링1");
		
		// 마린이란 자료형은 유닛이라는 타입으로 바라 볼 수 있다 - 다형성 
		z1.attack(m1);
		m1.attack(z1);
		z1.showInfo();
		m1.showInfo();
		zerg1.showInfo();
//		z1.atk();
//		m1.atk();
//		zerg1.atk();
//		z1.atk(); // *자기 자신에 atk 메서드가 있는가 확인 


	}

}