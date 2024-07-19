import java.util.Scanner;

public class MethodsUsingSwitchCase {

    // Basic methods which all return "float" datatype.
    public static float Sum(float a, float b) {
        return (a + b);
    }
    public static float Sub(float a, float b) {
        return (a - b);
    }
    public static float Mul(float a, float b) {
        return (a * b);
    }
    public static float Div(float a, float b) {
        return (a / b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a, b;                 // Inputs
        float sum, sub, mul, div;   // Output of the methods

        System.out.print("Enter the value of a: ");
        a = sc.nextFloat();
        System.out.print("Enter the value of b: ");
        b = sc.nextFloat();

        int choice;
        System.out.println("Enter the choice: ");
        System.out.println("1. Addition of two numbers");
        System.out.println("2. Subtraction of two numbers");
        System.out.println("3. Multiplication of two numbers");
        System.out.println("4. Division of two numbers");
        System.out.print(">> ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                sum = Sum(a, b);
                System.out.println("The Addition of the numbers " + a + " and " + b + " is: " + sum);
                break;
            case 2:
                sub = Sub(a, b);
                System.out.println("The Subtraction of the numbers " + a + " and " + b + " is: " + sub);
                break;
            case 3:
                mul = Mul(a, b);
                System.out.println("The Multiplication of the numbers " + a + " and " + b + " is: " + mul);
                break;
            case 4:
                div = Div(a, b);
                System.out.println("The Division of the numbers " + a + " and " + b + " is: " + div);
                break;
        }
    }
    /*
        OUTPUT:
        Enter the value of a: 25
        Enter the value of b: 5
        Enter the choice:
        1. Addition of two numbers
        2. Subtraction of two numbers
        3. Multiplication of two numbers
        4. Division of two numbers
        >> 3
        The Multiplication of the numbers 25.0 and 5.0 is: 125.0
     */
}