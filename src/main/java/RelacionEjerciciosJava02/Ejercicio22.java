package RelacionEjerciciosJava02;

import java.util.Scanner;

public class Ejercicio22 {

    /*Ejercicio 22
    Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y
    minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de semana
    comienza el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día y hora correctos,
    anterior al viernes a las 15:00h.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un día de la semana: ");
        String dia = sc.next().toLowerCase();

        System.out.print("Introduce una hora con minutos (hh,mm): ");
        double horamin = sc.nextDouble();

        long hora = (long) horamin;
        double min = horamin - hora;

        double totmin = 0;

        switch (dia) {
            case "lunes" -> {

                totmin = 5220 + ((24 - hora) * 60 - (min * 100));

            }
            case "martes" -> {

                totmin = 3780 + ((24 - hora) * 60 - (min * 100));

            }
            case "miercoles" -> {

                totmin = 2340 + ((24 - hora) * 60 - (min * 100));

            }
            case "jueves" -> {

                totmin = 900 + ((24 - hora) * 60 - (min * 100));

            }
            case "viernes" -> {

                totmin = ((15 - hora) * 60) - (min * 100);

            }
            default -> System.out.println("Día incorrecto.");
        }

        System.out.println("Quedan " + totmin + " minutos para el fin de semana.");

    }

}
