// Q #8) Write a Java Program to find whether a string is palindrome or not.

package interviewQuesJava;

import java.util.Scanner;

public class Q8_PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Write a word: ");
		String str = sc.nextLine();

		String reverseStr = "";

		int strLength = str.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println("Answer: " + str + " is a Palindrome String.");
		} else {
			System.out.println("Answer: " + str + " is not a Palindrome String.");
		}
	}

}
