// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
		String name1 = args[2];
		String name2 = args[1];
		String name3 = args[0];
		double bill = Double.parseDouble(args[3]);
		double split = Math.ceil(bill / 3);
		System.out.printf("Dear %s, %s, and %s: pay %.1f Shekels each.%n", 
		                  name1, name2, name3, split);
	}
}
