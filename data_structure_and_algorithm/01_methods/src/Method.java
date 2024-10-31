public class Method {
    public static void main(String[] args) {
        // Creating an object of MethodExamples to call instance methods
        Method example = new Method();

        int answer = functionName(5, 10);
        System.out.println("The return from the function is " + answer);

        // Calling a static method
        displayStaticMessage();

        // Calling an instance method
        example.displayInstanceMessage();
    }

    // The Function is a logic abstraction of code where we break down sections of code into its
    // own logic. In this example the function is taking two numbers and returning a value(sum).
    public static int functionName(int i, int j) {
        return i + j;
    }

    // Static Method: A method that belongs to the class, not any object instance.
    // Can be called without creating an instance of the class.
    public static void displayStaticMessage() {
        System.out.println("This is a static method.");
    }

    // Instance Method: A method that belongs to an object instance of the class.
    // Requires creating an object of the class to call it.
    public void displayInstanceMessage() {
        System.out.println("This is an instance method.");
    }
}