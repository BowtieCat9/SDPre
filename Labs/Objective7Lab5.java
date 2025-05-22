public class Objective7Lab5 {
	public static void main(String [] args){
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		int selection;

		while(true) {
			System.out.println("___Menu___");
			System.out.println("1. Say Hello");
			System.out.println("2. List My Favorite Foods");
			System.out.println("3. Exit");

			selection = keyboard.nextInt();
			if(selection == 1){
				System.out.println("Hello There");
			}
			else if(selection == 2) {
				System.out.println("Spaghetti, Soup, and Tacos");
			}
			else if(selection == 3) {
				break;
			}
			System.out.println("Goodbye");
			
		}
		keyboard.close();


		}
		
	}