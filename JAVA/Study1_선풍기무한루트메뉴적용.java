package �ڹ�9_Ŭ��������;

import java.util.Scanner;

public class Study1_��ǳ�⹫�ѷ�Ʈ�޴����� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fan f = new Fan();
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
			if(select == 1) {}
			else if(select == 2) {}
			else if(select == 3) {}
			else if(select == 4) {System.out.println("���α׷�����");break;}		
		}
	}
}
class Fan{
	
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