import java.util.Scanner;

public class OperadoresAritmeticos {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Informe o primeiro numero:");
    var value1 = scanner.nextInt();
    System.out.println("Informe o segundo numero:");
    var value2 = scanner.nextInt();
    System.out.printf("%s + %s = %s \n", value1, value2, value1 + value2);
    System.out.printf("%s / %s = %s \n", value1, value2, value1 / value2);
    System.out.printf("%s %% %s = %s \n", value1, value2, value1 % value2);
    var value3 = value1 + value2;
    value3 += value3;
    System.out.println(value3);
    System.out.println(--value3); // * executa o -- ANTES de printar
    System.out.println(value3++);// * executa o ++ DEPOIS de printar
  }
}