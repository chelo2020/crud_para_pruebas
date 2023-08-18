package Estudiantes_Programacion.crud.Controller;

import Estudiantes_Programacion.crud.Model.Curso;
import Estudiantes_Programacion.crud.Model.Tema;
import Estudiantes_Programacion.crud.Service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {
    @Autowired
    private ITemaService repoTema;

    @GetMapping("/temas/traer")
    public ResponseEntity<List<Tema>> getTemas(){
        List<Tema>listIssue=repoTema.listIssue();
        if (listIssue.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listIssue);
    }

    @PostMapping("/temas/crear")
    public ResponseEntity<Tema> newIusse(@RequestBody Tema tema){
        Tema tem=repoTema.saveIssue(tema);
        return ResponseEntity.ok(tem);
    }
    @DeleteMapping("/temas/borrar/{id_tema}")
    public ResponseEntity<Tema>deleteIssue(@PathVariable Long id_tema){
        Tema tem=repoTema.deleteIssue(id_tema);
        if (tem==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tem);
    }
    @GetMapping("/temas/traer/{id_tema}")
    public ResponseEntity<Tema>getOneIssue(@PathVariable Long id_tema){
        Tema te=repoTema.findIssue(id_tema);
        if (te==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(te);
    }
    @PutMapping("/temas/editar")
    public ResponseEntity<Tema> editIssue(@RequestBody Tema tema){
        Tema tema2=repoTema.editIssue(tema);
        return ResponseEntity.ok(tema2);
    }
}
