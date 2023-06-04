package deep_return;

import java.util.Scanner;

public class insert_element_inarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int loc,item,size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		size = sc.nextInt();
		int a[] = new int[size+1];
		
		System.out.print("Enter the value of arrays :");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter array location :");
		loc = sc.nextInt();
		System.out.println("Enter new element :");
		item = sc.nextInt();
		for(int i=size; i>loc; i--) { //this loop is work for empty a location of array insert location
			a[i] = a[i-1];
		}
		a[loc] = item;
		size++;
		System.out.print("The elements of array is :");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
			
			
		


	}

}
