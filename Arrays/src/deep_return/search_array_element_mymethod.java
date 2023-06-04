package deep_return;

import java.util.Scanner;

public class search_array_element_mymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size ,i,count =0;
		System.out.println("Enter the size of arrays :");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the element which you want to search :");
		int n = sc.nextInt();
		System.out.println("Enter the elements of arrays :");
		for(i=0; i<size; i++) { //The first loop work with taking user input from user
			a[i] = sc.nextInt();
		}
		System.out.print("The elements of arrays is :");
		for(i=0; i<size; i++) { //Seond loop is used for printing the element of arrays
			System.out.print(a[i]+" ");
			if(a[i]==n) {
				count++;
			}
			}
		System.out.println();
		System.out.println("The search element is "+count+" times found");


	}

}
