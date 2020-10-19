package calculator;

import java.util.Scanner;

public class SumCalculator {
    public static void main (String arg []){
        // Obtener el numero 1
        System.out.println("Entre el numero 1: ");//para escribir en la consola
        Scanner scanner = new Scanner(System.in);// se crea solo una vez

        double number1 = scanner.nextDouble();
        // Obtener el número 2
        System.out.println("Entre el numero 2: ");
        double number2 = scanner.nextDouble();
        scanner.close();//Para que limpie la memoria

        // Sumar los dos números
        double sum = number1 + number2;
        // Restar dos numeros
        double subtract = number1 - number2;

        // Variable String es decir variable de caracteres
        String name = "Jaque";
        System.out.println(name);

        // Mostrar el resultado de la suma
        System.out.println("El resultado de la suma es: " + sum);
        System.out.println("El resultado de la suma es: " + subtract);
    }

}
