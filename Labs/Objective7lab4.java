public class Objective7lab4 {
	public static void main(String [] args) {
		//write a program that sums up the numbers from 1 to 20: 1+2+3, etc.//

		int counter = 1;
		int sum = 1;

		while(counter < 20) {
			counter = counter +1;
			sum = counter + sum;
		}
		System.out.println(sum);
	}
}