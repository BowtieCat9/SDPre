public class Objective9Lab3 {
	public static void main(String [] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		int selection;
		

		while(true){
			printMenu();
			selection = keyboard.nextInt();
			if(selection == 1) {
				System.out.print("Hello there");
			}
			else if(selection == 2) {
				System.out.println("Tacos, Ice Cream, and MORE Tacos");
			}
			else if(selection == 3) {
				break;
			}
			System.out.println("Goodbye old friend");
			

		}
		keyboard.close();
	}		
	public static void printMenu() {
		System.out.println("___Menu___");
		System.out.println("1. Say Hello");
		System.out.println("2. List My Favorite Foods");
		System.out.println("3. Exit");
		System.out.println();
	}

	
}