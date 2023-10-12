package Lab2;
import java.util.Scanner;
public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N?");
        double n = scanner.nextInt();
        double rez = 2;
        if (n < 0)
            for (int i = -1; i > n; i--) {
                rez *= 2;
                System.out.println("2^" + (i - 1) + "=" + (1 / rez));
            }
        else {
            for (int i = 1; i < n; i++) {
                rez = rez * 2;
                System.out.println("rezultat " + rez);
            }
        }


    }
}
