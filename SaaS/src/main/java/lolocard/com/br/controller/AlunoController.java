package lolocard.com.br.controller;

import lolocard.com.br.entity.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lolocard.com.br.repository.AlunoRepository;
import java.util.List;


/**
 * Created by resource on 02/04/2017.
 */

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;

    @RequestMapping("/list")
    public List<AlunoEntity> listar(){
        return alunoRepository.findAll();
    }
}