package deep_return;

import java.util.Scanner;

public class sum_with_for_each_loop {
	//nhi horaha h each loop se

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size,sum=0,i;
		System.out.println("Enter the size of elements of arrays :");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of arrays :");
		for(i=0;i<size; i++) {
			arr[i] = sc.nextInt();
		}
		for(i=0;i<size; i++) {
	        System.out.println("The elements of arrays is :"+arr[i]);	
			sum = arr[i] +sum;
		}
		System.out.println("The sum of array elements is :"+sum);
		

	}

}
