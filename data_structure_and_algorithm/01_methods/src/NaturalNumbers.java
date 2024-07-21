import java.util.Scanner;

public class NaturalNumbers {
    public static int naturalSum(int n)
    {
        if (n <= 1)
            return n;
        return n + naturalSum(n - 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        System.out.println("Sum of all natural numbers: " + naturalSum(n));
    }
}
