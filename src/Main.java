import dominio.Curso;
import dominio.Mentoria;
import dominio.Dev;
import dominio.Bootcamp;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("A vida e Bela");
        curso1.setDescricao("Livro de romance");
        curso1.setCargaHoraria(28);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descricao da mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcelly = new Dev();
        devMarcelly.setNome("Marcelly");
        devMarcelly.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcelly:" + devMarcelly.getConteudosInscritos());
        devMarcelly.progredir();
        devMarcelly.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcelly:" + devMarcelly.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcelly:" + devMarcelly.getConteudosConcluidos());
        System.out.println("XP:" + devMarcelly.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}