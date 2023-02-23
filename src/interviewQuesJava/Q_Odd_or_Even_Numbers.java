// Odd or Even Numbers

package interviewQuesJava;

import java.util.Scanner;

public class Q_Odd_or_Even_Numbers {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = reader.nextInt();

		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println("Answer: " + num + " is an odd number");
	}

}
