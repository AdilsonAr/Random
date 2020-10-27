package com.random.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.random.model.Persona;
@Repository
public interface PersonRepository  extends JpaRepository<Persona, Integer>{
@Query(value="select top 50 * from prospective_buyer order by prospective_buyer_key asc", nativeQuery = true)
public List<Persona> readNames01();

@Query(value="select top 2000 * from prospective_buyer order by prospective_buyer_key desc", nativeQuery = true)
public List<Persona> readNames02();
}
