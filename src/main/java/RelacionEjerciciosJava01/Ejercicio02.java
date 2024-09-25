package RelacionEjerciciosJava01;

import java.util.Scanner;

public class Ejercicio02 {

    /*Ejercicio 2
    Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser
    introducida por teclado.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double peseta = 166.386;
        System.out.println("Escribe la cantidad en euros: ");
        double euro = sc.nextDouble();
        System.out.println(euro + " euros son igual a " + (euro * peseta) + " pesetas");

    }

}
