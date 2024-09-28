/*
 * Module 6 CTA Option 1: Storing an ArrayList I
 * Brian Gunther
 * CSC372: Programming II
 * Colorado State University Global
 * Dr. Vanessa Cooper
 * September 22, 2024
 * 
 */

public class Student {
	private int rollno;
	private String name;
	private String address;
	
	/**
	 * Default constructor for Student class to simplify instantiation
	 * @param rollno
	 * @param name
	 * @param address
	 */
	
	public Student() {
		// create an empty object
	}
	
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	/**
	 * Getter for the roll number
	 * @return the student's roll number
	 */
	public int getRollno() {
		return rollno;
	}
	
	/**
	 * Setter for the roll number
	 * @param rollno
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	/**
	 * Getter for the name
	 * @return the student's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter for the name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter for the address
	 * @return the student's address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Setter for the address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Print the student information to console
	 */
	public void printInfo() {
		System.out.println("Roll Number: " + getRollno());
		System.out.println("Student Name: " + getName());
		System.out.println("Address: " + getAddress());
	}
	
}
