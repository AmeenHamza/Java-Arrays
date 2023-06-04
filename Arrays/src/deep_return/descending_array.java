package deep_return;

import java.util.Scanner;

public class descending_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []a = new int[5];
		System.out.println("Enter the elements of array :");
		for(int i=0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		int temp;
		for(int i=0; i<5 ; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp = a[i]; //when the value of i is 0 the value which at o index stored in temp;2
					a[i] = a[j]; // the j loop is work 0+1 index value stored in a[j]'3
					a[j] = temp; //the value of temp stored in a[j],2
				}
			}
		}
				System.out.print("The elements after decsending order is : ");
				for(int i=0; i<5; i++) {
					System.out.print(a[i]+" ");
				}
					
				}
			
}	

	


