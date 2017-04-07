package lolocard.com.br.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by resource on 02/04/2017.
 */
public class NotaalunoEntityPK implements Serializable {
    private int codAluno;
    private int codDisciplina;

    @Column(name = "cod_aluno")
    @Id
    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    @Column(name = "cod_disciplina")
    @Id
    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NotaalunoEntityPK that = (NotaalunoEntityPK) o;

        if (codAluno != that.codAluno) return false;
        if (codDisciplina != that.codDisciplina) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codAluno;
        result = 31 * result + codDisciplina;
        return result;
    }
}
