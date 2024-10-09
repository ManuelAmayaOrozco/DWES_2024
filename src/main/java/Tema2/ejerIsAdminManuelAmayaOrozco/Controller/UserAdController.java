package Tema2.ejerIsAdminManuelAmayaOrozco.Controller;

import Tema2.ejerIsAdminManuelAmayaOrozco.Model.RespuestaHTTP;
import Tema2.ejerIsAdminManuelAmayaOrozco.Model.UserAd;
import Tema2.ejerIsAdminManuelAmayaOrozco.Service.UserAdService;

public class UserAdController {

    private UserAdService service;

    public UserAdController() {

        this.service = new UserAdService();

    }

    public RespuestaHTTP login(String email, String password) {

        try {

            if (email == null || email.isEmpty())
                return new RespuestaHTTP(400, "Bad Request");
            if (password == null || password.isEmpty())
                return new RespuestaHTTP(400, "Bad Request");

            boolean respuestaService = service.login(email, password);

            return respuestaService ?
                    new RespuestaHTTP(200, "Login autorizado, bienvenido.") :
                    new RespuestaHTTP(401, "No autorizado") ;


        } catch(Exception e) {

            return new RespuestaHTTP(500, "Fatal Internal Error");

        }

    }

    public RespuestaHTTP getUserAdEmail(String email) {

        try {

            UserAd u = service.getUserAdEmail(email);

            return u != null ?
                    new RespuestaHTTP(200, "Todo OK (Usuario obtenido)", u) :
                    new RespuestaHTTP(400, "Bad Request") ;

        } catch (Exception e) {

            return new RespuestaHTTP(500, "Fatal Internal Error");

        }

    }

    public RespuestaHTTP insertUserAdEmail(String id, String email, String password, boolean admin) {

        try {

            UserAd u = service.insertUserAdEmail(id, email, password, admin);

            return u != null ?
                    new RespuestaHTTP(200, "Todo OK (Usuario insertado)") :
                    new RespuestaHTTP(400, "Bad Request") ;

        } catch (Exception e) {

            return new RespuestaHTTP(500, "Fatal Internal Error");

        }

    }

    public RespuestaHTTP updateUserAdEmail(UserAd u, String id, String email, String password, boolean admin) {

        try {

            UserAd uAct = service.updateUserAdEmail(u, id, email, password, admin);

            return uAct != null ?
                    new RespuestaHTTP(200, "Todo OK (Usuario modificado)") :
                    new RespuestaHTTP(400, "Bad Request") ;

        } catch (Exception e) {

            return new RespuestaHTTP(500, "Fatal Internal Error");

        }

    }

    public RespuestaHTTP deleteUserAdEmail(String email) {

        try {

            boolean u = service.deleteUserAdEmail(email);

            return u ?
                    new RespuestaHTTP(200, "Todo OK (Usuario eliminado)") :
                    new RespuestaHTTP(400, "Bad Request") ;

        } catch (Exception e) {

            return new RespuestaHTTP(500, "Fatal Internal Error");

        }

    }

}
