package RelacionEjerciciosJava04;

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio14 {

    /* Ejercicio 14
    Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa intentará
    adivinar el número que estás pensando- un número entre 0 y 100- teniendo para ello 5 oportu
    nidades. En cada intento fallido, el programa debe preguntar si el número que estás pensando es
    mayor o menor que el que te acaba de decir. 59Números aleatorios 60*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Voy a adivinar en qué número estás pensando.");

        boolean fin = false;

        int max = 100;

        int min = 0;

        int intentos = 5;

        while (!fin) {

            int num = (int) (Math.floor(Math.random()*(max-min+1)+min));

            boolean rescorr = false;

            while (!rescorr) {

                System.out.print("¿Tu número es el " + num + "? (si/no): ");
                String res = sc.next();

                if (Objects.equals(res, "si")) {

                    System.out.println("¡He acertado! ¡Fin del juego!");
                    rescorr = true;
                    fin = true;

                }
                else if (Objects.equals(res, "no")) {

                    intentos--;

                    System.out.println("Que mal, he fallado. (Intentos restantes: " + intentos + ")");

                    rescorr = true;

                    boolean mayomenres = false;

                    while (!mayomenres && intentos != 0) {

                        System.out.print("¿El número en el que estás pensando es mayor o menor? (mayor/menor): ");
                        String mayomen = sc.next();

                        if (Objects.equals(mayomen, "mayor")) {

                            System.out.println("Vale, lo tendré en cuenta.");
                            min = num;
                            mayomenres = true;

                        }
                        else if (Objects.equals(mayomen, "menor")) {

                            System.out.println("Vale, lo tendré en cuenta.");
                            max = num;
                            mayomenres = true;

                        }
                        else {

                            System.out.println("¡Esa no es una respuesta válida!");

                        }

                    }

                }
                else {

                    System.out.println("¡Esa no es una respuesta válida!");

                }

            }

            if (intentos == 0) {

                System.out.println("¡Se me acabaron los intentos, tu ganas!");
                fin = true;

            }

        }

    }

}
