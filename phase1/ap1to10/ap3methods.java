package phase1;


public class ap3methods {
	public void printMessage() {
        System.out.println("Yo, Bro!");
        System.out.println();
    }

    public int add(int a, int b) {
        return a + b;
    }

	public static void main(String[] args) {
		ap3methods example = new ap3methods();
        example.printMessage();

        int sum = example.add(5, 7);
        System.out.println("The Sum is " + sum);

	}

}
