package jan22;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do{
			System.out.println("\nEnter the number: ");
			int i, count=0;
			num = sc.nextInt();
			if(num == 2) {
				System.out.println(+num+" is a prime number!!!");
				continue;
			}
			if(num%2 == 0 || num ==1)
				System.out.println(num+" is not a prime number!!!");
			else {
				for(i=1;i<num/2;i+=2) {
					if(num%i == 0)
						count++;
					if(count>1) {
						System.out.println(+num+" is not a prime number!!!");
						break;
					}
				}
				if(count<=1)
					System.out.println(+num+" is a prime number!!!");
			}
		}while(num!=0);
		
	}

}
