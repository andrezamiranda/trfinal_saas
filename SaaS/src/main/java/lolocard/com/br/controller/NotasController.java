package lolocard.com.br.controller;

import lolocard.com.br.entity.NotaalunoEntity;
import lolocard.com.br.repository.NotaAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


/**
 * Created by resource on 02/04/2017.
 */

@RestController
@RequestMapping("/notas")
public class NotasController {

    @Autowired
    NotaAlunoRepository notaRepository;

    @RequestMapping("/list")
    public List<NotaalunoEntity> listar(){
        return notaRepository.findAll();
    }
}