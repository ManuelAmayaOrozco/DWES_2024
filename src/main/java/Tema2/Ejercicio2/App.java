package Tema2.Ejercicio2;

import Tema2.Ejercicio2.Clases.User;
import Tema2.Ejercicio2.Repositories.UserRepository;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserRepository userRepository = new UserRepository();

        // Menu
        /*
        1. Añadir
        2. Buscar
        3. Actualizar
        4. Eliminar
         */

        System.out.println("---- MENU ----");
        System.out.println("1. AÑADIR");
        System.out.println("2. BUSCAR");
        System.out.println("3. ACTUALIZAR");
        System.out.println("4. ELIMINAR");

        int opt = sc.nextInt();

        switch (opt) {
            case 1 -> {

                System.out.print("Introduce el nombre del nuevo usuario: ");
                String nom = sc.next();

                System.out.print("Introduce la contraseña del nuevo usuario: ");
                String con = sc.next();

                userRepository.addUser(nom, con);

            }
            case 2 -> {

                System.out.print("Introduce el nombre del usuario: ");
                String nom = sc.next();

                userRepository.getUser(nom);

            }
            case 3 -> {

                System.out.print("Introduce el nombre del usuario: ");
                String nom = sc.next();

                User usuario = userRepository.getUser(nom);

                userRepository.modifyUser(nom, usuario);

            }
            case 4 -> {

                System.out.print("Introduce el nombre del usuario: ");
                String nom = sc.next();

                userRepository.deleteUser(nom);

            }
        }

    }

}
