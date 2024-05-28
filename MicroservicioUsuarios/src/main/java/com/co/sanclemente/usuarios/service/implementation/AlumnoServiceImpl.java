package com.co.sanclemente.usuarios.service.implementation;

import com.co.sanclemente.common.entity.Alumno;
import com.co.sanclemente.common.service.CommonService;
import com.co.sanclemente.common.service.implementation.CommonServiceImpl;
import com.co.sanclemente.usuarios.repository.AlumnoRepository;

import org.springframework.stereotype.Service;


@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements CommonService<Alumno> {
}
