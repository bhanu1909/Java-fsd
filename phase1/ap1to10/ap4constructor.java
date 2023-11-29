package phase1;

class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class ap4constructor {

    public static void main(String[] args) {
    	 Person person1 = new Person();
         System.out.println("Person 1 Details:");
         person1.displayDetails();
         System.out.println();

         // Creating objects using parameterized constructor
         Person person2 = new Person("Bhanu", 24);
         System.out.println("Person 2 Details:");
         person2.displayDetails();
         System.out.println();
    }	

}
