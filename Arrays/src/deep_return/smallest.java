package deep_return;

import java.util.Scanner;

public class smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of arrays :");
		for(int i=0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
		int min =a[0];
		for(int i=1; i<5; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("The smallest element is :"+min);
			

	}

}
