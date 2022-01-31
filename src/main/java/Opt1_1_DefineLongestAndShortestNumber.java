import java.util.Scanner;

public class Opt1_1_DefineLongestAndShortestNumber {
    // Задание 1: Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void main(String[] args) {
        System.out.println("Enter integers separated by comma");
        Scanner scanner = new Scanner(System.in);
        String forArray = scanner.nextLine();

        String[] array = forArray.split(",");
        int[] array2 = new int[array.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(array[i]);
        }
        int longest = 0;
        int a = 0;
        for (int i = 0; i < array2.length; i++) {
            int length = String.valueOf(array2[i]).length();
            if (length > longest) {
                longest = length;
                a = array2[i];
            } else ;
        }
        System.out.println("The longest is " + a + ", it contains " + longest + " characters.");

        int shortest = forArray.length();   //правильно ли так?
        int sh = array2.toString().length();
        int b = array2[0];
        for (int i = 0; i < array2.length; i++) {
            int length = String.valueOf(array2[i]).length();
            if (length < shortest) {
                shortest = length;
                b = array2[i];
            } else ;
        }
        System.out.println("The shortest is " + b + ", it contains " + shortest + " character(s).");
    }
}
