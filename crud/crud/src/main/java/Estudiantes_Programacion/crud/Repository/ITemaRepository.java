package Estudiantes_Programacion.crud.Repository;

import Estudiantes_Programacion.crud.Model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema,Long> {
}
