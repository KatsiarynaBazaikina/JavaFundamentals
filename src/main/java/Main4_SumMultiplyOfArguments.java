public class Main4_SumMultiplyOfArguments {
    public static void main(String[] args) {
        // Задание 4: Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

        int[] sumOfArgument = {1, 2, 5, -8, -5,-2};
        int sum = 0;
        for (int i = 0; i < sumOfArgument.length; i++) {
            sum = sum + sumOfArgument[i];
        }
        System.out.println(sum);

        int multiply = 1;
        for (int i = 0; i < sumOfArgument.length; i++) {
            multiply = multiply*sumOfArgument[i];
        }
        System.out.println(multiply);
    }

}
