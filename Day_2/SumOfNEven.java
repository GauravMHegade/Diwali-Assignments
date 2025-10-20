package Day_2;

import java.util.Scanner;

public class SumOfNEven {

	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum = num * (num + 1);
		System.out.println("Sum of first " + num + " Even number is: " + sum);
		
	}

}
