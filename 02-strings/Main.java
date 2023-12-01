public class Main {
	public static void firstlesson() {
		// Some string methods
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char letter = 'P';

		System.out.println("The String '" + txt + "' has " + txt.length() + " characters of lenght.");
		System.out.println("This String can be printed as '" + txt.toLowerCase() + "'.");
		System.out.println("The '" + letter + "' is the " + (txt.indexOf(letter) + 1) + "th letter of the alphabet.");
	}

	public static void secondlesson() {
		// Concatination
		String firstName = "Stiven ";
		String lastName = "Felipe";

		System.out.println(firstName.concat(lastName));
	}

	public static void thirdlesson() {
		// Working with concatinations
		int a = 10;
		int b = 20;
		int c = a + b;
		String d = Integer.toString(a) + Integer.toString(b);
		String e = a + Integer.toString(b);

		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

	public static void main(String[] args) {
		// firstlesson();
		// secondlesson();
		thirdlesson();
	}
}