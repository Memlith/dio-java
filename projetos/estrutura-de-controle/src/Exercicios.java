import java.util.Scanner;

public class Exercicios {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.printf("Exercicio 1.\nTabuada\n");
    System.out.println("Digite um numero para ver a tabuada:");
    var number = scanner.nextInt();
    for (var i = 0; i < 10; i++) {
      System.out.printf("%s x %s = %s \n", number, i + 1, (number * (i + 1)));
    }
    System.out.println("Fim Tabuada");

    System.out.printf("\nExercicio 2.\nCalculo IMC\n");
    System.out.println("Digite sua altura:");
    var height = scanner.nextFloat();

    System.out.println("Digite seu peso:");
    var weight = scanner.nextFloat();

    var imc = weight / (height * height);

    if (imc <= 18.5)
      System.out.println("Abaixo do peso");
    else if (imc < 24.9)
      System.out.println("Peso ideal");
    else if (imc < 29.9)
      System.out.println("Levemente acima do peso");
    else if (imc < 34.9)
      System.out.println("Obesidade Grau I");
    else if (imc < 39.9)
      System.out.println("Obesidade Grau II (Severa)");
    else if (imc >= 40)
      System.out.println("Obesidade III (Mórbida)");
    else
      System.out.println("Altura ou Peso invalido");
    System.out.println("Fim Calculo IMC");

    System.out.printf("\nExercicio 3.\nPar e Impar\n");

    System.out.println("Digite um primeiro numero:");
    var firstNumber = scanner.nextInt();

    System.out.println("Digite um segundo numero maior que o primeiro numero:");
    var secondNumber = scanner.nextInt();

    System.out.println("Escolha Par ou Impar (p/i):");
    var even = scanner.next().equalsIgnoreCase("p");

    for (var i = secondNumber; i >= firstNumber; i--) {
      if (even) {
        if (i % 2 == 0)
          System.out.println(i);
      } else if (i % 2 != 0)
        System.out.println(i);
    }
    System.out.println("Fim Par e Impar");

    System.out.printf("\nExercicio 4.\nResto Zero\n");
    System.out.println("Digite um numero inicial:");
    var initialNumber = scanner.nextInt();
    int newNumber;
    do {
      System.out.println("Digite um numero (maior ou igual ao inicial):");
      newNumber = scanner.nextInt();
      if (newNumber < initialNumber) {
        System.out.println("Numero ignorado, menor que o inicial.");
        continue;
      }
    } while (newNumber % initialNumber != 0);

    System.out.println("Fim Resto Zero");

    System.out.println("Fim do Programa");
  }
}
