package �ڹ�9_Ŭ��������;

import java.util.Scanner;

public class Study2_��ɱ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fan2 f = new Fan2();
		int select;		
		
		System.out.println("[[[ ��ǳ�� �������� ]]]");
		System.out.println("��ǳ��� : " + f.name);
		System.out.println("����: "+f.power+" / ȸ��: "+f.rotate);
		System.out.println("�ӵ�: "+f.fanSpeed+" / ����: "+f.headControl);
		System.out.println("1.�����ѱ�");
		System.out.println("2.����");
		System.out.print("����:"); select = sc.nextInt();
		if(select == 1) { 
			System.out.println("\n��ǳ�������� �����ϴ�!\n");
			f.power = true;}
		else if(select == 2) {System.out.println("���α׷�����");}	
		
		while(f.power)
		{
			System.out.println("[[[ ��ǳ�� �������� ]]]");
			System.out.println("��ǳ��� : " + f.name);
			System.out.println("����: "+f.power+" / ȸ��: "+f.rotate);
			System.out.println("�ӵ�: "+f.fanSpeed+" / ����: "+f.headControl);
			System.out.println("1.ȸ������");
			System.out.println("2.�ӵ�����");
			System.out.println("3.��������");
			System.out.println("4.����");
			System.out.print("����:"); select = sc.nextInt();
			if(select == 1) {
				System.out.println("���� ȸ���� �����ֽ��ϴ�.");
				System.out.print("��ǳ�⸦ ȸ���Ͻðڽ��ϱ�?(y,n):"); 
				String ok = sc.next();
				if(ok.equals("y") || ok.equals("Y"))
				{
					System.out.println("\n��ǳ�� ȸ���� �����մϴ�.\n");
					f.rotate = true;
				}else
				{
					System.out.println("\n�߸��Է��ؼ�! ȸ�� �̵���!\n");
				}			
				
			}
			else if(select == 2) {
				System.out.println("����ӵ��� ���� �Դϴ�.");
				System.out.print("ǳ�Ӽ���(0.����,1.��ǳ,2.��ǳ,3.��ǳ):"); 
				int ok = sc.nextInt();
				if(ok==0)
				{
					System.out.println("\n��ǳ�Ⱑ ����ϴ�.\n");f.fanSpeed = 0;					
				}else if(ok==1)
				{
					System.out.println("\n��ǳ���� �����մϴ�.\n");f.fanSpeed = 1;
				}else if(ok==2)
				{
					System.out.println("\n��ǳ���� �����մϴ�.\n");f.fanSpeed = 2;
				}else if(ok==3)
				{
					System.out.println("\n��ǳ���� �����մϴ�.\n");f.fanSpeed = 3;
				}				
			}
			else if(select == 3) {
				System.out.println("���� �Ʒ� ���� �Դϴ�.");
				System.out.print("��带 �ø��ðڽ��ϱ�?(y,n):"); 
				String ok = sc.next();
				if(ok.equals("y") || ok.equals("Y"))
				{
					System.out.println("\n��ǳ�� ��尡 ���� �ö󰩴ϴ�.\n");
					f.headControl = true;
				}else
				{
					System.out.println("\n�߸��Է��ؼ�! ȸ�� �̵���!\n");
				}	
			}
			else if(select == 4) {System.out.println("���α׷�����");break;}		
		}
	}
}
class Fan2{
	
	boolean power = false;  //����
	boolean rotate = false;  //ȸ��
	int fanSpeed =0; //0���� 1:��ǳ 2:��ǳ 3:��ǳ
	boolean headControl = false;  //���Ʒ�
	String name = "����̵���ǳ��";
	
	void power() { System.out.println("�������������ϴ�!!");}
	void rotate() { System.out.println("ȸ������Դϴ�.");}
	void fanSpeed() { System.out.println("���� ��ǳ�Դϴ�.");}
	void headControl() { System.out.println("������������");}
	void name() { System.out.println("�̸��� ����Ǿ����ϴ�.");}
}