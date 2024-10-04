package Tema2.Ejercicio4.Utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtil {

    /*
    Método que recibe la password sin encriptar,
     */

    public static String encryptPassword(String password) {

        try {

            //MessageDigest contiene los métodos para encriptar
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hashBytes = digest.digest(password.getBytes(StandardCharsets.UTF_8));

            StringBuilder passwordHashed = new StringBuilder();
            for (byte b: hashBytes) {

                String hex = String.format("%02x", b);
                passwordHashed.append(hex);

            }

            return passwordHashed.toString();

        } catch(NoSuchAlgorithmException e) {

            e.printStackTrace();

        }

        return "";

    }

}
