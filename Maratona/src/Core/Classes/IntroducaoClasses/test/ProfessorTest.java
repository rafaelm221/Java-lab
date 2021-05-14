package Core.Classes.IntroducaoClasses.test;

import Core.Classes.IntroducaoClasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor prof = new Professor();
        Professor prof2 = new Professor();

        // prof 1
        prof.cpf = "484.312.478-86";
        prof.name = "Rafael";
        prof.matricula = "1834959-5";
        prof.rg = "39.664.074-86";

        // prof 2
        prof2.cpf = "484.312.478-86";
        prof2.name = "Joao";
        prof2.matricula = "1834959-5";
        prof2.rg = "39.664.074-86";

        System.out.println(prof.name);
        System.out.println(prof.cpf);
        System.out.println(prof.matricula);
        System.out.println(prof.rg);

        System.out.println("-----------------------------------\n");

        System.out.println(prof2.name);
        System.out.println(prof2.cpf);
        System.out.println(prof2.matricula);
        System.out.println(prof2.rg);
    }
}
