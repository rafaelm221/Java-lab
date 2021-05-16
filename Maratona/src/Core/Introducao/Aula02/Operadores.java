package Introducao.Aula02;

public class Operadores {
    public static void main(String[] args) {
        int num = 1;
        int num2 = 2;
        // Here there is no sum because the compiler will concatenate the the string with the variable.
        System.out.println("wrong way!");
        System.out.println("The Sum of two numbers is: " + num + num2+ "\n");

        int sum = num + num2;
        // we can use another variable to receive the sum of two numbers.
        System.out.println("the right Way to sum two variables \n");
        System.out.println("the sum of two numbers is: " + sum);

        // or we can just use the () for sum the numbers
        System.out.println("The Sum of two numbers is: " + (num + num2));

        // Division
        System.out.println("\nDivision \n");
        System.out.println("The Division of two numbers is: " +(num/num2));

        // Multiplication
        System.out.println("\nMultiplication \n");
        System.out.println("Number one time number two is: " + (num * num2));

        //Subtraction
        System.out.println("\nSubtraction \n ");
        System.out.println("The Subtraction of two numbers is: " + (num - num2));


        // Rest of a Division Operator " %"
        System.out.println("\nthe number is odd or even\n");
        System.out.println("The Sum of two numbers is odd: " + (sum%2));

    }
}
