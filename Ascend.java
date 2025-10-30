// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim1 = Integer.parseInt(args[0]);
		int num1 = (int) (Math.random() * lim1);
		int num2 = (int) (Math.random() * lim1);
		int num3 = (int) (Math.random() * lim1);

		System.out.println(num1 + " " + num2 + " " + num3);

		int first, second, third;
		if (num1 <= num2 && num1 <= num3) {
			first = num1;
			if (num2 <= num3) {
				second = num2;
				third = num3;
			} else {
				second = num3;
				third = num2;
			}
		} else if (num2 <= num1 && num2 <= num3) {
			first = num2;
			if (num1 <= num3) {
				second = num1;
				third = num3;
			} else {
				second = num3;
				third = num1;
			}
		} else {
			first = num3;
			if (num1 <= num2) {
				second = num1;
				third = num2;
			} else {
				second = num2;
				third = num1;
			}
		}
		System.out.println(first + " " + second + " " + third);
	}
}
