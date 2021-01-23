package jan22;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)){
				System.out.println("Not a palindrome");
				sc.close();
				return;
			}	
		}
		System.out.println("Palindrome");
		sc.close();
	}

}
