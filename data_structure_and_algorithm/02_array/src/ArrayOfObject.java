// Person class with properties name and age
class Person {
    private final String name;
    private final int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ArrayOfObject {
    public static void main(String[] args) {
        // Creating an array of Person objects with a size of 3
        Person[] people = new Person[3];

        // Initializing each element in the array with a Person object
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 35);

        // Loop through the array to display information for each person
        for (int i = 0; i < people.length; i++) {
            System.out.print("Person " + (i + 1) + ": ");
            people[i].displayInfo();
        }
    }
}
