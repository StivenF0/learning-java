// The name of the main class needs to be equals to the filename.
public class Main {
	/*
	main: necessary param for the function in java.
	void: means that the function returns nothing.
	string[]: is the arguments that the function is receiving.
	"": is for the strings.
	'': is for the chars.
	*/
	public static void firstlesson() {
		System.out.println("Hello World!");
	}

	/*
	Java can print numbers normally and mathematical expressions.
	*/
	public static void secondlesson() {
		System.out.println(5*2);
	}

	public static void thirdlesson() {
		// Defining a variable string
		String name = "Stiven";

		// Defining a variable int
		int age = 19;

		// Defining a constant string
		final String job = "Programmer";

		System.out.println("Name:");
		System.out.println(name);
		System.out.println("Age:");
		System.out.println(age);
		System.out.println("Job:");
		System.out.println(job);

		/*
		Examples:
			int myNum = 5;
			float myFloatNum = 5.99f;
			char myLetter = 'D';
			boolean myBool = true;
			String myText = "Hello";
		*/

		// To display variables with text its possible to just add "+".
		System.out.println("Name: " + name);
	}

	public static void fourthlesson() {
		// Its possible to define multiple variables in one line and assign his values simultaneosly.
		int a = 1, b = 2, c = 3;
		int d, e, f;
		d = e = f = 4;
		System.out.println("a");
		System.out.println(a);
		System.out.println("b");
		System.out.println(b);
		System.out.println("c");
		System.out.println(c);
		System.out.println("d");
		System.out.println(d);
		System.out.println("e");
		System.out.println(e);
		System.out.println("f");
		System.out.println(f);
	}

	public static void fifthlesson() {
		// Its really good practice to use cammel case into Java.
		String myVar = "Thats a var";
		String myvar = "Thats another var";

		System.out.println(myVar);
		System.out.println(myvar);
	}

	public static void sixthlesson() {
		// Java uses several types.
		int myNum = 5;               // Integer (whole number)
		float myFloatNum = 5.99f;    // Floating point number
		char myLetter = 'D';         // Character
		boolean myBool = true;       // Boolean
		String myText = "Hello";     // String

		// Primitive types
		/*
			byte	| 1 byte  | Stores whole numbers from -128 to 127
			short	| 2 bytes |	Stores whole numbers from -32,768 to 32,767
			int	    | 4 bytes |	Stores whole numbers from -2,147,483,648 to 2,147,483,647
			long	| 8 bytes |	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
			float	| 4 bytes |	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
			double	| 8 bytes |	Stores fractional numbers. Sufficient for storing 15 decimal digits
			boolean	| 1 bit	  | Stores true or false values
			char	| 2 bytes |	Stores a single character/letter or ASCII values
		*/

		// In example using byte to store very short numbers is good.
		byte simpleByte = 100;
		System.out.println(simpleByte);
	}

	public static void seventhlesson() {
		// "hello world" in ASCII
		char h = 104;
		char e = 101;
		char l = 108;
		char o = 111;
		char w = 119;
		char r = 114;
		char d = 100;
		System.out.println("" + h + e + l + l + o + " " + w + o + r + l + d);
	}

	public static void eighthlesson() {
		// Java has auto convertion of types called "casting".
		int myInt = 9;
		double myDouble = myInt;
		System.out.println(myInt);       // Output -> 9
		System.out.println(myDouble);    // Output -> 9.0

		// At the same time it has "narrow casting" which means manual convertion
		double myNewDouble = 9.78d;
		int myNewint = (int) myNewDouble;
		System.out.println(myNewDouble); // Output -> 9.78
		System.out.println(myNewint);    // Output -> 9
	}

	public static void ninethlesson() {
		// Java has several operators.
		/*
		+  -> Sum:       x + x
		-  -> Subtract:  x - x
		*  -> Multiply:  x * x
		/  -> Divide:    x / x
		++ -> Increment: ++x
		-- -> Decrement: --x
		%  -> Modulus:   x % x


		== -> Equals:    x == x
		!= -> Different: x != x

		&& -> And:       x && x
		|| -> Or:        x || x
		!  -> Not:       !x

		And so on!
		*/
		System.out.println(2 == 2); // true
	}

	public static void main(String[] args) {
		// Uncomment which lession do you wanna see!

		// firstlesson();
		// secondlesson();
		// thirdlesson();
		// fourthlesson();
		// fifthlesson();
		// sixthlesson();
		// seventhlesson();
		// eighthlesson();
		// ninethlesson();
	}
}