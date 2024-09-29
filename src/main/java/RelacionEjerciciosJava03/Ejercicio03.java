package RelacionEjerciciosJava03;

public class Ejercicio03 {

    /*Ejercicio 3
    Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while */

    public static void main(String[] args) {

        System.out.println("Múltiplos de 5:");

        int i = 0;

        do {

            if ((i % 5) == 0) {

                System.out.println(i);

            }

            i++;

        } while (i <= 100);

    }

}
