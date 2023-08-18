package Estudiantes_Programacion.crud.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_tema;
    private String nombre_tema;
    private String descripcion_tema;

    public Tema() {
    }

    public Tema(Long id_tema, String nombre_tema, String descripcion_tema) {
        this.id_tema = id_tema;
        this.nombre_tema = nombre_tema;
        this.descripcion_tema = descripcion_tema;
    }

    @Override
    public String
    toString() {
        return "Tema{" +
                "id_tema=" + id_tema +
                ", nombre_tema='" + nombre_tema + '\'' +
                ", descripcion_tema='" + descripcion_tema + '\'' +
                '}';
    }
}
