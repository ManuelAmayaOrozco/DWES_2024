package RelacionEjerciciosJava04;

public class Ejercicio01 {

    /* Ejercicio 1
    Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total
    (los puntos que suman entre los tres dados)*/

    public static void main(String[] args) {

        //Número entero entre M y N con M menor que N y ambos incluídos
        //int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M));

        int dado1 = (int) (Math.floor(Math.random()*(6-1+1)+1));
        System.out.println("Resultado primer dado: " + dado1);

        int dado2 = (int) (Math.floor(Math.random()*(6-1+1)+1));
        System.out.println("Resultado segundo dado: " + dado2);

        int dado3 = (int) (Math.floor(Math.random()*(6-1+1)+1));
        System.out.println("Resultado tercer dado: " + dado3);

        System.out.println("Resultado total de los dados: " + (dado1 + dado2 + dado3));

    }

}
