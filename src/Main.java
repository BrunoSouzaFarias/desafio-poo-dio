import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(8);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Bruno:" + devBruno.getConteudosIncritos());

        devBruno.progredir();
        System.out.println("--");

        System.out.println("Conteudos Inscritos Bruno:" + devBruno.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Bruno:" + devBruno.getConteudosConcluidos());


        System.out.println("------------");


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jão:" + devJoao.getConteudosIncritos());

        devJoao.progredir();
        System.out.println("--");


        System.out.println("Conteudos Inscritos Jão:" + devJoao.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Jão:" + devJoao.getConteudosConcluidos());

    }

}