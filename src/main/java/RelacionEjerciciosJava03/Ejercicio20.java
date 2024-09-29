package RelacionEjerciciosJava03;

import java.util.Scanner;

public class Ejercicio20 {

    /*Ejercicio 20
    Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la pirámide: ");

        int size = sc.nextInt();

        System.out.print("Introduce el símbolo a usar: ");

        char symb = sc.next().charAt(0);

        System.out.println();

        for(int alt = 1; alt <= size; alt++){

            for(int space = 1; space <= size - alt; space++){

                System.out.print(" ");

            }

            for(int symbnum = 1; symbnum <= ( alt * 2 ) - 1; symbnum++){

                if (alt == size) {

                    System.out.print(symb);

                }
                else {

                    if (symbnum == 1 || symbnum == ( alt * 2 ) - 1) {

                        System.out.print(symb);

                    }
                    else {

                        System.out.print(" ");

                    }

                }

            }
            System.out.println();
        }
    }

}
