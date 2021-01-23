package jan22;

import java.util.Scanner;

public class ArmstrongRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower number: ");
		int low = sc.nextInt();
		System.out.println("Enter higher number: ");
		int high = sc.nextInt();
		int num,temp2,rem;
		while(low<=high) {
			num=low;
			rem=0;
			while(num!=0) {
				temp2 = num%10;
				rem = rem + temp2*temp2*temp2;
				num/=10;
			}
			if(low==rem)
				System.out.println(low+" ");
			low++;
		}
	}

}
