import java.util.ArrayList;

public class Student {
	private ArrayList<Exam.LetterGrade> myGrades;
	private int stuId;
	public Student()
	{	myGrades = new ArrayList<Exam.LetterGrade>();
	}
	public void addExamGrade(int x)
	{	
		if (x >= 90) 
			myGrades.add(Exam.LetterGrade.A);
	}
	public String toString()
	{	return myGrades.toString();}
	
	public static void main(String[] args) 
	{	
		Student sam = new Student();
		sam.addExamGrade(92);
		sam.addExamGrade(98);
		System.out.println(sam);
		// Iterate over all possible exam letter grades
		for (Exam.LetterGrade x : Exam.LetterGrade.values())
			System.out.println(x);
	}

}
