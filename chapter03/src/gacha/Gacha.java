package gacha;

import java.util.Random;
import java.util.Scanner;

public class Gacha {

	public static void main(String[] args) {
		Toy bear1 = new Bear("테디베어");
		Toy phone1 = new Phone("갤럭시s2");
		Toy[] toy1 = new Toy[10];

		while (true) {
			Random random = new Random();
			int rand = random.nextInt(10);
			toy1[rand] = bear1;
			rand = random.nextInt(10);
			toy1[rand] = phone1;
			Scanner sc = new Scanner(System.in);
			System.out.println("번호를 선택하세요 : 0~9");
			int select = sc.nextInt();
			if (select < 0 || select > 9) {
				System.out.println("꽝!");
			}
			if (select > -1 && select < 10) {
							if (toy1[select] instanceof Bear) {
					String checkType = ((Bear) toy1[select]).type;
					System.out.println(toy1[select].name);
					System.out.println(checkType);
				} else if (toy1[select] instanceof Phone) {
					String checkType = ((Phone) toy1[select]).type;
					System.out.println(toy1[select].name);
					System.out.println(checkType);
				} else {
					System.out.println("꽝!");
				}
			}

		}
	}

}
