package Day_1;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A number:");
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println(num+" is Even");
		} else {
			System.out.println(num+" is Odd");
		}

	}

}
