// Q #10) Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.

package interviewQuesJava;

import java.util.ArrayList;

public class Q10_ArrayList_using_Loops {


			ArrayList names = new ArrayList();
			names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");
	        names.add("David");

	        // Using a for-loop
	        System.out.println("Using a for-loop:");
	        for (int i = 0; i < names.size(); i++) {
	            System.out.println(names.get(i));
	        }

	        // Using a while-loop
	        System.out.println("Using a while-loop:");
	        int i = 0;
	        while (i < names.size()) {
	            System.out.println(names.get(i));
	            i++;
	        }

	        // Using an advanced for-loop (for-each loop)
	        System.out.println("Using an advanced for-loop:");
	        for (String name : names) {
	            System.out.println(name);
	        }
	    }
	}
