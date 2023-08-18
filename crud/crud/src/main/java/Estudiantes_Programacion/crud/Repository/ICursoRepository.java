package Estudiantes_Programacion.crud.Repository;

import Estudiantes_Programacion.crud.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso,Long> {
}
