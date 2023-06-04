package deep_return;

import java.util.Scanner;

public class find_biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of arrays :");
		for(int i=0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("The value of arrays is :");
		for(int i=0; i<5; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int max =a[0];
		for(int i=1; i<5; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("The biggest element is :"+max);
			
	}

}
