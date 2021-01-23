package jan22;

import java.util.Scanner;

public class FibonacciLimit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int a=0,b=1,c;
		while(a<num) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		sc.close();
	}
}
