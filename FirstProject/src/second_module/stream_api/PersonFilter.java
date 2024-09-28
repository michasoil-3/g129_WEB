package second_module.stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class PersonFilter {
    public List<Person> filterPersons(List<Person> persons) {
        return persons.stream().filter(person -> person.getCity().equals("Almaty") && person.getAge() >= 18).collect(Collectors.toList());
    }
}
