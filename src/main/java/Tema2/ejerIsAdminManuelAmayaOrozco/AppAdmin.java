package Tema2.ejerIsAdminManuelAmayaOrozco;

import Tema2.ejerIsAdminManuelAmayaOrozco.Controller.UserAdController;
import Tema2.ejerIsAdminManuelAmayaOrozco.Model.RespuestaHTTP;
import Tema2.ejerIsAdminManuelAmayaOrozco.Model.UserAd;

import java.util.Scanner;

public class AppAdmin {

    public static void main(String[] args) {

        UserAdController controller = new UserAdController();

        System.out.println("Bienvenid@, por favor inicie sesión para acceder al menú.");
        Scanner scan = new Scanner(System.in);

        System.out.print("EMAIL: ");
        String emailV = scan.nextLine();

        System.out.print("CONTRASEÑA: ");
        String passV = scan.nextLine();

        RespuestaHTTP login = controller.login(emailV, passV);

        if (login.getCodigoRespuesta() == 200) {

            UserAd userAd = controller.getUserAdEmail(emailV).getUserAd();

            System.out.println(login.getMensajeRespuesta());

            String opcion = "";

            while (!opcion.equals("0")) {

                if (userAd.isAdmin()) {

                    System.out.println("""
                    MENÚ:
                    \t1. CONSULTA
                    \t2. MODIFICACIÓN
                    \t3. BAJA
                    \t4. ALTA
                    \t0. SALIR
                    """);

                    opcion = scan.nextLine();

                    switch (opcion) {

                        case "1":
                            System.out.println("Consultar usuario");

                            System.out.print("Inserte el email del usuario que desea consultar: ");
                            String email = scan.nextLine();

                            RespuestaHTTP rGet = controller.getUserAdEmail(email);

                            if (rGet.getCodigoRespuesta() == 200) {
                                System.out.println(rGet.getUserAd());
                            } else {
                                System.out.println(rGet.getMensajeRespuesta());
                            }
                            break;

                        case "2":
                            System.out.println("Modificar usuario");

                            System.out.print("Inserte el email del usuario que desea modificar: ");
                            String emailAct = scan.nextLine();

                            RespuestaHTTP confirmEmail = controller.getUserAdEmail(emailAct);
                            UserAd uOld = confirmEmail.getUserAd();

                            if (confirmEmail.getCodigoRespuesta() == 200) {

                                System.out.print("Inserte el nuevo ID: ");
                                String actID = scan.nextLine();
                                System.out.print("Inserte el nuevo email: ");
                                String actEmail = scan.nextLine();
                                System.out.print("Inserte la nueva contraseña: ");
                                String actPassword = scan.nextLine();

                                boolean valAdmin = false;
                                boolean actAdmin = false;

                                while (!valAdmin) {

                                    System.out.print("¿Conceder permisos de administrador? (si/no): ");
                                    String actAdminS = scan.nextLine();

                                    if (actAdminS.equalsIgnoreCase("si")) {

                                        actAdmin = true;
                                        valAdmin = true;

                                    }
                                    else if (actAdminS.equalsIgnoreCase("no")) {

                                        valAdmin = true;

                                    }
                                    else {

                                        System.out.println("Opción no válida, vuelva a intentarlo.");

                                    }

                                }

                                RespuestaHTTP rUpdate = controller.updateUserAdEmail(uOld, actID, actEmail, actPassword, actAdmin);

                                if (rUpdate.getCodigoRespuesta() == 200) {
                                    System.out.println(rUpdate.getMensajeRespuesta());
                                } else {
                                    System.out.println(rUpdate.getMensajeRespuesta());
                                }

                                break;

                            } else {

                                System.out.println("El email del usuario introducido no existe");
                                System.out.println(confirmEmail.getMensajeRespuesta());

                                break;

                            }

                        case "3":
                            System.out.println("Dar de baja a usuario");

                            System.out.print("Inserte el email del usuario a dar de baja: ");
                            String bajaEmail = scan.nextLine();

                            RespuestaHTTP rEliminar = controller.deleteUserAdEmail(bajaEmail);

                            if (rEliminar.getCodigoRespuesta() == 200) {
                                System.out.println(rEliminar.getMensajeRespuesta());
                            } else {
                                System.out.println(rEliminar.getMensajeRespuesta());
                            }

                            break;

                        case "4":
                            System.out.println("Dar de alta a usuario");

                            System.out.print("Inserte el ID del nuevo usuario: ");
                            String newID = scan.nextLine();
                            System.out.print("Inserte el email del nuevo usuario: ");
                            String newEmail = scan.nextLine();
                            System.out.print("Inserte la contraseña del nuevo usuario: ");
                            String newPassword = scan.nextLine();

                            boolean valAdmin = false;
                            boolean newAdmin = false;

                            while (!valAdmin) {

                                System.out.print("¿Conceder permisos de administrador? (si/no): ");
                                String actAdminS = scan.nextLine();

                                if (actAdminS.equalsIgnoreCase("si")) {

                                    newAdmin = true;
                                    valAdmin = true;

                                } else if (actAdminS.equalsIgnoreCase("no")) {

                                    valAdmin = true;

                                } else {

                                    System.out.println("Opción no válida, vuelva a intentarlo.");

                                }

                            }

                                RespuestaHTTP rInsert = controller.insertUserAdEmail(newID, newEmail, newPassword, newAdmin);

                                if (rInsert.getCodigoRespuesta() == 200) {
                                    System.out.println(rInsert.getMensajeRespuesta());
                                } else {
                                    System.out.println(rInsert.getMensajeRespuesta());
                                }

                                break;

                        case "0":
                            System.out.println("Sesión cerrada correctamente.");
                            break;

                        default:
                            System.out.println("Error! Elija opción entre 0 y 4");
                            break;

                    }

                }

                else {

                    System.out.println("""
                    MENÚ:
                    \t1. CONSULTA
                    \t0. SALIR
                    """);

                    opcion = scan.nextLine();

                    switch (opcion) {

                        case "1":
                            System.out.println("Inserte el email: ");

                            String email = scan.nextLine();
                            RespuestaHTTP rGet = controller.getUserAdEmail(email);

                            if (rGet.getCodigoRespuesta() == 200) {
                                System.out.println(rGet.getUserAd());
                            } else {
                                System.out.println(rGet.getMensajeRespuesta());
                            }
                            break;

                        case "0":
                            System.out.println("Sesión cerrada correctamente.");
                            break;

                        default:
                            System.out.println("Error! Elija opción entre 0 y 1");
                            break;

                    }

                }


            }

        }

        else {

            System.out.println("Acceso denegado, usuario o contraseña incorrectos.");
            System.out.println(login.getMensajeRespuesta());

        }


    }

}
