import java.util.Scanner;

public class MethodBasics {

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
        /*
            <access_modifier> <return_type> <method_name>( list_of_parameters )
            {
                //body
                return statement;
            }
         */
        Scanner sc = new Scanner(System.in);

        float a, b;                 // Inputs
        float sum, sub, mul, div;   // Output of the methods

        System.out.print("Enter the value of a: ");
        a = sc.nextFloat();
        System.out.print("Enter the value of b: ");
        b = sc.nextFloat();

        // Calling the methods declared above.
        sum = Sum(a, b);
        sub = Sub(a, b);
        mul = Mul(a, b);
        div = Div(a, b);

        System.out.println("The Addition of the numbers " + a + " and " + b + " is: " + sum);
        System.out.println("The Subtraction of the numbers " + a + " and " + b + " is: " + sub);
        System.out.println("The Multiplication of the numbers " + a + " and " + b + " is: " + mul);
        System.out.println("The Division of the numbers " + a + " and " + b + " is: " + div);
    }
    /*
        OUTPUT:
        Enter the value of a:25
        Enter the value of b:5
        The Addition of the numbers 25.0 and 5.0 is: 30.0
        The Subtraction of the numbers 25.0 and 5.0 is: 20.0
        The Multiplication of the numbers 25.0 and 5.0 is: 125.0
        The Division of the numbers 25.0 and 5.0 is: 5.0
     */
}