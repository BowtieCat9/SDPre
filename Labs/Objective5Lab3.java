public class Objective5Lab3 {
	public static void main(String[] args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int userNum = 0;

		System.out.println("Please enter a number: ");
		int intInput = scanner.nextInt();
		

		if(userNum > intInput) {
			System.out.println(" the number is negative");
		}
		else if(userNum == intInput) {
			System.out.println("The number equals 0");
		}
		else if(userNum < intInput) {
			System.out.println("the number is positive");
		}
		scanner.close();

	}
}