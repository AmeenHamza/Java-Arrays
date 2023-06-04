package deep_return;

import java.util.Arrays;

public class equals_vs_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		
		if(a==b) {
			System.out.println("Both are equals");
		}
		else {
			System.out.println("Both are not equals");
		}
//In this method the answer is not equals because == signs are deal with identifier like a[] b[]
		// this does not work with data
	*/
		int a[] = {1,2,2,4,5};
		int b[] = {1,2,3,4,5};
		
		//equals method() work as parameter compared both data values
		
		if(Arrays.equals(a, b)) {
			System.out.println("Both are equals");
		}
		else {
			System.out.println("Both are not equals");
		}

		
	}

}
