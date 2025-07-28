import java.util.Scanner;

public class EstruturaSwitchCase {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.printf("Dias da Semana \nInforme um numero de 1 ate 7 -> ");
    var option = scanner.nextInt();
    var message = switch (option) {
      case 1, 7 -> {
        var day = option == 1 ? "Sabado" : "Domingo";
        yield String.format("%s e final de semana", day);
      }
      case 2 -> "Segunda";
      case 3 -> "Terca";
      case 4 -> "Quarta";
      case 5 -> "Quinta";
      case 6 -> "Sexta";
      default -> "Opcao invalida";
    };

    System.out.println(message);
  }
}