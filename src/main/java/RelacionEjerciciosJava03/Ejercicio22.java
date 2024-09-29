package RelacionEjerciciosJava03;

public class Ejercicio22 {

    /* Ejercicio 22
    Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.*/

    public static void main(String[] args) {

        System.out.println("Números primos entre 2 y 100:");

        for (int i = 2; i <= 100; i++) {

            int cont = 2;

            boolean primo = true;

            while ((primo) && (cont != i)){

                if (i % cont == 0)

                    primo = false;

                cont++;

            }

            if (primo) {

                System.out.println(i);

            }

        }

    }

}
