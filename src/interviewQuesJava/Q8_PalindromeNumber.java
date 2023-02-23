// Q #8) Write a Java Program to find whether a number is palindrome or not

package interviewQuesJava;

import java.util.Scanner;

public class Q8_PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Write a number: ");
		int num = sc.nextInt();

		int reversedNum = 0, remainder;

		// store the number to originalNum
		int originalNum = num;

		// get the reverse of originalNum
		// store it in variable
		while (num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
		}

		// check if reversedNum and originalNum are equal
		if (originalNum == reversedNum) {
			System.out.println("Answer: " + originalNum + " is Palindrome.");
		} else {
			System.out.println("Answer: " + originalNum + " is not Palindrome.");
		}
	}
}
