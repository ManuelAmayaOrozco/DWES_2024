package RelacionEjerciciosJava04;

public class Ejercicio02 {

    /* Ejercicio 2
    Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta baraja
    está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está formado por
    13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
    sería el 1). Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).*/

    public static void main(String[] args) {

        System.out.println("¡Carta aleatoria!");

        int tipocarta = (int) (Math.floor(Math.random()*(4-1+1)+1));

        int numcarta = (int) (Math.floor(Math.random()*(13-1+1)+1));

        String nombrecarta = "";

        String nomnumcarta = "";

        switch (tipocarta) {

            case 1 -> {

                nombrecarta = "picas";

            }
            case 2 -> {

                nombrecarta = "corazones";

            }
            case 3 -> {

                nombrecarta = "diamantes";

            }
            case 4 -> {

                nombrecarta = "tréboles";

            }

        }

        switch (numcarta) {

            case 1 -> {

                nomnumcarta = "As";

            }
            case 11 -> {

                nomnumcarta = "Jota";

            }
            case 12 -> {

                nomnumcarta = "Reina";

            }
            case 13 -> {

                nomnumcarta = "Rey";

            }
            default -> nomnumcarta = String.valueOf(numcarta);

        }

        System.out.println("Te ha tocado: " + nomnumcarta + " de " + nombrecarta);

    }

}
