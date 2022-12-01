package prasad;

public class Bill {
	public static int calculateBill(int units) {

		// Condition to find the charges
		// bar in which the units consumed
		// is fall
		if (units <= 100) {
			return (int) (units * 1.20);
		} else if (units <= 200) {
			return (int) ((100 * 2) + (units - 100) * 2);
		} else if (units <= 300) {
			return (100 * 3) + (units - 200) * 3;
		}

		return 0;
	}

	// Main Code
	public static void main(String args[]) {
		int units = 300;
		System.out.println(" Electricity Bill = ");
		System.out.println(calculateBill(units));
	}
}