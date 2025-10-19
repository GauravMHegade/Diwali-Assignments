package Day_1;

import java.util.Scanner;

public class FibSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. Of terms:");
		int num = sc.nextInt();
		int first = 0, second = 1;
		int temp;
		for (int i = 1; i <= num; i++) {
			System.out.println(first);
			temp = first + second;
			first = second;
			second = temp;
			
		}

	}

}
