public class Main1_SayHello {
    // Задание 1: Приветствовать любого пользователя при вводе его имени через командную строку.

    public static void main(String[] args) {
        Main1_SayHello Hello1 = new Main1_SayHello("Alex");
        Hello1.sayHelloToUser();

    }

    public Main1_SayHello(String name){
        this.name = name;
    }
    private String name;
    public void sayHelloToUser (){
        System.out.println("Hello "+name + "!");
    }
}
