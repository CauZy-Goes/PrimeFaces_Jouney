package br.cauzy.jsf.model;

import jakarta.enterprise.context.Dependent;

import java.io.Serializable;

@Dependent
public class Atividade implements Serializable {

    private Long id;
    private String nome;
    private TipoAtividade tipoAtividade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAtividade getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(TipoAtividade tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }
}
