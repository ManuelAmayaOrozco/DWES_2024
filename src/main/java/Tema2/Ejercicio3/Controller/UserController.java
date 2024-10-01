package Tema2.Ejercicio3.Controller;

import Tema2.Ejercicio3.Clases.ResponseEntity;
import Tema2.Ejercicio3.Services.UserService;

public class UserController {

    /**
     * Recordamos que controller se encarga de administrar las peticiones y respuestas http
     */

    UserService userService = new UserService();

    //Funcion de delete del controller
    public ResponseEntity deleteUser(String nombre) {

        try {

            //Si el controller obtiene un true, significa que todo ha ido bien y que se ha eliminado correctamente
            //TODO: Funcion Service
            return userService.deleteUser(nombre) ? new ResponseEntity(200, "Usuario eliminado") :
                                                    new ResponseEntity(400, "Bad Request");

        } catch (Exception e) {

            //Si capturamos una excepcion, significa que ha habido un error interno del sistema
            return new ResponseEntity(500, "Una excepción ha ocurrido");

        }

    }

    //Implementacion del getUser()
    public ResponseEntity getUser(String nombre) {

        try {

            //Si el controller obtiene un true, significa que todo ha ido bien y que existe el usuario
            return userService.getUser(nombre) ? new ResponseEntity(200, "Usuario existe.") :
                    new ResponseEntity(400, "Bad Request");

        } catch (Exception e) {

            //Si capturamos una excepcion, significa que ha habido un error interno del sistema
            return new ResponseEntity(500, "Una excepción ha ocurrido");

        }

    }

    public ResponseEntity insertUser(String nombre, String pass) {

        try {

            //Si el controller obtiene un true, significa que todo ha ido bien y que el usuario ha sido añadido correctamente
            return userService.insertUser(nombre, pass) ? new ResponseEntity(201, "Usuario añadido.") :
                    new ResponseEntity(400, "Bad Request");

        } catch (Exception e) {

            //Si capturamos una excepcion, significa que ha habido un error interno del sistema
            return new ResponseEntity(500, "Una excepción ha ocurrido");

        }

    }

}
