package Lab5;

public class Zad1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

// Находим индексы минимального и максимального элемента
        int minIndex = 0;
        int maxIndex = 0;
        int minValue = array[minIndex];
        int maxValue = array[maxIndex];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

// Меняем местами минимальный и максимальный элемент
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

// Вывод результата
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
