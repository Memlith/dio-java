import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {

    System.out.printf("\nDesafio 1\n\n");
    var scanner = new Scanner(System.in);
    var thisYear = 2025;
    System.out.println("Digite seu nome:");
    var name = scanner.next();
    System.out.println("Digite seu ano de nascimento (YYYY):");
    var birthYear = scanner.nextInt();
    var age = thisYear - birthYear;
    System.out.printf("Ola %s, voce tem %d anos! \n", name, age);

    System.out.printf("\nDesafio 2\n\n");
    System.out.println("Digite o tamanho do lado do quadrado:");
    var size = scanner.nextFloat();
    var areaSquare = size * size;
    System.out.printf("A area do Quadrado com tamanho %s x %s e -> %s \n", size, size, areaSquare);

    System.out.printf("\nDesafio 3\n\n");
    System.out.println("Digite o tamanho da base do retangulo:");
    var width = scanner.nextFloat();
    System.out.println("Digite o tamanho da altura do retangulo:");
    var height = scanner.nextFloat();
    var areaRetangle = width * height;
    System.out.printf("A area do Quadrado com tamanho %s x %s e -> %s \n", width, height, areaRetangle);

    System.out.printf("\nDesafio 4\n\n");
    System.out.println("Digite o primeiro nome:");
    var firstName = scanner.next();
    System.out.println("Digite a primera idade:");
    var firstAge = scanner.nextInt();
    System.out.println("Digite o segundo nome:");
    var secondName = scanner.next();
    System.out.println("Digite a segunda idade:");
    var secondAge = scanner.nextInt();
    var ageDiff = firstAge - secondAge;
    System.out.printf("A diferenca de idade de %s com %s anos e de %s com %s anos e de -> %s \n", firstName, firstAge,
        secondName, secondAge, ageDiff);

  }
}
