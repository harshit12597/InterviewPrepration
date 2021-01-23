package jan22;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Array length: ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = sc.nextInt();
		}
		int a = arr[0];
		for(int i=1;i<len;i++) {
			if(arr[i]>a)
				a=arr[i];
		}
		System.out.println("Greatest among the above is: "+a);
		sc.close();

	}

}
