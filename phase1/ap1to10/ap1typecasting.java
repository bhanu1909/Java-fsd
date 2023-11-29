package phase1;

public class ap1typecasting {

	public static void main(String[] args) {
		 
		// Implicit type casting (Widening)
        int Value = 10;
        double doubleValue = Value; //  casting int to double
        System.out.println("Implicit Casting " + doubleValue);

        // Explicit type casting (Narrowing)
        double anotherValue = 15.75;
        int anotherIntValue = (int) anotherValue; //  casting double to int
        System.out.println("Explicit Casting " + anotherIntValue);

	}

}
