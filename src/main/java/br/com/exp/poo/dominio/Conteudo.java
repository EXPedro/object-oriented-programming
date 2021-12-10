package br.com.exp.poo.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conteudo {
    private String titulo;
    private String descricao;

    public abstract double calcularXp();
}
