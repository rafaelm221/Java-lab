package Introducao.Aula03;

public class ControleDeFLuxo2 {
    public static void main(String[] args) {

        int counter = 0;

        while(counter < 10){
            System.out.println(counter);
            counter++;
        }

        do{
            System.out.println("Hello World!");
        }while(counter < 10);


        for ( int i =0; i<100000000; i++){
            System.out.println("Hey ya!, Hey ya!");
        }
    }
}
