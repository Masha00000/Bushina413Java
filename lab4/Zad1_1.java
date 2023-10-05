package lab4;

import java.util.Scanner;

public class Zad1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 9: ");// ввод чисел с клавиатуры 
        int n = sc.nextInt();
        switch (n) {
            case 0 -> System.out.println(n + " Ноль");
            case 1 -> System.out.println(n + " Один");
            case 2 -> System.out.println(n + " Два");
            case 3 -> System.out.println(n + " Три");
            case 4 -> System.out.println(n + " Четыре");
            case 5 -> System.out.println(n + " Пять");
            case 6 -> System.out.println(n + " Шесть");
            case 7 -> System.out.println(n + " Семь");
            case 8 -> System.out.println(n + " Восемь");
            case 9 -> System.out.println(n + " Девять");
            default -> System.out.println("Ошибка. Введите число от 0 до 9");
        }
    }
}
