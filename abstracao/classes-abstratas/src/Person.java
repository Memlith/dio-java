
import java.time.OffsetDateTime;

public class Person {

    private final String name;

    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void incAge() {
        if (this.lastYearAgeInc == OffsetDateTime.now().getYear()) {
            return;
        }
        this.age++;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();

    }
}
