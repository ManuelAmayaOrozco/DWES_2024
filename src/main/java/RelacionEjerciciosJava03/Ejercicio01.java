package RelacionEjerciciosJava03;

public class Ejercicio01 {

    /* Ejercicio 1
    Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.*/

    public static void main(String[] args) {

        System.out.println("Múltiplos de 5:");

        for (int i = 0; i <= 100; i++) {

            if ((i % 5) == 0) {

                System.out.println(i);

            }

        }

    }

}
