public class Opt1_5_DefineNumberWithOnlyEvenOrEvenEqualsOdd {
    // Задание 5: Найти количество чисел, содержащих только четные цифры а среди оставшихся - количество чисел с равным числом четных и нечетных цифр.
    public static void main(String[] args) {
        String string = "2221,55,56,66,200000,7986,6666";
        String[] st = string.split(",");
        // System.out.println(st.length);
        int evenOnly = 0;
        int evenSameAsOdd  = 0;
        for (int i = 0; i < st.length; i++) {
            //System.out.println(i);
            int countEven = 0;
            int countOdd=0;
            int n = st[i].length();
            int m = Integer.parseInt(st[i]);
            while (n > 0) {
                if (m % 2 == 0) {
                    countEven++;
                    n = n - 1;
                    m = m / 10;
                } else if (m % 2 != 0) {
                    n = n - 1;
                    m = m / 10;
                    countOdd++;
                }
            }
            if (countEven == st[i].length()) {
                evenOnly++;
            } else if (countEven==countOdd){
                evenSameAsOdd++;
            }else;
        }  System.out.println("Amount of numbers with only even: "+evenOnly);
        System.out.println("Amount of numbers with even=odd: "+evenSameAsOdd);
    }
}