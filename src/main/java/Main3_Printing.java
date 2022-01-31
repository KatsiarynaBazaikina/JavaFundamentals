import static java.lang.String.valueOf;

public class Main3_Printing {
    // Задание 3: Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

    public static void main(String[] args) {
        int[] array = {1, 7, 9, -5, 0, 33};
        for (int i = 0; i < array.length; i++) {
            System.out.println(valueOf(array[i]));
        }
        System.out.println(); //empty line

        for (int i = 0; i < array.length; i++) {
            System.out.print(valueOf(array[i]));
        }
    }
}
