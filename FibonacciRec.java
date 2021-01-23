package jan22;

import java.util.Scanner;

public class FibonacciRec {

	static int i = 0;
	static int j = 1;
	static int k = 0;
	
	static void fibonacci(int num) {
		if(num>0) {
			System.out.println(i+"");
			k = i + j;
			i = j;
			j = k;
			fibonacci(num-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		fibonacci(num);
	}

}
