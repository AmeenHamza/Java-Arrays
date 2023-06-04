package deep_return;

import java.util.Scanner;

public class Transporse_matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of array :");
		int a[][] = new int[2][2];
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				a[i][j] = sc.nextInt();
		}
	 }
		System.out.println("The elements of array is :");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(a[i][j]+" ");
		}
			System.out.println();
	 }
		System.out.println("The transporse matrix is :");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(a[j][i]+" ");
		}
			System.out.println();
	 }

	}

}
