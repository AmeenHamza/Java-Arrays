package deep_return;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1- sort()
		//2- equals()
		//3- copyof()
		
		//print arrays in sorted with sort method
		Scanner sc = new Scanner(System.in);
		int i,size;
		System.out.println("Enter the size of arrays :");
		size = sc.nextInt();
		int a[] = new int[size];
		
		
		System.out.println("Enter the elements of arrays");
		for(i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		//For sorting
		Arrays.sort(a);
		System.out.print(" The elements of arrays is :");
		for(i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		
		
		

	}

}
