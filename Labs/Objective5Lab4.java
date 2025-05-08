public class Objective5Lab4 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("Please enter a number");

		int userNum = scanner.nextInt();

		if(userNum % 2 == 0) {
			System.out.println("the number is even");
		}
		else if(userNum % 2 != 0) {
			System.out.println("the number is odd");
		}
		scanner.close();
	}
}