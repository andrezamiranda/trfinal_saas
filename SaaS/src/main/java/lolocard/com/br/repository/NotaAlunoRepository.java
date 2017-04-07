package lolocard.com.br.repository;

import lolocard.com.br.entity.DisciplinaEntity;
import lolocard.com.br.entity.NotaalunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by resource on 02/04/2017.
 */
public interface NotaAlunoRepository  extends JpaRepository<NotaalunoEntity, Long>{
}