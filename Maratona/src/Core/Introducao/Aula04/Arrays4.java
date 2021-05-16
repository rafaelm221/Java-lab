package Introducao.Aula04;

public class Arrays4 {
    public static void main(String[] args) {

        int[][] days = {{0,0}, {1,2,2}, {0,0,0,0}};

        // qual sera o valor para  a posiçao? [1][2] = 3
        for (int[] aux :
                days) {
            for (int num :
                    aux) {
                System.out.println(num);
            }
        }
    }
}
