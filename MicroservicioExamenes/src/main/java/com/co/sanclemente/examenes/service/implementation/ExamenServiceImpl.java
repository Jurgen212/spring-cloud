package com.co.sanclemente.examenes.service.implementation;

import org.springframework.stereotype.Service;

import com.co.sanclemente.common.entity.Examen;
import com.co.sanclemente.common.service.CommonService;
import com.co.sanclemente.common.service.implementation.CommonServiceImpl;
import com.co.sanclemente.examenes.repository.ExamenRepository;


@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements CommonService<Examen> {
}
