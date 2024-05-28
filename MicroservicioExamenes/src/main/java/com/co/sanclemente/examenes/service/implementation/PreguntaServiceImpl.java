package com.co.sanclemente.examenes.service.implementation;

import org.springframework.stereotype.Service;

import com.co.sanclemente.common.entity.Pregunta;
import com.co.sanclemente.common.service.CommonService;
import com.co.sanclemente.common.service.implementation.CommonServiceImpl;
import com.co.sanclemente.examenes.repository.PreguntaRepository;


@Service
public class PreguntaServiceImpl extends CommonServiceImpl<Pregunta, PreguntaRepository> implements CommonService<Pregunta> {
}
