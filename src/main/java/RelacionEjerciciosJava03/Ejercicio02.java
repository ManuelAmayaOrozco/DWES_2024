package RelacionEjerciciosJava03;

public class Ejercicio02 {

    /* Ejercicio 2
    Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.*/

    public static void main(String[] args) {

        System.out.println("Múltiplos de 5:");

        int i = 0;

        while (i <= 100) {

            if ((i % 5) == 0) {

                System.out.println(i);

            }

            i++;

        }

    }

}
