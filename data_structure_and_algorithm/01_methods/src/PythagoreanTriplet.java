import java.util.Scanner;

public class PythagoreanTriplet {
    private static boolean PythagoreanCheck(int a, int b, int c) {
        return (a * a) == (b * b + c * c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the three sides: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean check = PythagoreanCheck(a, b, c);
        if (check){
            System.out.println("Yes this are correct.");
        } else {
            System.out.println("No this are not correct.");
        }
    }
}
