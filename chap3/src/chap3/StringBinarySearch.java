package chap3;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		String[] x= {
				"abstract", "assert", "boolean", "break", "byte",
				"case", "catch", "char", "char", "class", "const",
				"continue", "default", "do", "double", "else"
		};
		
		System.out.print("���ϴ� Ű���带 �Է��ϼ���:");
		
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx<0)
			System.out.println("�ش� Ű���尡 �����ϴ�.");
		else
			System.out.println("�ش� Ű����� x["+idx+"]�� �ֽ��ϴ�.");
	}

}
