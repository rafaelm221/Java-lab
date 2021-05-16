package Introducao.Aula03;

public class Exercicio {
    public static void main(String[] args) {

        double salary = 5000;
        double tax = 0;

        if (salary < 1000){
            tax  =  salary * 0.05;
        }else if( salary >= 1000 && salary < 2000){
            tax  =  salary * 0.1;
        }else if( salary >= 2000 && salary < 4000){
            tax  =  salary * 0.15;
        }else {
            tax  =  salary * 0.2;
        }
        System.out.println("Voce pagara de imposto: " + tax);


        System.out.println("==============================\n");

        byte day = 5;
        // char, byte, short, int, enum, string
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }

        char sex = 'F';
        switch (sex){
            default:
                System.out.println("Invalid Option.");
                break;
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
        }
    }
}
