/*
 * Module 6 CTA Option 1: Storing an ArrayList I
 * Brian Gunther
 * CSC372: Programming II
 * Colorado State University Global
 * Dr. Vanessa Cooper
 * September 22, 2024
 * 
 */

import java.util.Comparator;

/**
 * Compares two student names using the Comparator interface
 */
public class NameComparator implements Comparator<Student>{
	@Override
	public int compare(Student first, Student second) {
		// Compare the two student names and return -1, 0, or 1 to declare their precedence
		return first.getName().compareTo(second.getName());
	}
}
