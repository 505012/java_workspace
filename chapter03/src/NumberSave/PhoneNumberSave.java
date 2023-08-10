package NumberSave;

import java.util.Scanner;

public class PhoneNumberSave {

	public static void main(String[] args) {
		Phone[] phones = new Phone[100];
		final String SAVE = "1";
		final String SELECT = "2";
		final String UPDATE = "3";
		final String DELETE = "4";
		final String END = "0";
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int index = 0;
		while (flag) {
			System.out.println("1.저장 2.선택 3.수정 4.삭제 0.종료");
			String sNumber = sc.nextLine();
			if (sNumber.equals(SAVE)) {
				index = save(sc, phones, index);
			} else if (sNumber.equals(SELECT)) {
				select(sc, phones);
			}else if(sNumber.equals(UPDATE)) {
				update(sc, phones);
			}else if(sNumber.equals(DELETE)) {
				delete(sc, phones);
			}else if(sNumber.equals(END)) {
				flag = false;
			}
		}
	}

	public static int save(Scanner scanner, Phone[] phones, int index) {
		System.out.println("---저장---");
		System.out.println("저장할 번호를 입력하세요");
		String number = scanner.nextLine();
		System.out.println("이름을 입력하세요");
		String name = scanner.nextLine();
		System.out.println("저장 되었습니다.");
		Phone phone = new Phone(number, name);
		phones[index] = phone;
		index++;
		return index;
	}

	public static void select(Scanner scanner, Phone[] phones) {
		System.out.println("검색(이름) : ");
		String name = scanner.nextLine();
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] != null) {
				if (phones[i].getName().equals(name)) {
					phones[i].showInfo();
				break;}
			}
		}
	}
	
	public static void update(Scanner scanner,Phone[] phones) {
		System.out.println("수정할 이름 : ");
		String name = scanner.nextLine();
		for(int i = 0; i<phones.length; i++) {
			if(phones[i] != null) {
				if(phones[i].getName().equals(name)) {
					System.out.println("수정할 이름을 입력해 주세요");
					name = scanner.nextLine();
					phones[i].setName(name);
					System.out.println("수정할 번호를 입력하시오");
					name = scanner.nextLine();
					phones[i].setNumber(name);
					break;
				}
			
			System.out.println("없습니다.");}
		}
		
	}
	public static void delete(Scanner scanner, Phone[] phones) {
		System.out.println("모든 데이터를 삭제합니다.");
		for(int i = 0; i<phones.length; i++) {
			phones[i] = null;
		}
	}

}
