package jan22;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0,j = 1;
		int res = 0;
		int count = 0;
		while(num > count) {
			System.out.println(i+" ");
			res = i + j;
			i = j;
			j = res;
			count++;
		}
		sc.close();
	}
}
