package Tema2.Ejercicio4.Controller;

import Tema2.Ejercicio4.Model.RespuestaHTTP;
import Tema2.Ejercicio4.Service.UserEmailService;
import Tema2.Ejercicio4.Model.UserEmail;


public class UserEmailController {

    private UserEmailService service;

    public UserEmailController() {

        this.service = new UserEmailService();

    }

    public RespuestaHTTP login(String email, String password) {

        try {

            if (email == null || email.isEmpty())
                return new RespuestaHTTP(400, "Bad Request");
            if (password == null || password.isEmpty())
                return new RespuestaHTTP(400, "Bad Request");

            boolean respuestaService = service.login(email, password);

            return respuestaService ?
                    new RespuestaHTTP(200, "OK") :
                    new RespuestaHTTP(401, "No autorizado") ;


        } catch(Exception e) {

            return new RespuestaHTTP(500, "Fatal Internal Error");

        }

    }

    public RespuestaHTTP getUserEmail(String email) {

        try {

            UserEmail u = service.getUserEmail(email);

            return u != null ?
                    new RespuestaHTTP(200, "Todo OK (Usuario obtenido)") :
                    new RespuestaHTTP(400, "Bad Request") ;

        } catch (Exception e) {

            return new RespuestaHTTP(500, "Fatal Internal Error");

        }

    }

    public RespuestaHTTP insertUserEmail(String nombre, String email, String password) {

        try {

            UserEmail u = service.insertUserEmail(nombre, email, password);

            return u != null ?
                    new RespuestaHTTP(200, "Todo OK (Usuario insertado)") :
                    new RespuestaHTTP(400, "Bad Request") ;

        } catch (Exception e) {

            return new RespuestaHTTP(500, "Fatal Internal Error");

        }

    }

    public RespuestaHTTP deleteUserEmail(String email) {

        try {

            boolean u = service.deleteUserEmail(email);

            return u ?
                    new RespuestaHTTP(200, "Todo OK (Usuario eliminado)") :
                    new RespuestaHTTP(400, "Bad Request") ;

        } catch (Exception e) {

            return new RespuestaHTTP(500, "Fatal Internal Error");

        }

    }

}
