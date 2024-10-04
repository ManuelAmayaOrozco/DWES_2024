package Tema2.ejerIsAdminManuelAmayaOrozco.Model;

import Tema2.Ejercicio4.Model.UserEmail;

public class RespuestaHTTP {
    private int codigoRespuesta;
    private String mensajeRespuesta;
    private UserAd userAd;

    public RespuestaHTTP(int codigoRespuesta, String mensajeRespuesta) {

        this.codigoRespuesta = codigoRespuesta;
        this.mensajeRespuesta = mensajeRespuesta;

    }

    public RespuestaHTTP(int codigoRespuesta, String mensajeRespuesta, UserAd userAd) {

        this.codigoRespuesta = codigoRespuesta;
        this.mensajeRespuesta = mensajeRespuesta;
        this.userAd = userAd;

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

    public UserAd getUserEmail() {
        return userAd;
    }

    public void setUserEmail(UserAd userAd) {
        this.userAd = userAd;
    }
}
