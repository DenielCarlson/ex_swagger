package facul.Ex_Swagger.repository;

import facul.Ex_Swagger.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

