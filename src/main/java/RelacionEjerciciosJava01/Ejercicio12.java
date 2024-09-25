package RelacionEjerciciosJava01;

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio12 {

    /*Ejercicio 12
    Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código
    promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códi- gos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
    respectivamente que no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros
    o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque los
    números no estén tabulados.

    Ejemplo:
    Introduzca la base imponible: 25
    Introduzca el tipo de IVA (general, reducido o superreducido): reducido
    Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
    Base imponible
    25.00
    IVA (10\%)
    2.50
    Precio con IVA
    27.50
    Cód. promo. (mitad): -13.75
    TOTAL
    13.75*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base imponible: ");
        double bimp = sc.nextDouble();
        double iva = 0;
        int rediva = 0;
        double preciva = 0;
        boolean paseiva = false;
        double cod = 0;
        String tcod = "";
        double preccod = 0;
        boolean pasecod = false;

        while (!paseiva) {

            System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
            String tiva = sc.next();

            switch (tiva) {
                case "general" -> {

                    rediva = 21;
                    iva = (bimp * rediva) / 100;
                    preciva = bimp + iva;
                    paseiva = true;

                }
                case "reducido" -> {

                    rediva = 10;
                    iva = (bimp * rediva) / 100;
                    preciva = bimp + iva;
                    paseiva = true;
                }
                case "superreducido" -> {

                    rediva = 4;
                    iva = (bimp * rediva) / 100;
                    preciva = bimp + iva;
                    paseiva = true;
                }
                case null, default -> System.out.println("IVA incorrecto.");
            }

        }

        while (!pasecod) {

            System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
            tcod = sc.next();

            switch (tcod) {
                case "nopro" -> {

                    cod = 0;
                    preccod = preciva;
                    pasecod = true;

                }
                case "mitad" -> {

                    cod = preciva / 2;
                    preccod = preciva - cod;
                    pasecod = true;

                }
                case "meno5" -> {

                    cod = 5;
                    preccod = preciva - cod;
                    pasecod = true;

                }
                case "5porc" -> {

                    cod = (preciva * 5) / 100;
                    preccod = preciva - cod;
                    pasecod = true;

                }
                case null, default -> System.out.println("Código incorrecto.");
            }

        }

        System.out.println("Base imponible");
        System.out.println(bimp);
        System.out.println("IVA (" + rediva + "/%)");
        System.out.println(iva);
        System.out.println("Precio con IVA");
        System.out.println(preciva);
        System.out.println("Cod. promo. (" + tcod + "): -" + cod);
        System.out.println("TOTAL");
        System.out.println(preccod);
    }

}
