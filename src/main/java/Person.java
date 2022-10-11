import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
public class Person {
    private final String firstName, lastName;
    private final int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public static Set<String> uniqueNames (List<Person> people) {
        return people
                .stream()
                .filter(Objects::nonNull)
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .filter(name -> name.matches("^[aA-zA\\d]*$"))
                .collect(Collectors.toSet());
    }
}
