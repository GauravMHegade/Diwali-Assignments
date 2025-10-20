package Day_2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n= sc.nextInt();
		
		int original=n;
		int sum =0;
		int digits=0;
		
		int temp = n;
		while(temp !=0) {
			digits++;
			temp = temp/10;
		}
		temp=n;
		while(temp!=0) {
			int digit = temp%10;
			sum+=Math.pow(digit, digits);
			temp=temp/10;
		}
		if(sum == original) {
			System.out.println("is an Armstrong Number");
			
		}else {
			System.out.println("not a ArmStrong Number");
		}
	}

}