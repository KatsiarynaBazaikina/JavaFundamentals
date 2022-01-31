public class Main5_DefineMonth {
    public static void main(String[] args) {
        // Задание 5: ВВести числа от 1 до 12. Вывести на консоль еназвание месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
        Main5_DefineMonth month = new Main5_DefineMonth(5);
        System.out.println(month.monthByNumber());
    }

    public Main5_DefineMonth(int number) {
        this.number = number;
    }
    private int number;

    public String monthByNumber() {
        switch (number) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Enter value from 1 to 12";

        }
    }
}
