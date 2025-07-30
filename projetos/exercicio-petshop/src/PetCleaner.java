
public class PetCleaner {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet = null;

    public PetCleaner() {

    }

    public void showerPet() {
        if (this.pet == null) {
            System.out.println("Não tem nenhum pet na maquina-chuveiro, coloque o pet na maquina");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + this.pet.getName() + " está limpo");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("Capacidade maxima de agua da maquina-chuveiro atingida!");
            return;
        }

        water += 2;
        System.out.println("Agua adicionada a maquina-chuveiro!");

    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("Capacidade maxima de shampoo da maquina-chuveiro atingida!");
            return;
        }
        shampoo += 2;
        System.out.println("Shampoo adicionado a maquina-chuveiro!");
    }

    public int getWater() {
        return this.water;
    }

    public int getShampoo() {
        return this.shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A maquina esta suja, precisa limpar antes de colocar um novo pet");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " ja esta na maquina-chuveiro");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na maquina-chuveiro");
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi retirado da maquina-chuveiro");
        this.pet = null;
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina foi limpa");
    }

}
