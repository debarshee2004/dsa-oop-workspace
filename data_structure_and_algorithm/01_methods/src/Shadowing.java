// Superclass
class Parent {
    // Static method in Parent class
    public static void display() {
        System.out.println("Display method in Parent class");
    }
}

// Subclass
class Child extends Parent {
    // Static method in Child class (shadowing Parent's display method)
    public static void display() {
        System.out.println("Display method in Child class");
    }
}

// Main class to test method shadowing
public class Shadowing {
    public static void main(String[] args) {
        // Reference of Parent type, pointing to a Parent object
        Parent parentObj = new Parent();
        parentObj.display(); // Calls Parent's display method

        // Reference of Child type, pointing to a Child object
        Child childObj = new Child();
        childObj.display(); // Calls Child's display method

        // Reference of Parent type, pointing to a Child object (method shadowing)
        Parent parentChildObj = new Child();
        parentChildObj.display(); // Calls Parent's display method due to shadowing
    }
}
