import java.util.Scanner;

public class Opt1_3_CompareWithAverageLength {
    // Задание 3: Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также их длину.
    public static void main(String[] args) {
        System.out.println("Enter integers separated by comma");
        Scanner scanner = new Scanner(System.in);
        String forArray = scanner.nextLine();
        String[] array = forArray.split(",");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int j = Integer.valueOf(array[i].length());
            sum = sum + j;
        }
        int avgLength = sum / array.length;

        for (int i = 0; i < array.length; i++) {
            if (Integer.valueOf(array[i].length()) > avgLength) {
                System.out.println("Lenght more than average for " + array[i] + ", length is  " + array[i].length());
            } else ;
        }

        for (int i = 0; i < array.length; i++) {
            if (Integer.valueOf(array[i].length()) < avgLength) {
                System.out.println("Lenght less than average for " + array[i] + ", length is  " + array[i].length());
            } else ;
        }
    }
}
