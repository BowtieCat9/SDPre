import java.util.Scanner;

public class Objective9Lab4 {
	public static void main(String [] args) {
	Scanner kb = new Scanner(System.in);
	double num1, num2;

	System.out.println("Please enter a number: ");
	num1 = kb.nextDouble();
	System.out.println("Please enter another number: ");
	num2 = kb.nextDouble();

	double average = findAverage(num1, num2);
	System.out.println("The average of " + num1 + " and " + num2 + " = " + average);

	kb.close();
	}

	public static double findAverage(double x, double y) {
		double answer = (x + y) / 2;
		return answer;
	}
}