package services;

import java.util.HashMap;
import java.util.Map;

import objects.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

  private final Map<Long, Person> personMap;

  public PersonService() {
    personMap = new HashMap<>();
    personMap.put(1L, new Person(1L, "Jason", "Hobbs"));
    personMap.put(2L, new Person(2L, "Emma", "Choplin"));
    personMap.put(3L, new Person(3L, "Anna", "Carolina"));
  }

  public Person findPersonById(Long id) {
    return personMap.get(id);
  }

}
