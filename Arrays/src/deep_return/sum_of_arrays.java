package deep_return;

import java.util.Scanner;

public class sum_of_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In this class we write a code to some the elements of arrays
		Scanner sc = new Scanner(System.in);
		int size ,i,sum =0;
		System.out.println("Enter the size of arrays :");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements of arrays :");
		for(i=0; i<size; i++) { //The first loop work with taking user input from user
			a[i] = sc.nextInt();
		}
		System.out.print("The elements of arrays is :");
		for(i=0; i<size; i++) { //Seond loop is used for printing the element of arrays
			System.out.print(a[i]+" ");
			sum = a[i] +sum;
			}
		System.out.println();
		System.out.print("The sum of array elements is "+sum);


	}

}
