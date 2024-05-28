package com.co.sanclemente.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "cursos")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @PrePersist
    public void prePersist() {
        this.createAt = new Date();
    }
    
    @OneToMany(fetch = FetchType.LAZY)
    private List<Alumno> listaAlumno;
    
    
    
    public void addAlumno(Alumno alumno) {
    	this.listaAlumno.add(alumno);
    }
    
    public void removeAlumno(Alumno alumno) {
    	this.listaAlumno.remove(alumno);
    }
    
    
    

	public Curso() {
	}

	public Curso(Long id, Date createAt, List<Alumno> listaAlumno) {
		super();
		this.id = id;
		this.createAt = createAt;
		this.listaAlumno = listaAlumno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public List<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(List<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}
    
    
}
