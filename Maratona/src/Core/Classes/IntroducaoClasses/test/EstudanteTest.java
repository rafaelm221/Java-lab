package Core.Classes.IntroducaoClasses.test;

import Core.Classes.IntroducaoClasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante joao = new Estudante();

        joao.name = "Joao";
        joao.age = 15;
        joao.Register = "1212";


        System.out.println(joao.age);
        System.out.println(joao.name);
        System.out.println(joao.Register);
    }
}
