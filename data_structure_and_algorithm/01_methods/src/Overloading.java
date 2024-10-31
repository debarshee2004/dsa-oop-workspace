public class Overloading {

    public static void main(String[] args) {
        // Creating an object of OverloadingExample
        Overloading example = new Overloading();

        // Calling overloaded methods with different parameters
        example.printInfo("Debarshee");
        example.printInfo("Debarshee", 21);
        example.printInfo("Debarshee", 21, "Kolkata");
    }

    // Overloaded method with one parameter (name)
    public void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Overloaded method with two parameters (name and age)
    public void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method with three parameters (name, age, and location)
    public void printInfo(String name, int age, String location) {
        System.out.println("Name: " + name + ", Age: " + age + ", Location: " + location);
    }
}
