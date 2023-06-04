package deep_return;

import java.util.Scanner;

public class delete_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,loc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements :");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("Enter the elements of arrays :");
		for(i=0; i<size;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter array location :?");
		loc = sc.nextInt();
		for(i=loc; i<size-1; i++) {
			a[i] = a[i+1];
		}
		size--;
		System.out.print("The elements after deleting is :");
		for(i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
