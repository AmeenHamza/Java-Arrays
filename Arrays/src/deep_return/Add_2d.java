package deep_return;

import java.util.Scanner;

public class Add_2d {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		System.out.println("Enter the first array elements");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				a[i][j] = sc.nextInt();
		}
	 }
		System.out.println("Enter the second array elements :");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				b[i][j] = sc.nextInt();
		}
	 }
		System.out.print("The elements of first array is :\n");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(a[i][j]+" ");
		}
			System.out.println();
	 }
		
		System.out.print("The elements of second array is :\n");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(b[i][j]+" ");
		}
			System.out.println();
	 }
		
		int c[][] = new int[2][2];
		System.out.println("The sum of 2d-array is :");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
		}
			System.out.println();
	 }
		



	}

}
