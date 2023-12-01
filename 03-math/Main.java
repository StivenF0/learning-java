
// Using math
public class Main {
	public static void firstlesson() {
		// Max and min
		int a = Math.max(5, 10),
			b = Math.min(5, 10);

		System.out.println(a);
		System.out.println(b);
	}

	public static void secondlesson() {
		// sqrt
		double a = Math.sqrt(9),
			b = Math.sqrt(4);

		System.out.println(a);
		System.out.println(b);
	}

	public static void thirdlesson() {
		// Random number 1 - 10.
		int myNum = (int) (Math.random() * 11);
		System.out.println(myNum);
	}

	public static void main(String[] args) {
		// firstlesson();
		// secondlesson();
		// thirdlesson();
	}
}