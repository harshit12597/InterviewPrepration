package jan22;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number: ");
		int num = sc.nextInt();
		int rev = 0,temp;
		while(num!=0){
			temp= num%10;
			rev=rev*10 + temp;
			num=num/10;
		}
		System.out.println("Reversed number is: "+rev);
		sc.close();
	}

}
