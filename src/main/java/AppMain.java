import br.com.exp.poo.dominio.Curso;
import br.com.exp.poo.dominio.Mentoria;

public class AppMain {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria =  new Mentoria();

        curso.setTitulo("***title number 1***");
        mentoria.setTitulo("mentoria title");
        System.out.println(curso);
        System.out.println(mentoria);

        System.out.println("Curso :: " + curso.getTitulo());
        System.out.println("Mentoria :: " + mentoria.getTitulo());
    }
}
