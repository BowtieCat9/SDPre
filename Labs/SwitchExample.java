public class SwitchExample {
	public static void main(String [] args){
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade = keyboard.nextLine();
		

		switch (grade) {
		case "A":
		case "a":
			System.out.println("Fantastic Job!");
			break;
		case "B":
		case "b":
			System.out.println("Good Job!");
			break;
		case "C":
		case "c":
			System.out.println("mehh...you're doing okay.");
			break;
		case "D":
		case "d":
			System.out.println("Please schedule a conference.");
			break;
		case "F":
		case "f":
			System.out.println("Start finishing homework and showing up to class");
			break;
		default:
			System.out.println("Invalid grade.");

		}
	}
}