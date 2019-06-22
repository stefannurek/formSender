package com.akademiakodu.demo.repository;

import com.akademiakodu.demo.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {


}

