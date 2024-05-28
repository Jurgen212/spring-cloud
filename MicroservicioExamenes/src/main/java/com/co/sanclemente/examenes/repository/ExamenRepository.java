package com.co.sanclemente.examenes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.sanclemente.common.entity.Examen;


@Repository
public interface ExamenRepository extends CrudRepository<Examen, Long> {
}
