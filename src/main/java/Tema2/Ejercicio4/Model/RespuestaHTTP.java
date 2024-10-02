package Tema2.Ejercicio4.Model;

import com.es.tema1.ejerEmail.model.UserEmail;

public class RespuestaHTTP {

    private int codigoRespuesta;
    private String mensajeRespuesta;
    private UserEmail userEmail;

    public RespuestaHTTP(int codigoRespuesta, String mensajeRespuesta) {

        this.codigoRespuesta = codigoRespuesta;
        this.mensajeRespuesta = mensajeRespuesta;

    }

    public RespuestaHTTP(int codigoRespuesta, String mensajeRespuesta, UserEmail userEmail) {

        this.codigoRespuesta = codigoRespuesta;
        this.mensajeRespuesta = mensajeRespuesta;
        this.userEmail = userEmail;

    }

    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    public void setMensajeRespuesta(String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    public int getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuesta(int codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }

    public UserEmail getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(UserEmail userEmail) {
        this.userEmail = userEmail;
    }
}
