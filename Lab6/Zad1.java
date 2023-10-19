package Lab6;
import java.util.Scanner;
public class Zad1 {
    public static void  main(String args[]) {
        int numberOf5000,  numberOf2000, numberOf1000, numberOf500, numberOf200, numberOf100, numberOf50, numberOf10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        int amount = scanner.nextInt();
        numberOf5000 =  amount / 5000; //кол-во 5 тыс.купюр
        amount %=5000; //остаток
        System.out.println("Кол-во 5 тыс. купюр " +numberOf5000 + " остаток "+ amount);


    }
}
