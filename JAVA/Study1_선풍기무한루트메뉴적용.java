package 자바9_클래스연습;

import java.util.Scanner;

public class Study1_선풍기무한루트메뉴적용 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fan f = new Fan();
		int select;
		
		
		System.out.println("[[[ 선풍기 상태정보 ]]]");
		System.out.println("선풍기명 : " + f.name);
		System.out.println("전원: "+f.power+" / 회전: "+f.rotate);
		System.out.println("속도: "+f.fanSpeed+" / 높이: "+f.headControl);
		System.out.println("1.전원켜기");
		System.out.println("2.종료");
		System.out.print("선택:"); select = sc.nextInt();
	
		if(select == 1) { 
			System.out.println("\n선풍기전원이 들어갔습니다!\n");
			f.power = true;}
		else if(select == 2) {System.out.println("프로그램종료");}	
		
		while(f.power)
		{
			System.out.println("[[[ 선풍기 상태정보 ]]]");
			System.out.println("선풍기명 : " + f.name);
			System.out.println("전원: "+f.power+" / 회전: "+f.rotate);
			System.out.println("속도: "+f.fanSpeed+" / 높이: "+f.headControl);
			System.out.println("1.회전설정");
			System.out.println("2.속도조정");
			System.out.println("3.높이조정");
			System.out.println("4.종료");
			System.out.print("선택:"); select = sc.nextInt();
			if(select == 1) {}
			else if(select == 2) {}
			else if(select == 3) {}
			else if(select == 4) {System.out.println("프로그램종료");break;}		
		}
	}
}
class Fan{
	
	boolean power = false;  //전원
	boolean rotate = false;  //회전
	int fanSpeed =0; //0꺼짐 1:약풍 2:중풍 3:강풍
	boolean headControl = false;  //위아래
	String name = "토네이도선풍기";
	
	void power() { System.out.println("전원이켜졌습니다!!");}
	void rotate() { System.out.println("회전모드입니다.");}
	void fanSpeed() { System.out.println("현재 미풍입니다.");}
	void headControl() { System.out.println("높이조절변경");}
	void name() { System.out.println("이름이 변경되었습니다.");}
}