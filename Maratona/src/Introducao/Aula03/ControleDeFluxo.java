package Introducao.Aula03;

public class ControleDeFluxo {
    public static void main(String[] args) {

        int age = 14;
        String status;

        if (age <= 18){
            System.out.println("Proibido a entrada de Menores!\n");
        }else{
            System.out.println("Entrada Permitida!\n");
        }

        // Ternary Operator
        status = age <= 18 ? "Proibido a entrada de Menores!\n" : "Entrada Permitida!\n" ;
        System.out.println(status);
    }
}
