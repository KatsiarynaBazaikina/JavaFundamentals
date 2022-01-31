import static java.lang.Integer.valueOf;

public class Main2_Reorder {
    // Задание 2: Отобразить в окне консоли аргументы командной строки в обратном порядке.

    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5,9,12,44};
        int[] arrayIntReorder = new int[arrayInt.length];

        int s = arrayInt.length - 1;
        for (int i = 0; i < arrayIntReorder.length; i++) {
            arrayIntReorder[i] = arrayInt[s];
            s = s - 1;
            System.out.println(valueOf(arrayIntReorder[i]));
        }

        System.out.println(); //empty line

        String [] arrayStr = {"one", "two", "three", "four"};
        String [] arrayStrReorder = new String [arrayStr.length];

        int z = arrayStr.length - 1;
        for (int i = 0; i < arrayStrReorder.length; i++) {
            arrayStrReorder[i] = arrayStr[z];
            z = z - 1;
            System.out.println(arrayStrReorder[i]);
        }
    }
}
