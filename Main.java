import java.util.Scanner;

public class Main {
    static void process(int value) {
        if (value <= 0) {
            System.out.println(value );
        } else {
            System.out.println(value );
            process(value - 5);
            System.out.println(value );
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N sayısı = ");
        int value = inp.nextInt();

        process(value);
    }
}