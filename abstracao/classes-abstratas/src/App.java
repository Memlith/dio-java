
public class App {
    public static void main(String[] args) throws Exception {
        var male = new Person();
        male.name = "Caio";
        male.age = 21;
        var female = new Person();
        female.name = "Jamilly";
        female.age = 20;
        System.out.println("Male name: "+male.name);
        System.out.println("Male age: "+male.age);
        System.out.println("Female name: "+female.name);
        System.out.println("Female age: "+female.age);
    }
}
