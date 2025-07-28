
public class App {

    public static void main(String[] args) throws Exception {
        var male = new Person("Caio", 21);
        male.incAge();
        var female = new Person("Jamilly", 20);
        female.incAge();
        System.out.println("Male nome: " + male.getName() + " idade: " + male.getAge());
        System.out.println("Female nome: " + female.getName() + " idade: " + female.getAge());
    }
}
