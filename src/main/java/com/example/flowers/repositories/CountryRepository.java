package com.example.flowers.repositories;

import com.example.flowers.entities.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Long> {

    @Query("from Country")
    List<Country> getCountries();
}