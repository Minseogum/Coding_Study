package 자바9_클래스연습;

import java.util.Scanner;

public class Study2_기능구현 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fan2 f = new Fan2();
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
			if(select == 1) {
				System.out.println("현재 회전이 꺼져있습니다.");
				System.out.print("선풍기를 회전하시겠습니까?(y,n):"); 
				String ok = sc.next();
				if(ok.equals("y") || ok.equals("Y"))
				{
					System.out.println("\n선풍기 회전이 시작합니다.\n");
					f.rotate = true;
				}else
				{
					System.out.println("\n잘못입력해서! 회전 미동작!\n");
				}			
				
			}
			else if(select == 2) {
				System.out.println("현재속도가 꺼짐 입니다.");
				System.out.print("풍속설정(0.꺼짐,1.약풍,2.중풍,3.강풍):"); 
				int ok = sc.nextInt();
				if(ok==0)
				{
					System.out.println("\n선풍기가 멈춤니다.\n");f.fanSpeed = 0;					
				}else if(ok==1)
				{
					System.out.println("\n약풍으로 동작합니다.\n");f.fanSpeed = 1;
				}else if(ok==2)
				{
					System.out.println("\n중풍으로 동작합니다.\n");f.fanSpeed = 2;
				}else if(ok==3)
				{
					System.out.println("\n강풍으로 동작합니다.\n");f.fanSpeed = 3;
				}				
			}
			else if(select == 3) {
				System.out.println("현재 아래 고정 입니다.");
				System.out.print("헤드를 올리시겠습니까?(y,n):"); 
				String ok = sc.next();
				if(ok.equals("y") || ok.equals("Y"))
				{
					System.out.println("\n선풍기 헤드가 위로 올라갑니다.\n");
					f.headControl = true;
				}else
				{
					System.out.println("\n잘못입력해서! 회전 미동작!\n");
				}	
			}
			else if(select == 4) {System.out.println("프로그램종료");break;}		
		}
	}
}
class Fan2{
	
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