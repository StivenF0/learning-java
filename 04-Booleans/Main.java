public class Main {
	public static void firstlesson() {
		// First if
		int age = 18;

		if (age > 18) {
			System.out.println("Not minor");
			return;
		}
		System.out.println("Minor");
	}

	public static void secondlesson() {
		// Shorthand if
		int age = 16;
		String isMinor = age > 18 ? "Not minor" : "Minor";
		System.out.println(isMinor);
	}

	public static void main(String[] args) {
		// firstlesson();
		secondlesson();
	}
}