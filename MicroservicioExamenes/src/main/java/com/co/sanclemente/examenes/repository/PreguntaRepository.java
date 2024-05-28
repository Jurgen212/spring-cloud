package com.co.sanclemente.examenes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.sanclemente.common.entity.Pregunta;


@Repository
public interface PreguntaRepository extends CrudRepository<Pregunta, Long> {
}
