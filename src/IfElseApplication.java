import java.util.Scanner;

public class IfElseApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int MarksObtained;
		int PassingMarks;
		
		PassingMarks=40;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Result Of Class");
		
		System.out.println("Input marks scored by u");
		MarksObtained = input.nextInt();
		
		if (MarksObtained>=PassingMarks) {
			System.out.println("You Passed The Exam");
		}else {
			System.out.println("Unfortunately,you failed to pass the exam");
		}
		}
		
		

	}


