package RelacionEjerciciosJava02;

import java.util.Scanner;

public class Ejercicio01 {

    /*Ejercicio 1
    Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a
    primera hora ese día.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un día de la semana: ");
        String dia = sc.next().toLowerCase();

        switch (dia) {
            case "lunes" -> {

                System.out.println("Tienes Horas de Libre Configuración a primera hora.");

            }
            case "martes" -> {

                System.out.println("Tienes Desarrollo Web en Entorno Cliente a primera hora.");

            }
            case "miercoles" -> {

                System.out.println("Tienes Desarrollo Web en Entorno Cliente a primera hora.");

            }
            case "jueves" -> {

                System.out.println("Tienes Diseño de Interfaces Web a primera hora.");

            }
            case "viernes" -> {

                System.out.println("Tienes Diseño de Interfaces Web a primera hora.");

            }
            default -> System.out.println("Día incorrecto.");
        }
    }

}
