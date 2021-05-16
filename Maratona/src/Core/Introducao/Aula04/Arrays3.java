package Introducao.Aula04;

public class Arrays3 {
    public static void main(String[] args) {

        int[][] days = new int[2][2];

        days[0][0] = 30;
        days[0][1] = 29;
        days[1][0] = 28;
        days[1][1] = 27;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }

        System.out.println("------------------------\n");

        for (int[] ref : days) {
            for (int day : ref) {
                System.out.println(day);
            }
        }
    }
}
