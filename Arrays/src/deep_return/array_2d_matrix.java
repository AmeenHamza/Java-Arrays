package deep_return;

import java.util.Scanner;

public class array_2d_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2d_array
		Scanner sc = new Scanner(System.in);
		int z[][] = new int[3][3];
		System.out.print("Enter array elements :");
		//for printing two d arrays we use nested loop
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++){ //colums
				z[i][j] = sc.nextInt();
				}
		}
		System.out.print("Matrix is :\n");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
			System.out.print(z[i][j]+" ");
		}
			System.out.println();
		}
		

	}

}
