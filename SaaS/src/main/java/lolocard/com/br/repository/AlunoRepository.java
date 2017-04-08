package lolocard.com.br.repository;

import lolocard.com.br.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by resource on 02/04/2017.
 */
public interface AlunoRepository extends JpaRepository<AlunoEntity, Integer>{
}