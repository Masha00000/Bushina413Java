package Lab2;
import java.math.BigInteger;
import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.print("N?");

        int f = scanner.nextInt();
        int rez = 1 ;
        for (int i=1; i<=f; i++)
        {rez*=i;
            System.out.println(rez);}
    }
}
