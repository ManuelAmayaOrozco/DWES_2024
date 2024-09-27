package Tema2.Ejercicio1;

import Tema2.Ejercicio1.Clases.Persona;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Tipo nombre = new Tipo()
        ArrayList<Persona> listaUsers = new ArrayList<>();

        listaUsers.add(new Persona("Manuel", "abcdefg"));
        listaUsers.add(new Persona("Persona2", "hijklm"));
        listaUsers.add(new Persona("Persona3", "mmmmmmmm"));
        listaUsers.add(new Persona("Persona4", "AAAAAAAAA"));
        listaUsers.add(new Persona("Persona5", "EEEEEEEE"));

        boolean correcto = false;

        while (!correcto) {

            boolean nomcor = false;
            boolean concor = false;

            System.out.print("Introduce tu nombre: ");
            String nom = sc.next();

            System.out.print("Introduce tu contraseña: ");
            String con = sc.next();

            if (Objects.equals(nom, "0") || Objects.equals(con, "0")) {

                correcto = true;

            }
            else {

                for (Persona user : listaUsers) {

                    if (Objects.equals(user.getNombre(), nom)) {
                        nomcor = true;
                    }

                    if (Objects.equals(user.getContrasenia(), con)) {
                        concor = true;
                    }

                }

                if (nomcor && concor) {

                    System.out.println("Usuario verificado correctamente");
                    correcto = true;

                }
                else {

                    System.out.println("Usuario incorrecto, vuelve a intentarlo.");

                }

            }

        }

    }

}
