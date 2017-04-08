package lolocard.com.br.controller;

import lolocard.com.br.entity.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/salvar/{id}/{nome}/{sexo}/{dn}")
    public AlunoEntity salvar(@PathVariable("id") Integer id,
                              @PathVariable("nome") String nome,
                              @PathVariable("sexo") String sexo,
                              @PathVariable("dn") String dn){

        AlunoEntity aluno = new AlunoEntity();

        aluno.setNome(nome);
        aluno.setSexo(sexo);
        aluno.setDatanascimento(dn);
        aluno.setCodAluno(id);

        return alunoRepository.save(aluno);
    }


    @RequestMapping("/buscar/{id}")
    public AlunoEntity buscaId(@PathVariable("id") Integer id){

        return alunoRepository.findOne(id);

    }

    @RequestMapping("/alterar/{id}/{nome}/{sexo}/{dn}")
    public AlunoEntity alteraId(@PathVariable("id") Integer id,
                                @PathVariable("nome") String nome,
                                @PathVariable("sexo") String sexo,
                                @PathVariable("dn") String dn){

        AlunoEntity aluno = alunoRepository.findOne(id);

        aluno.setNome(nome);
        aluno.setDatanascimento(dn);
        aluno.setSexo(sexo);

        return alunoRepository.saveAndFlush(aluno);

    }


    @RequestMapping("/list")
    public List<AlunoEntity> listar(){
        return alunoRepository.findAll();
    }
}