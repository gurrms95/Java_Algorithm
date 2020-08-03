package chap5;

import java.util.Scanner;

public class Hanoi {

	static void move(int no,int x ,int y) {
		if(no>1)
			move(no-1,x,6-x-y);
		
		System.out.println("����["+no+"]��"+x+"��տ���"+y+"������� �ű�");
		
		if(no>1)
			move(no-1,6-x-y,y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.print("������ ����: ");
		int n= stdIn.nextInt();
		
		move(n,1,3);
	}

}