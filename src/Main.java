import dominio.Curso;
import dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(mentoria);
    }
}