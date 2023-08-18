package Estudiantes_Programacion.crud.Service;

import Estudiantes_Programacion.crud.Dto.Curso_temaDto;
import Estudiantes_Programacion.crud.Model.Curso;
import Estudiantes_Programacion.crud.Repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private ICursoRepository repoCurso;

    @Override
    public List<Curso> listCourse() {
        List<Curso>list=repoCurso.findAll();
        return list;
    }

    @Override
    public Curso saveCourse(Curso curso) {
        repoCurso.save(curso);
        return curso;
    }

    @Override
    public Curso deleteCourse(Long id_curso) {
        repoCurso.deleteById(id_curso);
        return null;
    }

    @Override
    public Curso findCourse(Long id_curso) {
        Curso curso=repoCurso.findById(id_curso).orElse(null);
        return curso;
    }

    @Override
    public Curso editCourse(Curso curso) {
        this.saveCourse(curso);
        return curso;
    }

    @Override
    public List<Curso_temaDto> getCourse() {
        List<Curso>cur=this.listCourse();
        List<Curso_temaDto> listCourseIssue=new ArrayList<Curso_temaDto>();
        Curso_temaDto course_4=new Curso_temaDto();
        for ( Curso curso:cur) {
            System.out.println(curso.getId_curso());
            course_4.setNombre_cusro(curso.getNombre_cusro());
            course_4.setListaTemas(curso.getListaTemas());

            listCourseIssue.add(course_4);
            course_4=new Curso_temaDto();// resetea
        }
        return listCourseIssue;
    }
}
