import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите курс доллара:       ");
        float exch_rate = in.nextFloat();

        System.out.print("Введите количество рублей:  ");
        float rubs = in.nextFloat();

        System.out.printf("Итого: %.2f долларов", rubs / exch_rate);
    }
}