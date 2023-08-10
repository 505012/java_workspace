package ch05;
import Starcraft.*;
public class MainTest2 {

	public static void main(String[] args) {
		//Unit 이라는 배열에 저글링, 질럿, 마린을 담아 보세요
		//실행도 시켜 봅시다.
		Unit[] pt = new Unit[10];
		Unit zealot1 = new Zealot("질럿1");
		for(int i = 0; i < pt.length; i++)
		{
		Unit zealot = new Zealot("질럿"+i);
		pt[i] = zealot;
		System.out.println(pt[i].getName());
		}

	}

}
