package RelacionEjerciciosJava02;

import java.util.Scanner;

public class Ejercicio20 {

    /*Ejercicio 20
    Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se
    permiten números de hasta 5 cifras. 37Sentencia condicional ( if y switch )*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, aux, inv = 0, cifra;

        do {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();

            if (num < 0) {

                System.out.println("Número incorrecto, el número no puede ser menor que 0.");

            }
            else if  (num > 99999){

                System.out.println("Número incorrecto, el número no puede tener más de 5 cifras.");

            }
        } while (num < 0 || num > 99999);

        aux = num;

        while (aux != 0) {

            cifra = aux % 10;
            inv = inv * 10 + cifra;
            aux = aux / 10;

        }

        if (num == inv) {

            System.out.println("El número es capicúa.");

        } else {

            System.out.println("El número no es capicúa.");

        }

    }

}
