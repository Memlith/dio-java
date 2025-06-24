import java.util.Scanner;

public class PadroesDesenvolvimento {

  private final static String WELCOME_MESSAGE = "Bem-Vindo ao Primeiro Programa Java";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(WELCOME_MESSAGE);
    System.out.println("Digite seu nome:");
    var name = scanner.next();
    System.out.println("Digite sua idade:");
    var age = scanner.nextInt();
    //// System.out.println("Olá " + name + ", sua idade é " + age + ".");
    System.out.printf("Olá %s, sua idade é %d.\n", name, age);
  }
}
