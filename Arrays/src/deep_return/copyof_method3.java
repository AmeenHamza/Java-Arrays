package deep_return;

import java.util.Scanner;
import java.util.Arrays;

public class copyof_method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arrays :");
		int size,i;
		size = sc.nextInt();
		int a[] = new int[5];		
		System.out.print("Enter the elements of arrays :");
		for(i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		//copyof method copy array in second array
		int a1[] = Arrays.copyOf(a,6);
		// last mein koi value print karane k lye
		a1[5] = 500;
		System.out.print(" the elements of arrays is a1[] :");
		for(i=0; i<a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
	

	} 

}
