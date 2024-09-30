package RelacionEjerciciosJava04;

public class Ejercicio13 {

    /* Ejercicio 13
    Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando los
    dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.*/

    public static void main(String[] args) {

        System.out.println("¡Tira los dados hasta que salgan iguales!");

        boolean iguales = false;

        while (!iguales) {

            int dado1 = (int) (Math.floor(Math.random()*(6-1+1)+1));
            System.out.println("Resultado primer dado: " + dado1);

            int dado2 = (int) (Math.floor(Math.random()*(6-1+1)+1));
            System.out.println("Resultado segundo dado: " + dado2);

            if (dado1 == dado2) {

                System.out.println("¡Son iguales!");
                iguales = true;

            }
            else {

                System.out.println("¡No son iguales, vuelve a intentarlo!");

            }

        }

    }

}
