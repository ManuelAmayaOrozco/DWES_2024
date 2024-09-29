package RelacionEjerciciosJava03;

import java.util.Scanner;

public class Ejercicio21 {

    /*Ejercicio 21
    Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y
    nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares. El
    número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye
    en el cómputo.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cuantos números quieras, hasta que salga negativo: ");

        boolean fin = false;

        int totimp = 0;

        int maypar = 0;

        int tot;

        for (tot = 0; !fin; tot++) {

            int num = sc.nextInt();

            if (num < 0) {

                fin = true;

            }

            if (!fin) {

                if ((num % 2) == 0) {

                    if (num > maypar) {

                        maypar = num;

                    }

                }
                else {

                    totimp += num;

                }

            }

        }

        tot--;

        System.out.println("Total números: " + tot);

        double medimp = (double) totimp / tot;

        System.out.println("Media impares: " + String.format("%.2f", medimp));

        System.out.println("Mayor par: " + maypar);

    }

}
