package chap1;

import java.util.Scanner;

public class SumFor {
	//��������Q8
	static void Gauss(int n) {
		//int sum=(1+n)*(n/2);
		//�������� 1�϶� �����ϱ�
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		System.out.println("���콺 ������"+sum);
		
	}
	//��������Q9
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
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		int n= stdIn.nextInt();
		
		System.out.println("a���� b������ ���� ���մϴ�.");
		System.out.print("a�� ��: ");
		int a= stdIn.nextInt();
		System.out.print("b�� ��: ");
		int b= stdIn.nextInt();
		
		Gauss(n);
		System.out.println(a+"����"+b+" ������ ����: "+sumof(a,b));
		
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum +=i;
			//�������� Q7
			if(i==n) {
				System.out.print(i+"="+sum);
				break;
			}
			else {
				System.out.print(i+"+");
			}
		}
		System.out.println();
		System.out.println("1����"+n+"������ ����"+sum+"�Դϴ�.");
	}

}
