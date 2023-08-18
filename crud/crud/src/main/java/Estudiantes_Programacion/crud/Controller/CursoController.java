package Estudiantes_Programacion.crud.Controller;

import Estudiantes_Programacion.crud.Dto.Curso_temaDto;
import Estudiantes_Programacion.crud.Model.Curso;
import Estudiantes_Programacion.crud.Service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private ICursoService repoCurso;

    @GetMapping("/cursos/traer")
    public ResponseEntity<List<Curso>> listaCursos(){
        List<Curso>list=repoCurso.listCourse();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);
    }

    @PostMapping("/cursos/crear")
    public ResponseEntity<Curso> newCourse(@RequestBody Curso curso){
        Curso cur=repoCurso.saveCourse(curso);
        return ResponseEntity.ok(curso);
    }
    @DeleteMapping("/cursos/borrar/{id_curso}")
    public ResponseEntity<Curso> deleteCourse(@PathVariable Long id_curso){
        Curso cur=repoCurso.deleteCourse(id_curso);
        if (cur==null){
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cur);
    }
    @GetMapping("/cursos/traer/{id_curso}")
    public ResponseEntity<Curso>oneCourse(@PathVariable Long id_curso){

        Curso cur=repoCurso.findCourse(id_curso);
        if (cur==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cur);

    }
    @PutMapping("/cursos/editar")
    public ResponseEntity<Curso> editCourse(@RequestBody Curso curso){

        Curso cur=repoCurso.editCourse(curso);
        return ResponseEntity.ok(cur);

    }
    @GetMapping("/cursos/traer1")
    public ResponseEntity<List<Curso_temaDto>>listCourse(){
        List<Curso_temaDto> dto= repoCurso.getCourse();
        if (dto.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(dto);
    }


}
