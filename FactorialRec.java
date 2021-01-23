package jan22;

import java.util.Scanner;

public class FactorialRec {

	public static int factorial(int num) {
		if(num == 1)
			return num;
		num = num*factorial(num-1);
		return num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		System.out.println("Factorial of "+num+" is: "+factorial(num));
		sc.close();
	}

}
