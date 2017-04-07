package lolocard.com.br.entity;

import javax.persistence.*;

/**
 * Created by resource on 02/04/2017.
 */
@Entity
@Table(name = "aluno", schema = "public", catalog = "lolocard")
public class AlunoEntity {
    private int codAluno;
    private String nome;
    private String sexo;
    private String datanascimento;

    @Id
    @Column(name = "cod_aluno")
    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    @Basic
    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "sexo")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Basic
    @Column(name = "datanascimento")
    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlunoEntity that = (AlunoEntity) o;

        if (codAluno != that.codAluno) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (sexo != null ? !sexo.equals(that.sexo) : that.sexo != null) return false;
        if (datanascimento != null ? !datanascimento.equals(that.datanascimento) : that.datanascimento != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codAluno;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        result = 31 * result + (datanascimento != null ? datanascimento.hashCode() : 0);
        return result;
    }
}
