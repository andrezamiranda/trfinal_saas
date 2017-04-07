package lolocard.com.br.repository;

import lolocard.com.br.entity.DisciplinaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by resource on 02/04/2017.
 */
public interface DisciplinaRepository extends JpaRepository<DisciplinaEntity, Integer>{

}