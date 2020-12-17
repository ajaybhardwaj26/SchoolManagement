package SchoolManagement;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher melissa = new Teacher(2, "Melissa", 700);
		Teacher vanderhorn = new Teacher(3, "vanderhorn", 600);
		
		ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
		teacherList.add(lizzy);
		teacherList.add(melissa);
		teacherList.add(vanderhorn);
		
		Student tamara = new Student(1, "Tamara", 4);
		Student rakshith = new Student(2, "Rakshith Vasudev", 12);
		Student rabbi = new Student(3, "Rabbi", 5);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(tamara);
		studentList.add(rakshith);
		studentList.add(rabbi);
		
		//Build a school object with teachers and students..
		School ghs = new School(teacherList, studentList);
		
		//Create a new teacher and add to School's teacher list.
		Teacher meghan = new Teacher(6, "Meghan", 900);
		ghs.addTeacher(meghan);
		
		//Similarly, you can also create a new student and add him/her to the School's student list.
		
		System.out.println("GHS has earned $" +ghs.getTotalMoneyEarned());
		//System.out.println("GHS has teachers:" +ghs.getTeachers());
		//System.out.println("GHS has students:" +ghs.getStudents());
		//System.out.println("GHS has teachers:" +teacherList);
		//for (int i = 0; i < teacherList.size(); i++) {
			//System.out.println("   ArrayList Entry " + i + ": " + teacherList.get(i));
		//}
		tamara.payFees(5000);
		System.out.println("GHS has earned $" +ghs.getTotalMoneyEarned());
		rakshith.payFees(6000);
		System.out.println("GHS has earned $" +ghs.getTotalMoneyEarned());
		
		System.out.println("---------Making GHS PAY SALARY-------------");
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("GHS has spent on salary to " + lizzy.getName()
		+" and now has $" + ghs.getTotalMoneyEarned());
		
		vanderhorn.receiveSalary(vanderhorn.getSalary());
		System.out.println("GHS has spent on salary to " + vanderhorn.getName()
		+" and now has $" + ghs.getTotalMoneyEarned());
		
		System.out.println(rakshith);
		melissa.receiveSalary(melissa.getSalary());
		System.out.println(melissa);
	}

}
