package Day_4;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number of Rows");
		int rows=sc.nextInt();
		
		for(int i=1; i<=rows; i++) {
			for(int j=i;j<rows;j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print(k + " ");
				
			}
			System.out.println();
		}
		
	}

}
