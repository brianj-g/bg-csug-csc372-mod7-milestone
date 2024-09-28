/*
 * Module 6 CTA Option 1: Storing an ArrayList I
 * Brian Gunther
 * CSC372: Programming II
 * Colorado State University Global
 * Dr. Vanessa Cooper
 * September 22, 2024
 * 
 */

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Use a selection sort algorithm to sort objects using Comparator classes
 */
public class Sort {
	/**
	 * Uses selection sort to sort based on either name or ID, depending on whether a NameComparator or IdComparator is passed.  
	 * 	This method does not need to return a value 
	 * 	because the ArrayList is passed directly to it by reference.
	 * @param student
	 * @param nameCompare
	 */
	public static void sortObjects(ArrayList<Student> student, Comparator<Student> studentCompare){
		Student tmpStudent;
		
		// Outer loop keeps track of position in the array
		for (int i = 0; i < student.size() -1; ++i) {
			int minIndex = i;
			// Inner loop locates the index of the minimum value between i and the end of the list
			for (int j = i + 1; j < student.size(); ++j) {
				// The Comparator object passed by the caller determines whether the name or roll number is compared here
				if (studentCompare.compare(student.get(j), student.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			
			// Perform a swap of i and minIndex to place the minimum value at location i
			tmpStudent = student.get(i);
			student.set(i, student.get(minIndex));
			student.set(minIndex, tmpStudent);
		}
	}
}
