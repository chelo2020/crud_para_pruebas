package Estudiantes_Programacion.crud.Service;

import Estudiantes_Programacion.crud.Model.Tema;
import Estudiantes_Programacion.crud.Repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {

    @Autowired
    private ITemaRepository repoTema;

    @Override
    public List<Tema> listIssue() {
        List<Tema> list=repoTema.findAll();
        return list;
    }

    @Override
    public Tema saveIssue(Tema tema) {
        repoTema.save(tema);
        return tema;
    }

    @Override
    public Tema deleteIssue(Long id_tema) {
        repoTema.deleteById(id_tema);
        return null;
    }

    @Override
    public Tema findIssue(Long id_tema) {

        Tema tema=repoTema.findById(id_tema).orElse(null);
        return tema;
    }

    @Override
    public Tema editIssue(Tema tema) {
        this.saveIssue(tema);
        return tema;
    }
}
