package Estudiantes_Programacion.crud.Service;

import Estudiantes_Programacion.crud.Dto.Curso_temaDto;
import Estudiantes_Programacion.crud.Model.Curso;

import java.util.List;

public interface ICursoService {

    // Metodo para traer todos los valores del curso
    public List<Curso> listCourse();

    // Metodo para crear un curso;

    public Curso saveCourse(Curso curso);

    // Metodo para eliminar un curso

    public Curso deleteCourse(Long id_curso);

    //Metodo para traer un curso  en particular

    public Curso findCourse(Long id_curso);

    // Metodo para actualizar un curso

    public Curso editCourse(Curso curso);

    //Metodo para traer solo id_curso, nombre_curso y la lista de temas
    public List<Curso_temaDto> getCourse();



}
