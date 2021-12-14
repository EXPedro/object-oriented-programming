import br.com.exp.poo.dominio.Bootcamp;
import br.com.exp.poo.dominio.Curso;
import br.com.exp.poo.dominio.Dev;
import br.com.exp.poo.dominio.Mentoria;

import java.time.LocalDate;

public class AppMain {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("*** Curso de Java ***");
        curso1.setDescricao("Curso de java básico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("*** Curso de JavaScript ***");
        curso2.setDescricao("Curso básico de javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria =  new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Decrição da mentoria de java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso);
        System.out.println(mentoria);
        System.out.println("Curso :: " + curso.getTitulo());
        System.out.println("Mentoria :: " + mentoria.getTitulo());
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos do(a) dev " + devCamila.getNome() + ": ");
        System.out.println(devCamila.getConteudosInscritos());

        devCamila.progredir();

        System.out.println("Conteúdos inscritos do(a) dev " + devCamila.getNome() + ": ");
        System.out.println(devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do(a) dev " + devCamila.getNome() + ": ");
        System.out.println(devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        Dev devElisio = new Dev();
        devElisio.setNome("Elisio");
        devElisio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos do(a) dev " + devElisio.getNome() + ": ");
        System.out.println(devElisio.getConteudosInscritos());

        devElisio.progredir();
        devElisio.progredir();

        System.out.println("Conteúdos inscritos do(a) dev " + devElisio.getNome() + ": ");
        System.out.println(devElisio.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do(a) dev " + devElisio.getNome() + ": ");
        System.out.println(devElisio.getConteudosConcluidos());
        System.out.println("XP: " + devElisio.calcularTotalXp());
    }
}
