import java.util.Scanner;

public class MethodsWithParametersExample {
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		double num1, num2;
		System.out.println("Please enter one decimal number: ");
		num1 = kb.nextDouble();
		System.out.println("Please enter another decimal number: ");
		num2 = kb.nextDouble();

		double answer = findSum(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + answer);


	}
	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}
}