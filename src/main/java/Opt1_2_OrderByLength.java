import java.util.Scanner;

public class Opt1_2_OrderByLength {

    // Задание 2: Вывксти числа в порядке возрастания (убывания) из длины.
    public static void main(String[] args) {
        System.out.println("Enter integers separated by comma");
        Scanner scanner = new Scanner(System.in);
        String forArray = scanner.nextLine();

        String[] array = forArray.split(",");
        int[] array2 = new int[array.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(array[i]);
        }
// Bubble sort
        for (int i = array2.length - 1; i > 0; i--) {
            for (int z = 0; z < i; z++) {
                if (array[z].length() > array[z + 1].length()) {
                    String ar = array[z];
                    array[z] = array[z + 1];
                    array[z + 1] = ar;
                } else ;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        for (int i = array2.length - 1; i > 0; i--) {
            for (int z = 0; z < i; z++) {
                if (String.valueOf(array2[z]).length() < String.valueOf(array2[z + 1]).length()) {
                    int ar = array2[z];
                    array2[z] = array2[z + 1];
                    array2[z + 1] = ar;
                } else ;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
