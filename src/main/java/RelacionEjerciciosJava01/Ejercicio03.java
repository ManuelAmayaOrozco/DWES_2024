package RelacionEjerciciosJava01;

import java.util.Scanner;

public class Ejercicio03 {

    /*Ejercicio 3
    Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser
    introducida por teclado.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double euro = 0.006;
        System.out.println("Escribe la cantidad en pesetas: ");
        double peseta = sc.nextDouble();
        System.out.println(peseta + " pesetas son igual a " + (euro * peseta) + " euros");

    }

}
