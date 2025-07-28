
public class App {

    public static void main(String[] args) throws Exception {
        var person = new Person("Caio");

        System.out.println(person);
        System.out.println(person.name());
        System.out.println(person.age());

    }
}
