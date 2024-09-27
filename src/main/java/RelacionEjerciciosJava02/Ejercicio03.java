package RelacionEjerciciosJava02;

import java.util.Scanner;

public class Ejercicio03 {

    /*Ejercicio 3
    Escribe un programa en que dado un número del 1 a 7 escriba el correspon- diente nombre del día
    de la semana.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1 -> {

                System.out.println("Lunes.");

            }
            case 2 -> {

                System.out.println("Martes.");

            }
            case 3 -> {

                System.out.println("Miércoles.");

            }
            case 4 -> {

                System.out.println("Jueves.");

            }
            case 5 -> {

                System.out.println("Viernes.");

            }
            case 6 -> {

                System.out.println("Sábado.");

            }
            case 7 -> {

                System.out.println("Domingo.");

            }
            default -> System.out.println("Día inválido.");
        }

    }

}
