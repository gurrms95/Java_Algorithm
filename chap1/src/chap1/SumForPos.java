package chap1;

import java.util.Scanner;

public class SumForPos {
	//�������� �ڸ��� ���ϱ�
	static void no() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("n�� �Է��ϼ���: ");
		int n=stdIn.nextInt();
		int no=0;
		
		while(n>0) {
			n /=10;
			no++;
		}
		System.out.print(no+"�ڸ� ���Դϴ�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner stdIn = new Scanner(System.in);
//		
//		int b;
//		
//		System.out.println("b���� a������ ���� ���մϴ�.");
//		System.out.print("a�� ��:");
//		int a=stdIn.nextInt();
//		
//		do {
//			System.out.print("b�� ��:");
//			b=stdIn.nextInt();
//		}while(b<=a);
//		
//		System.out.print("b-a��"+(b-a)+"�Դϴ�.");
//		System.out.println();
		no();
	}

}
