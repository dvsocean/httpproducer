package hello;

import objects.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import services.PersonService;

@ComponentScan("services")
@RestController
public class PersonRestController {

  private final PersonService personService;

  public PersonRestController(PersonService personService) {
    this.personService = personService;
  }

  @GetMapping("/person/{id}")
  public Person findPersonById(@PathVariable("id") Long id) {
    return personService.findPersonById(id);
  }

}
