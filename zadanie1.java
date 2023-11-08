package lab3;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 100:");
        int n = sc.nextInt();
        if (n > 0 && n < 100) { //Проверяем условие n
            if (n > 2) {
                System.err.println("Решений нет");
            }
            for (int i = 1; i <= 100; i++) {
                for (int j = 1; j <= 100; j++) {
                    for (int k = 1; k <= 100; k++) {
                        double a = Math.pow(i, n);// Записать каждое число в степень
                        double b = Math.pow(j, n);
                        double c = Math.pow(k, n);
                        if (a + b == c) {         // Если условие выполняется
                            System.out.println(i + " ^ " + n + " + " + j + " ^ " + n + " = " + k + " ^ " + n);
                        }
                    }
                }
            }
        } else {
            System.err.println("Решений нет");
            return;
        }
    }
}