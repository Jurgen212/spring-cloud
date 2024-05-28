package com.co.sanclemente.usuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.sanclemente.common.entity.Alumno;


@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
