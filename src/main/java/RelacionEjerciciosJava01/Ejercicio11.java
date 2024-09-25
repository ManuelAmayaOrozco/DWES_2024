package RelacionEjerciciosJava01;

import java.util.Scanner;

public class Ejercicio11 {

    /*Ejercicio 11
    Realiza un conversor de Kb a Mb.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double mb = 0.001;
        System.out.println("Escribe el tamaño en Kb: ");
        double kb = sc.nextDouble();
        System.out.println(kb + "Kb son igual a " + (kb * mb) + "Mb");

    }

}
