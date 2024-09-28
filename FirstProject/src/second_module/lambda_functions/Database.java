package second_module.lambda_functions;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Person> personList = new ArrayList<>();
    void addPerson(Person person) {
        personList.add(person);
    }
    void printYoungPeopleNames() {

        DatabaseInterface executer = (personList) -> {
            List<Person> filtered = new ArrayList<>();
            for (Person person : personList) {
                if (person.getAge() >= 18 && person.getAge() <= 30) {
                    filtered.add(person);
                }
            }
            filtered.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
            for (Person person : filtered) {
                System.out.println(person.getName());
            }
        };
        executer.execute(personList);

    }
}
