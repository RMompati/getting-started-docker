package com.eroldme.mouse.api;

import com.eroldme.mouse.person.Gender;
import com.eroldme.mouse.person.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/", "api/v1/people"})
public class Api {

  @GetMapping
  public List<Person> getPeople() {
    return List.of(
            new Person("Patco", "Erold", Gender.Male),
            new Person("Angular", "TypeScript", Gender.Male),
            new Person("Dell", "Machine", Gender.Female),
            new Person("Mouse", "API", Gender.Other),
            new Person("Morebodi", "Motaung", Gender.Male)
    );
  }
}
