import java.util.Scanner;

public class EstruturaIfElse {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Digite seu nome:");
    var name = scanner.next();
    System.out.println("Digite sua idade:");
    var age = scanner.nextInt();
    System.out.println("Voce e emancipado? (s/n):");
    var isEmancipated = scanner.next().equalsIgnoreCase("s");

    var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
    var message = canDrive ? name + ", voce pode dirigir! \n" : name + ", voce nao pode dirigir! \n";
    // * ? (else operator)
    // * (bloco true) : (bloco false)

    if (age >= 18) {
      System.out.printf("%s, voce pode dirigir! \n", name);
    } else if (age >= 16 && isEmancipated) {
      System.out.printf("%s, voce pode dirigir! \n", name);
    } else {
      System.out.printf("%s, voce nao pode dirigir! \n", name);
    }
    System.out.println("Fim do if else.");

    System.out.println(message);
    System.out.println("Fim do programa");
  }
}
