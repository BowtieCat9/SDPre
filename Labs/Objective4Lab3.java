public class Objective4Lab3 {
	public static void main(String[] args) {
		//int birthYear, age, currentYear

		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.println("How old are you?");
		int age = keyboard.nextInt();

		int currentYear = 2025;

		System.out.println("You were born in " + (currentYear - age) + ".");
		keyboard.close();


	}
}