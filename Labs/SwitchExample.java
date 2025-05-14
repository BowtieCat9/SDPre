public class SwitchExample {
	public static void main(String [] args){
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade = keyboard.nextLine();
		

		switch (grade) {
		case "A":
			System.out.println("Fantastic Job!");
			break;
		case "B":
			System.out.println("Good Job!");
			break;
		case "C":
			System.out.println("mehh...");
			break;
		case "D":
			System.out.println("Please schedule a conference.");
			break;
		case "F":
			System.out.println("Start finishing homework and showing up to class");
			break;
		default:
			System.out.println("Invalid grade.");

		}
	}
}