//Q #7) Write a Java Program to find whether a number is prime or not.

package interviewQuesJava;

import java.util.Scanner;

public class Q7_Prime_or_Not {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = scanner.nextInt();
		scanner.close();

		boolean isPrime = true;

		if (number <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}
}
