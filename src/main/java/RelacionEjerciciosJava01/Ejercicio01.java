package RelacionEjerciciosJava01;

import java.util.Scanner;

public class Ejercicio01 {

    /*Ejercicio 1
    Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int num1 = sc.nextInt();
        System.out.println("Escribe otro número: ");
        int num2 = sc.nextInt();
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

    }

}
