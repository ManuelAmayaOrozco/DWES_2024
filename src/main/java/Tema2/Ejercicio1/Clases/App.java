package Tema2.Ejercicio1.Clases;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Manuel", "abcdefg"));
        personas.add(new Persona("Persona2", "hijklm"));
        personas.add(new Persona("Persona3", "mmmmmmmm"));
        personas.add(new Persona("Persona4", "AAAAAAAAA"));
        personas.add(new Persona("Persona5", "EEEEEEEE"));

        boolean correcto = false;

        while (!correcto) {

            boolean nomcor = false;
            boolean concor = false;

            System.out.print("Introduce tu nombre: ");
            String nom = sc.next();

            System.out.print("Introduce tu contraseña: ");
            String con = sc.next();

            for (Persona persona: personas) {

                if (Objects.equals(persona.nombre, nom)) {
                    nomcor = true;
                }

                if (Objects.equals(persona.contrasenia, con)) {
                    concor = true;
                }

                if (nomcor && concor) {

                    correcto = true;

                }

            }

        }

    }

}
