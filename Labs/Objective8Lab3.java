public class Objective8Lab3 {
	public static void main(String [] args) {
		int counter = 1;
		int num1;

		for (num1 = 1; num1 <= 20; num1++){
			
			if(counter % 2 == 0){
				System.out.println(counter + " is even");
			}
			else if(counter % 2 != 0) {
				System.out.println(counter + " is odd");
			}
			counter = num1 + 1;

		}

	}
}