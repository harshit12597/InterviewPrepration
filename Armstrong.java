package jan22;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem=0,temp;
		int tem = num;
		while(num!=0) {
			temp = num%10;
			rem = rem + temp*temp*temp;
			num/=10;
		}
		if(tem==rem)
			System.out.println("Armstromg");
		else
			System.out.println("Not an Armstromg");
		sc.close();
	}

}
