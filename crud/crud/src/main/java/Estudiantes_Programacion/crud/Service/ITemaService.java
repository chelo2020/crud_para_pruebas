package Estudiantes_Programacion.crud.Service;

import Estudiantes_Programacion.crud.Model.Tema;

import java.util.List;

public interface ITemaService {

    public List<Tema>listIssue();

    public Tema saveIssue(Tema tema);

    public Tema deleteIssue(Long id_tema);

    public Tema findIssue(Long id_tema);

    public Tema editIssue(Tema tema);

}
