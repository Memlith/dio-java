
import java.util.List;
import java.util.function.Function;

public class App {

    public static void main(String[] args) throws Exception {
        List<User> users = List.of(new User("Jamilly", 20),
                new User("Caio", 21),
                new User("Marcos", 20),
                new User("Rebeca", 21));
        printStringValue(User::name, users);
        printStringValue(Record::toString, users);
        printStringValue(user -> String.valueOf(user.age()), users);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
