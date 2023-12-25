package ru.sergsnic.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sergsnic.springcourse.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
