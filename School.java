package SchoolManagement;

import java.util.ArrayList;

/**
 * There are many teachers, many students. We did not use arrays so as to keep no. of teachers/students to be flexible.
 * Implements teachers and students using an ArrayList.
 * @author Ajay Bhardwaj
 *
 */
public class School {
	
	private ArrayList<Teacher> teachers;
	private ArrayList<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * 
	 * @param teachers - ArrayList of teachers in the school
	 * @param students - ArrayList of students in the school
	 */
	public School(ArrayList<Teacher> teachers, ArrayList<Student> students)
	{
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}

	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	/** Below function will support an addition of a teacher to an existing School object
	 * Adds a teacher to the school
	 * @param teacher - the teacher to be added
	 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	/**
	 * 
	 * @return - the list of students in the school.
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	/** Below function will support an addition of a student to an existing School object
	 * Adds a student to the school	 * 
	 * @param student - the student to be added
	 */
	public void addStudent(Student student) {
		students.add(student);
	}
	
	/**
	 * 
	 * @return - the total money earned by the school
	 */

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	/**
	 * Add the total money earned by the school
	 * @param MoneyEarned - the money that is supposed to be added 
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
	
	/** 
	 * 
	 * @return - the total money spent by the school
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	/**
	 * update the money that is spent by the school which is the salary given by the school to its teachers.
	 * @param moneySpent -the money spent by the school 
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned-= moneySpent;		
	}

	
 
}
