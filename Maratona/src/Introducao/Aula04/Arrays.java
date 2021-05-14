package Introducao.Aula04;

public class Arrays {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Naruto";
        names[1] = "Fluffy";
        names[2] = "Goku";


        for (int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }


    }
}
