package Day_1;

import java.util.Scanner;

public class CheckIsPrime {
	
	static boolean isprime(int num) {
		
		if(num == 0 || num == 1) {
			return false;
		}
		
		for (int i = 2; i < num ; i++) {
			if (num%i==0) {
				return false;
			} else {
				return true;
			}
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		if (isprime(num)) {
			System.out.println(num+" is a Prime number");
		} else {
			System.out.println(num+" is not a Prime number");
		}
		

	}

}
