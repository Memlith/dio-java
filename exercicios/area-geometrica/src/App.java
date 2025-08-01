
import java.util.Scanner;

public class App {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        do {
            printMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1 ->
                    calculateCircleArea();
                case 2 ->
                    calculateRectangleArea();
                case 3 ->
                    calculateSquareArea();
                case 0 ->
                    System.out.println("Saindo do programa...");
                default ->
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Menu de Cálculo de Área ---");
        System.out.println("1. Círculo");
        System.out.println("2. Retângulo");
        System.out.println("3. Quadrado");
        System.out.println("0. Sair");
        System.out.print("Escolha uma forma geométrica: ");
    }

    private static void calculateCircleArea() {
        System.out.print("Digite o raio do círculo: ");
        double radius = scanner.nextDouble();
        GeometricForm circle = new Circle(radius);
        System.out.printf("A área do círculo é: %.2f\n", circle.getArea());
    }

    private static void calculateRectangleArea() {
        System.out.print("Digite a altura do retângulo: ");
        double height = scanner.nextDouble();
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        GeometricForm rectangle = new Rectangle(height, base);
        System.out.printf("A área do retângulo é: %.2f\n", rectangle.getArea());
    }

    private static void calculateSquareArea() {
        System.out.print("Digite o lado do quadrado: ");
        double side = scanner.nextDouble();
        GeometricForm square = new Square(side);
        System.out.printf("A área do quadrado é: %.2f\n", square.getArea());
    }
}
