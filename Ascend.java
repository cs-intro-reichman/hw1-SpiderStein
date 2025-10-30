// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim1 = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * lim1);
		int b = (int) (Math.random() * lim1);
		int c = (int) (Math.random() * lim1);

		System.out.println(a + " " + b + " " + c);
		int first, second, third;

		first = Math.min(a, b);
		first = Math.min(first, c);

		third = Math.max(a, b);
		third = Math.max(third, c);

		second = a + b + c - first - third;
		System.out.println(first + " " + second + " " + third);
	}
}
