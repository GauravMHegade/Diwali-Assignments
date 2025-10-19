package Day_1;

import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A number to find Factorial: ");
		int num = sc.nextInt();
		if (num<=0) {
			System.out.println("Enter a Positive Number");
		}
		else {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result = result*i;
		}
		System.out.println(result);
		}
	}

}
