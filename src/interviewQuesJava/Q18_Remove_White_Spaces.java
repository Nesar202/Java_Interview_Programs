// Q #18) Write a Java Program to remove all white spaces from a string with using replace().

package interviewQuesJava;

public class Q18_Remove_White_Spaces {

	public static void main(String[] args) {

		String str1 = "Saket Saurav        is a QualityAna    list";

		// 1. Using replaceAll() Method

		String str2 = str1.replaceAll("\\s", "");

		System.out.println(str2);

	}
}
