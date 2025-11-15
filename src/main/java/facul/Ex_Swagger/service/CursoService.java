package facul.Ex_Swagger.service;

import facul.Ex_Swagger.model.Curso;
import facul.Ex_Swagger.repository.CursoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {

    private final CursoRepository repository;

    public CursoService(CursoRepository repository) {
        this.repository = repository;
    }

    public Curso salvar(Curso curso) {
        return repository.save(curso);
    }

    public List<Curso> listar() {
        return repository.findAll();
    }

    public Curso buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Curso atualizar(Long id, Curso novo) {
        Curso curso = buscarPorId(id);
        if (curso == null) return null;

        curso.setNome(novo.getNome());
        return repository.save(curso);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

