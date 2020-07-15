package com.formacionbdi.microservicios.app.cursos.models.repository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.formacionbdi.microservicios.app.cursos.models.entity.Curso;

public interface CursosRepository extends PagingAndSortingRepository<Curso, Long> {

	@Query("select c from Curso c join fetch c.cursoAlumnos a where a.alumnoId=?1")
	public Curso findCursoByAlumnoId(Long id);

}
