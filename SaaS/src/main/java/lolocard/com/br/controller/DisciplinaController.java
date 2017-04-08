package lolocard.com.br.controller;

import lolocard.com.br.entity.DisciplinaEntity;
import lolocard.com.br.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * Created by resource on 02/04/2017.
 */

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    @Autowired
    DisciplinaRepository disciplinaRepository;

    @RequestMapping("/salvar/{id}/{nome}/{desc}/{ch}")
    public DisciplinaEntity salvar(@PathVariable("id") Integer id,
                                   @PathVariable("nome") String nome,
                                   @PathVariable("desc") String descricao,
                                   @PathVariable("ch") String ch){

        DisciplinaEntity d1 = new DisciplinaEntity();

        d1.setNome(nome);
        d1.setDescricao(descricao);
        d1.setCargaHoraria(ch);
        d1.setCodDisciplina(id);

        return disciplinaRepository.save(d1);

    }


    @RequestMapping("/buscar/{id}")
    public DisciplinaEntity buscaId(@PathVariable("id") Integer id){

        return disciplinaRepository.findOne(id);

    }

    @RequestMapping("/deletar/{id}")
    public String deletaId(@PathVariable("id") Integer id){

        DisciplinaEntity disciplina = disciplinaRepository.findOne(id);

        String nomeDisciplina = disciplina.getNome();

        disciplinaRepository.delete(id);

        return "Disciplina " + id + " - " + nomeDisciplina + " excluida com sucesso.";

    }

    @RequestMapping("/list")
    public List<DisciplinaEntity> listar(){

        return disciplinaRepository.findAll();

    }
}

