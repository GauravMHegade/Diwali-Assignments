package Day_2;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("Exiting...");
                break; // stop the loop when 0 is entered
            }

            int originalNum = num;
            int reversedNum = 0;

            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num = num / 10;
            }

            if (originalNum == reversedNum) {
                System.out.println(originalNum + " is a Palindrome");
            } else {
                System.out.println(originalNum + " is NOT a Palindrome");
            }
        }

        sc.close(); // always close Scanner to prevent resource leak
    }
}
