package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("What are the two values that will be averaged?");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		
		int mean = (n1 + n2)/2;
		
		System.out.println("The average of " + n1 + " and " + n2 + " is " + mean);
			}


}
