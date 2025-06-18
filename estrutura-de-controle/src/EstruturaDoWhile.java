import java.util.Scanner;

public class EstruturaDoWhile {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var name = "";
    while (true) {
      System.out.println("Digite um nome: ");
      name = scanner.next();
      System.out.println(name);
      if (name.equalsIgnoreCase("exit"))
        break;
    }
    System.out.println("---");

    var number = 14;
    do {
      System.out.println("Advinhe o numero (1~20): ");
      number = scanner.nextInt();
    } while (number != 14);
    System.out.println("---");

    var i = 0;
    while (args.length > i) {
      System.out.println(args[i]);
      i++;
    }
    System.out.println("---");
    i = 0;
    do {
      System.out.println(args[i]);
      i++;
    } while (args.length > i);
  }
}
