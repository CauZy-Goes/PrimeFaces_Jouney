package br.cauzy.jsf.model;

public enum TipoAtividade {
    APRESENTACAO("apresentacao"), CURSO("curso"), MINICURSO("minicurso"), PALESTRA("palestra"),
    SEMINARIO("seminario"), SOMPOSITO("simposito"), OUTRA("outras");

    private String descricao;

    TipoAtividade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
