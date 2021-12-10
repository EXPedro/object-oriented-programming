package br.com.exp.poo.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@ToString
public class Mentoria extends Conteudo{
    @ToString.Exclude
    private LocalDate data;

    @ToString.Include(name = "Titulo")
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

    @ToString.Include(name = "Data")
    public String getCH(){
        if (this.data == null) return " Não definida!";
        else
        return this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public double calcularXp() {
        return 0;
    }
}
