package br.com.exp.poo.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Include;


@Getter
@Setter
@ToString
public class Curso extends Conteudo{
    @ToString.Exclude
    private int cargaHoraria;

    @ToString.Include(name = "Titulo")
//    String s = getTitulo();
    public String getTitle(){
        if (getTitulo() == null) return " Não definido!";
        else
            return getTitulo();
    }
    @ToString.Include(name = "Definição")
    public String getDesc(){
        if (getDescricao() == null) return " Não definida!";
        else
            return getDescricao();
    }

    @Include(name = "Carga Horária")
    public String getCH(){
        if (this.cargaHoraria == 0) return " Não definida!";
        else
        return this.cargaHoraria + "h";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
