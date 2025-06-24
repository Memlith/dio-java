import java.util.Scanner;

public class OperadoresAtribuicao {
  public static void main(String[] args) {
    // Exemplo 1
    var scanner = new Scanner(System.in);
    System.out.println("Quanto e 2 + 2?");
    var result = scanner.nextInt();
    var isRight = result == 4;
    System.out.printf("O resultado e 4, voce acertou? ( %s ) \n", isRight);
    var isWrong = result != 4;
    System.out.printf("voce errou? ( %s ) \n", isWrong);

    // Exemplo 2
    System.out.println("Quantos anos voce tem?");
    var age = scanner.nextInt();
    System.out.println("Voce e emancipado?");
    var isEmancipated = scanner.nextBoolean();
    var canDrive = age >= 18 || (isEmancipated && age >= 16);
    System.out.printf("Voce pode dirigir? ( %s ) \n", canDrive);

  }

}
