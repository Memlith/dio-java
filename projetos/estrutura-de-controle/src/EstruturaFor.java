import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Tente acertar um numero de 1 a 10");
        for (;;) {
            System.out.printf("-> ");
            var number = scanner.nextInt();
            if (number == 9) {
                System.out.println("Voce acertou");
                break;
            }
        }
        System.out.printf("\n\n");

        for (var i = 0; i < 20; i++) {
            if ((i) % 2 == 0)
                continue;
            System.out.println(i + 1);
            System.out.println("par");

        }
        System.out.printf("\n\n");

        for (var arg : args) {
            System.out.println(arg);
        }
        System.out.printf("\n\n");

        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + " - " + args[i]);

        }
        System.out.printf("\n\n");
    }
}
