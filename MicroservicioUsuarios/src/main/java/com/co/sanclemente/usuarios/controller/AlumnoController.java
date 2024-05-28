package com.co.sanclemente.usuarios.controller;

import com.co.sanclemente.common.controller.CommonController;
import com.co.sanclemente.common.entity.Alumno;
import com.co.sanclemente.usuarios.service.AlumnoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class AlumnoController extends CommonController<Alumno, AlumnoService> {
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody Alumno alumno) {
        Optional<Alumno> alumnoGuardado = service.findById(id);

        if (alumnoGuardado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        Alumno alumnoActualizado = alumnoGuardado.get();
        alumnoActualizado.setNombre(alumno.getNombre());
        alumnoActualizado.setApellido(alumno.getApellido());
        alumnoActualizado.setEmail(alumno.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoActualizado));
    }
}
