package deep_return;

import java.util.Scanner;

public class Star_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	System.out.println("ENter ");
		for(int i=0; i<5; i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
				for(int k=i; k<5; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		

	}


