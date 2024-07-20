import java.util.Scanner;

public class PrimeNumbers {
    private static void PrimePrint(int start, int end) {
        int count;
        for (int i = start; i <= end; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) count ++;
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        PrimePrint(start, end);
    }
}
