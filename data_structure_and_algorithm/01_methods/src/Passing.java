public class Passing {

    public static void main(String[] args) {
        // Example with Primitive Type (int)
        int num = 10;
        System.out.println("Before modifyPrimitive method: " + num);
        modifyPrimitive(num);
        System.out.println("After modifyPrimitive method: " + num);

        // Example with Object Type (Person)
        Person person = new Person("John");
        System.out.println("\nBefore modifyObject method: " + person.getName());
        modifyObject(person);
        System.out.println("After modifyObject method: " + person.getName());

        // Example to demonstrate reassigning the object
        reassignObject(person);
        System.out.println("After reassignObject method: " + person.getName());
    }

    // Method to modify a primitive type (demonstrates pass by value)
    public static void modifyPrimitive(int num) {
        num = 20; // This change only affects the local copy in the method
        System.out.println("Inside modifyPrimitive method: " + num);
    }

    // Method to modify an object type (demonstrates pass by value for object references)
    public static void modifyObject(Person person) {
        person.setName("Alice"); // Modifies the original object
        System.out.println("Inside modifyObject method: " + person.getName());
    }

    // Method to reassign an object (shows that reassigning doesn't affect original reference)
    public static void reassignObject(Person person) {
        person = new Person("Bob"); // Only changes the local reference in this method
        System.out.println("Inside reassignObject method: " + person.getName());
    }
}

// Person class with a single property (name)
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
