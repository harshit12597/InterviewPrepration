package jan22;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		int res = 1;
		while(num>1) {
			res = num*res;
			num--;
		}
		System.out.println("Factorial is: "+res);
	}
}
