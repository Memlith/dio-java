
import java.util.Scanner;

public class App {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetCleaner petCleaner = new PetCleaner();

    public static void main(String[] args) throws Exception {
        var option = -1;
        do {
            System.out.println("======================== Escolha uma opção ========================");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer maquina com agua");
            System.out.println("3 - Abastecer maquina com shampoo");
            System.out.println("4 - Verificar agua");
            System.out.println("5 - Verificar shampoo");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina-chuveiro");
            System.out.println("8 - Retirar pet da maquina-chuveiro");
            System.out.println("9 - Limpar maquina-chuveiro com agua e shampoo");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 ->
                    petCleaner.showerPet();
                case 2 ->
                    setWater();
                case 3 ->
                    setShampoo();
                case 4 ->
                    verifyWater();
                case 5 ->
                    verifyShampoo();
                case 6 ->
                    checkIfHasPetInCleaner();
                case 7 ->
                    setPetInPetCleaner();
                case 8 ->
                    petCleaner.removePet();
                case 9 ->
                    petCleaner.wash();
                case 0 ->
                    System.exit(option);
                default ->
                    System.out.println("Opção invalida");

            }

        } while (true);
    }

    private static void setWater() {
        System.out.println("Tentando adicionar agua na maquina-chuveiro");
        petCleaner.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando adicionar shampoo na maquina-chuveiro");
        petCleaner.addShampoo();
    }

    private static void verifyWater() {
        var amount = petCleaner.getWater();
        System.out.println("A maquina esta com " + amount + " ml de agua");
    }

    private static void verifyShampoo() {
        var amount = petCleaner.getShampoo();
        System.out.println("A maquina esta com " + amount + " ml de shampoo");
    }

    private static void checkIfHasPetInCleaner() {
        var hasPet = petCleaner.hasPet();
        System.out.println(hasPet ? "Tem pet na maquina-chuveiro" : "Não tem pet na maquina-chuveiro");
    }

    private static void setPetInPetCleaner() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet:");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petCleaner.setPet(pet);
    }
}
