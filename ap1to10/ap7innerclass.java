package phase1;

class Outer {
	class Inner {
		public void display()
		{
			System.out.println("Class inside a class");
		}
	}
}

public class ap7innerclass {
	public static void main(String[] args) {
		Outer.Inner input = new Outer().new Inner();
		input.display();
}
}