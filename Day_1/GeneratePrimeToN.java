package Day_1;

import java.util.Scanner;

public class GeneratePrimeToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");

        for (int num = 2; num <= n; num++) {  
            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(num + " ");
            }
        }
    }
}
