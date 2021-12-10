package br.com.exp.poo.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Include;


@Getter
@Setter
@ToString
public class Curso {
    @Include(name = "Título")
    private String titulo;
    @Include(name = "Descrição")
    private String descricao;
    @ToString.Exclude
    private int cargaHoraria;

    @Include(name = "Carga Horária")
    public String getCH(){
        return this.cargaHoraria + "h";
    }
}
