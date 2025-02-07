import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.println("Input an integer: ");
		String word = s.nextLine();
		System.out.println(Integer.parseInt(5 + word) + 5);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s = new Scanner(System.in);
		System.out.println("Input a number: ");
		String word = s.nextLine();
		System.out.println(Double.parseDouble(4 + word + 3) + 3.4);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s = new Scanner(System.in);
		System.out.println("Input a boolean: ");
		String word = s.nextLine();
		System.out.println(!Boolean.parseBoolean(word));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s = new Scanner(System.in);
		System.out.println("Input an integer: ");
		String word = s.nextLine();
		System.out.println((char)(Integer.parseInt(word + 3) + 2));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.println("Input an integer: ");
		String word = s.nextLine();
		System.out.println((double)(Integer.parseInt(word + 1) / 2));
	}

	public static void q6() {
		//Write question 6 code here
		Scanner s = new Scanner(System.in);
		System.out.println("Input a number: ");
		String word = s.nextLine();
		System.out.println((int)(Double.parseDouble(1 + word)));
	}

}
