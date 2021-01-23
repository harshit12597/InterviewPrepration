package jan22;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.next().charAt(0);
		if(c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'e'
				|| c == 'A' || c == 'I' || c == 'O' || c == 'U' || c == 'E')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
		sc.close();
	}

}
