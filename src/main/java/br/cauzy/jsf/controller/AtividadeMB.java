package br.cauzy.jsf.controller;

import br.cauzy.jsf.model.Atividade;
import br.cauzy.jsf.model.TipoAtividade;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("atividadeMB")
@SessionScoped
public class AtividadeMB implements Serializable {

    @Inject
    private Atividade atividade;

    public TipoAtividade[] getAtividades(){
        return TipoAtividade.values();
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
}
