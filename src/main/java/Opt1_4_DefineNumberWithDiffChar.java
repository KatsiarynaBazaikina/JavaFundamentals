import java.util.Arrays;

public class Opt1_4_DefineNumberWithDiffChar {
    public static void main(String[] args) {
        // Задание 4: Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
        String[] string = {"123", "538", "567", "00000000000", "11", "8888", "44445567"};
        int[] countDiffNumb = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            char[] array = new char[string[i].length()];
            array = string[i].toCharArray();

            int sumOfDifferentNumbers = 1;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] != array[j + 1]) {
                    sumOfDifferentNumbers++;
                } else ;
            }
            countDiffNumb[i] = sumOfDifferentNumbers;
        }
        // System.out.println("Количество разных цифр в заданных числах: "+ Arrays.toString(countDiffNumb));

        int min = countDiffNumb[0];
        for (int i = 0; i < countDiffNumb.length; i++) {
            if (countDiffNumb[i] < min) {
                min = countDiffNumb[i];
            }
        }
        // System.out.println("Наименьшее количество разных цифр: "+min);

        for (int i = 0; i < string.length; i++) {
            int arrayLength = string[i].length();
            char[] array = new char[arrayLength];
            array = string[i].toCharArray();
            int sumOfDifferentNumbers = 1;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] != array[j + 1]) {
                    sumOfDifferentNumbers++;
                } else ;
            }

            if (sumOfDifferentNumbers == min) {
                System.out.println("Первое число с минимальным количеством разных цифр: " + string[i]);
                break;
            }
        }
    }

}
