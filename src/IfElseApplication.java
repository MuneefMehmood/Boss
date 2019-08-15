import java.util.Scanner;

public class IfElseApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b = 40;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your number");
		a = input.nextInt();

	System.out.println("--------WHILE LOOP------------------------");

		while (a <= b) {
			System.out.println("How many times has it printed---> " + a);
			++a;
		}

	System.out.println("-----below is doWhile LOOP---------------------------");

		do {
			System.out.println("At least prints it once ---> " + a);

		} while (a <= b);

	System.out.println("-----below is FOR LOOP---------------------------");

		for (int i = 0; i <= b; i++) {
			System.out.println("PRINTING FOR LOOP HERE -->  " + i);
		}

	System.out.println("-----below is ifElse---------------------------");

		if (a >= b) {
			System.out.println("You Passed The Exam");
		} else {
			System.out.println("Unfortunately,you failed to pass the exam");

		}
		
		
		
		

	}
}
