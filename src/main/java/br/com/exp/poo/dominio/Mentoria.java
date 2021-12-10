package br.com.exp.poo.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Getter
@Setter
@ToString
public class Mentoria {
    @ToString.Include(name = "Título")
    private String titulo;
    @ToString.Include(name = "Descrição")
    private String descricao;
    @ToString.Exclude
    private LocalDate data;

    @ToString.Include(name = "Data")
    public String getCH(){
        if (this.data == null) return " Não definida!";
        else
        return this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
