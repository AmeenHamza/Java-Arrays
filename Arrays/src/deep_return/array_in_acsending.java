package deep_return;
import java.util.Scanner;
public class array_in_acsending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size,i,sum=0,temp;
		        int [] arr = new int[5];
        System.out.println("Enter the elements of array :");
        for(i=0; i<5; i++) {
        	arr[i] = sc.nextInt();
        }

        //For sorting loop
        for(i=0; i<5; i++) {
        for(int j=i+1; j<5; j++) {
        	if(arr[i]>arr[j]) {
        		temp = arr[i];
        		arr[i]= arr[j];
        		arr[j] = temp;
        	}
        }
        }
        System.out.print("The elements of array after sorting is :");
        for(i=0; i<5; i++) {
        	System.out.print(arr[i]+" ");
        	}

	}
}