package com.co.sanclemente.cursos.service.implementation;

import org.springframework.stereotype.Service;

import com.co.sanclemente.common.entity.Curso;
import com.co.sanclemente.common.service.CommonService;
import com.co.sanclemente.common.service.implementation.CommonServiceImpl;
import com.co.sanclemente.cursos.repository.CursoRepository;


@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CommonService<Curso> {
}
