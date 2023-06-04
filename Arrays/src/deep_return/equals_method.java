package deep_return;

import java.util.Arrays;
import java.util.Scanner;

public class equals_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For equals method we need two arrays
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arrays :");
		int size,i,size1;
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the size of second arrays :");
		int a1[] = new int[size];
		size1 = sc.nextInt();
		System.out.print("Enter the elements of arrays :");
		for(i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element of second array :");
		for(i=0; i<size1; i++) {
			a1[i] = sc.nextInt();
		}
		System.out.print("The elements of arrays is :");
		for(i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("The elements of arrays is :");
		for(i=0; i<size; i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		boolean b=Arrays.equals(a, a1);
		System.out.print("The value of dono array are equal .\n"+b);
	
		
		

	}

}
