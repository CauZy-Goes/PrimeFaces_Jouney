package br.cauzy.jsf.controller;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("msg")
@ViewScoped
public class MessageMB implements Serializable {

    public void salvar(){
            FacesMessage message = new FacesMessage("Salvo com sucesso!");
            FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void erro(){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Deu erro !", null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
