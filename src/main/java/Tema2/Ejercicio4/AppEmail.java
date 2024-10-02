package Tema2.Ejercicio4;

import Tema2.Ejercicio4.Controller.UserEmailController;
import Tema2.Ejercicio4.Model.RespuestaHTTP;

import java.util.Scanner;

public class AppEmail {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserEmailController controller = new UserEmailController();

        System.out.println("Bienvenido a la app más molona del mundo");

        String opcion = "";


        while (!opcion.equals("0")) {

            System.out.println("""
                    Elija opción:
                    \t1. Insertar usuario
                    \t2. Obtener usuario
                    \t3. Eliminar usuario
                    \to. Salir
                    """);
            opcion = sc.nextLine();

            switch(opcion) {

                case "1" -> {

                }
                case "2" -> {

                    System.out.println("Inserte el email:");
                    String email = sc.nextLine();
                    RespuestaHTTP r = controller.getUserEmail(email);

                    if (r.getCodigoRespuesta() == 200) {

                        System.out.println(r.getUserEmail().toString());

                    }
                    else {

                        System.out.println(r.getMensajeRespuesta());

                    }
                    break;

                }
                case "3" -> {

                    System.out.println("Inserte el email:");
                    String email = sc.nextLine();
                    RespuestaHTTP r = controller.deleteUserEmail(email);

                    if (r.getCodigoRespuesta() == 200) {

                        System.out.println(r.getUserEmail().toString());

                    }
                    else {

                        System.out.println(r.getMensajeRespuesta());

                    }
                    break;

                }
                case "0" -> {

                    System.out.println("Adios");

                }
                default -> {

                    System.out.println("Error! Elija entre 0 y 3");

                }


            }

        }

        controller.insertUserEmail("Manuel", "dede@dekjd.com");


    }

}
