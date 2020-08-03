package chap1;

import java.util.Scanner;

public class SumForPos {
	//연습문제 자릿수 구하기
	static void no() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("n을 입력하세요: ");
		int n=stdIn.nextInt();
		int no=0;
		
		while(n>0) {
			n /=10;
			no++;
		}
		System.out.print(no+"자리 수입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner stdIn = new Scanner(System.in);
//		
//		int b;
//		
//		System.out.println("b부터 a까지의 차을 구합니다.");
//		System.out.print("a의 값:");
//		int a=stdIn.nextInt();
//		
//		do {
//			System.out.print("b의 값:");
//			b=stdIn.nextInt();
//		}while(b<=a);
//		
//		System.out.print("b-a는"+(b-a)+"입니다.");
//		System.out.println();
		no();
	}

}
