package RelacionEjerciciosJava04;

public class Ejercicio03 {

    /* Ejercicio 3
    Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas: 2, 3,
    4, 5, 6, 7, sota, caballo, rey y as.*/

    public static void main(String[] args) {

        System.out.println("¡Carta aleatoria! (Edición española)");

        int tipocarta = (int) (Math.floor(Math.random()*(4-1+1)+1));

        int numcarta = (int) (Math.floor(Math.random()*(10-1+1)+1));

        String nombrecarta = "";

        String nomnumcarta = "";

        switch (tipocarta) {

            case 1 -> {

                nombrecarta = "oros";

            }
            case 2 -> {

                nombrecarta = "copas";

            }
            case 3 -> {

                nombrecarta = "espadas";

            }
            case 4 -> {

                nombrecarta = "bastos";

            }

        }

        switch (numcarta) {

            case 1 -> {

                nomnumcarta = "As";

            }
            case 8 -> {

                nomnumcarta = "Sota";

            }
            case 9 -> {

                nomnumcarta = "Caballo";

            }
            case 10 -> {

                nomnumcarta = "Rey";

            }
            default -> nomnumcarta = String.valueOf(numcarta);

        }

        System.out.println("Te ha tocado: " + nomnumcarta + " de " + nombrecarta);

    }

}
