package com.random.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.random.model.Persona;

public interface PersonRepository  extends JpaRepository<Persona, Integer>{
@Query(value="select top 40 * from prospective_buyer order by prospective_buyer_key asc", nativeQuery = true)
public List<Persona> readNames01();
}
