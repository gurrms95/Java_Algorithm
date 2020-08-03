package chap1;

import java.util.Scanner;

public class SumFor {
	//연습문제Q8
	static void Gauss(int n) {
		//int sum=(1+n)*(n/2);
		//나머지가 1일때 생각하기
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		System.out.println("가우스 덧셈은"+sum);
		
	}
	//연습문제Q9
	static int sumof(int a,int b) {
		int sum=0;
		
		if(a<b) {
		for(int i=a; i<=b; i++)
			sum +=i;
		}
		else {
			for(int i=b; i<=a; i++)
				sum +=i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n= stdIn.nextInt();
		
		System.out.println("a부터 b까지의 합을 구합니다.");
		System.out.print("a의 값: ");
		int a= stdIn.nextInt();
		System.out.print("b의 값: ");
		int b= stdIn.nextInt();
		
		Gauss(n);
		System.out.println(a+"부터"+b+" 까지의 합은: "+sumof(a,b));
		
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum +=i;
			//연습문제 Q7
			if(i==n) {
				System.out.print(i+"="+sum);
				break;
			}
			else {
				System.out.print(i+"+");
			}
		}
		System.out.println();
		System.out.println("1부터"+n+"까지의 합은"+sum+"입니다.");
	}

}
