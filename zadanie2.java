package lab3;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);      // сканнер для ввода значения
        System.out.print("Введи m: ");
        int m = scanner.nextInt();
        double res = 0, n = 1;
        for (int i=1; i<= m; i++) { // цикл  для того чтобы прогнать все значения
            if (i%2 == 0) {         // если остаток от деления на 2 == 0
                res -= n/i;         // от результата отнять n/i
            }
            else {
                res += n/i;         // иначе прибавить n/i
            }

        }
        System.out.print("Результат: " +res);
    }
}

