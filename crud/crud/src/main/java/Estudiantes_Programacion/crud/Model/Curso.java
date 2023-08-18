package Estudiantes_Programacion.crud.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_curso;
    private String nombre_cusro;
    private String modalidad_curso;
    private Date fecha_finalizacion_curso;
    @OneToMany
    private List<Tema>listaTemas;

    public Curso() {
    }

    public Curso(Long id_curso, String nombre_cusro, String modalidad_curso, Date fecha_finalizacion_curso, List<Tema> listaTemas) {
        this.id_curso = id_curso;
        this.nombre_cusro = nombre_cusro;
        this.modalidad_curso = modalidad_curso;
        this.fecha_finalizacion_curso = fecha_finalizacion_curso;
        this.listaTemas = listaTemas;
    }

    @Override
    public String
    toString() {
        return "Curso{" +
                "id_curso=" + id_curso +
                ", nombre_cusro='" + nombre_cusro + '\'' +
                ", modalidad_curso='" + modalidad_curso + '\'' +
                ", fecha_finalizacion_curso=" + fecha_finalizacion_curso +
                ", listaTemas=" + listaTemas +
                '}';
    }
}
