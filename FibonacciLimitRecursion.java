package jan22;

import java.util.Scanner;

public class FibonacciLimitRecursion {

	static int a = 0;
	static int b = 1;
	static int c;
	
	static void fibonacci(int num) {
		if(num>=a) {
			System.out.println(a+" ");
			c = a + b;
			a = b;
			b = c;
			fibonacci(num);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		fibonacci(num);
		sc.close();
	}

}
