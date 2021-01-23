package jan22;

import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: "+a+"\nb: "+b);
		sc.close();
	}

}
