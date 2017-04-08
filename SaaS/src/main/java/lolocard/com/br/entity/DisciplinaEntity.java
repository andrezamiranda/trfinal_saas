package lolocard.com.br.entity;

import javax.persistence.*;

/**
 * Created by resource on 02/04/2017.
 */
@Entity
@Table(name = "disciplina", schema = "public", catalog = "lolocard")
public class DisciplinaEntity {
    private int codDisciplina;
    private String nome;
    private String cargaHoraria;
    private String descricao;

    public DisciplinaEntity() {
        super();
        // TODO Auto-generated constructor stub
    }

    public DisciplinaEntity(String nome, String cargaHoraria, String descricao) {
        super();
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao;
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
    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "carga_horaria")
    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Basic
    @Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DisciplinaEntity that = (DisciplinaEntity) o;

        if (codDisciplina != that.codDisciplina) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (cargaHoraria != null ? !cargaHoraria.equals(that.cargaHoraria) : that.cargaHoraria != null) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codDisciplina;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (cargaHoraria != null ? cargaHoraria.hashCode() : 0);
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        return result;
    }
}
