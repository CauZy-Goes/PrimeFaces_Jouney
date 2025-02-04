package br.cauzy.jsf.controller;


import br.cauzy.jsf.model.Pessoa;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("bean")
@SessionScoped //aplicationScoped é compartilhado entre usuarios/navegaddores
public class PessoaMB implements Serializable {
    //aplicationScoped é compartilhado entre usuarios/navegaddores
    //resquesSCcoped a classe é excluida no caso a lista quando é enviado ao servidor
    // conversetion scope. injeta a variavel Conversation, conversation.begin() e convernsation.end(). comeca e finaliza o escopo

    @Inject
    private Pessoa pessoa ; // Iniciar diretamente a instância da pessoa.
    private List<Pessoa> pessoas = new ArrayList<>();

    // Adiciona a pessoa à lista e limpa o formulário
    public String Adicionar() {
        pessoas.add(pessoa);
        Limpar();

        return "paginas/Sucesso";  // Aqui, faça a navegação para a página index.xhtml ou qualquer outro caminho
    }

    // Limpa o formulário (reseta a pessoa)
    public void Limpar() {
        this.pessoa = new Pessoa();  // Cria uma nova instância
    }

    // Getters e setters
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
