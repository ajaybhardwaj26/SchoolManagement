package SchoolManagement;

public class Student {
// This class is responsible for keeping the track of students fees, name, grade and fees paid
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * To create a new student by initialising
	 * Fees for every student is $30,000
	 * Fees paid initially is 0
	 * @param id - unique id for the student
	 * @param name - name of the student
	 * @param grade - grade of the student
	 */
	public Student(int id, String name, int grade) 
	{
		this.id = id;
		this.name = name;
		this.grade = grade;
		feesPaid = 0; // you can also write this.feesPaid = 0
		feesTotal = 30000; // you can also write this.feesTotal = 0		
	}
	
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public int getFeesPaid()
	{
		return feesPaid;
	}
	
	public int getFeesTotal()
	{
		return feesTotal;
	}
		
	
	public int getRemainingFees()
	{
		return feesTotal-feesPaid;
	}
	
	// @override
	public String toString() {
		return "Student's name :" +name+
				" Total fees paid so far $" +feesPaid;
				 
	}
	
	
	/** Used to update the student's grade
	 *  
	 * @param grade - new grade of the student
	 */	
	 
	public void setGrade(int grade)
	{
		this.grade = grade;
		
	}
	
	/** 
	 * Keep adding the fees to the feesPaid variable because a student can paid his/her fees in installments.
	 * Add the fees to the fees paid.
	 * the school is going to receive the funds.
	 * 
	 * @param fees - the fees that the student pays
	 */
	
	public void payFees(int fees)
	{
		feesPaid += fees;		// because a student can paid his/her fees in installments.
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	
}
