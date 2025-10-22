package Day_4;

import java.util.Scanner;

public class Addition {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		System.out.println("Enter a Second Number");
		int num2=sc.nextInt();
		
		int sum;
		
		sum=num + num2;
		
		System.out.println("sum of two number is:"+sum);
		
	}

}