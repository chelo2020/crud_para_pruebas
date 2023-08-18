package Estudiantes_Programacion.crud.Dto;

import Estudiantes_Programacion.crud.Model.Tema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@Getter @Setter
public class Curso_temaDto implements Serializable {

    private Long id_curso;
    private String nombre_cusro;
    private List<Tema> listaTemas;

    public Curso_temaDto() {
    }

    public Curso_temaDto(Long id_curso, String nombre_cusro, List<Tema> listaTemas) {
        this.id_curso = id_curso;
        this.nombre_cusro = nombre_cusro;
        this.listaTemas = listaTemas;
    }
}
