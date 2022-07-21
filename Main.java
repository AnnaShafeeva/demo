public class Main {

    public static void main(String[] args){
        int a = 3;
        int b = 4;
        int c = a + b;
        System.out.println("Сумма: " + c);

        int d = Commands.sum(5, 9);
        System.out.println("Сумма: " + (c + d));

        int i = 5;
        System.out.println(i + Commands.sum(89, 8));

        int g = 10;
        System.out.println(g);


    }
}
