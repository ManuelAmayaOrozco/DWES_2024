package RelacionEjerciciosJava01;

import java.util.Scanner;

public class Ejercicio13 {

    /*Ejercicio 13
    Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
    Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer
    examen cuenta el 40% y la del segundo examen un 60%.

    Ejemplo 1:
    Introduce la nota del primer examen: 7
    ¿Qué nota quieres sacar en el trimestre? 8.5
    Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.

    Ejemplo 2:
    Introduce la nota del primer examen: 8
    ¿Qué nota quieres sacar en el trimestre? 7
    Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = sc.nextDouble();

        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double notafin = sc.nextDouble();

        double nota1por = (nota1 * 40) / 100;
        double resultado = ((notafin - nota1por) * 5) / 3;

        System.out.print("Para tener un " + notafin + " en el trimestre necesitas sacar un " + String.format("%.2f", resultado) + " en el segundo examen.");

    }
}
