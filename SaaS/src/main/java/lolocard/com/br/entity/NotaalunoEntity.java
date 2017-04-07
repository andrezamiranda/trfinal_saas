package lolocard.com.br.entity;

import javax.persistence.*;

/**
 * Created by resource on 02/04/2017.
 */
@Entity
@Table(name = "notaaluno", schema = "public", catalog = "lolocard")
@IdClass(NotaalunoEntityPK.class)
public class NotaalunoEntity {
    private int codAluno;
    private int codDisciplina;
    private Double nota;

    @Id
    @Column(name = "cod_aluno")
    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    @Id
    @Column(name = "cod_disciplina")
    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    @Basic
    @Column(name = "nota")
    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NotaalunoEntity that = (NotaalunoEntity) o;

        if (codAluno != that.codAluno) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (nota != null ? !nota.equals(that.nota) : that.nota != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codAluno;
        result = 31 * result + codDisciplina;
        result = 31 * result + (nota != null ? nota.hashCode() : 0);
        return result;
    }
}
