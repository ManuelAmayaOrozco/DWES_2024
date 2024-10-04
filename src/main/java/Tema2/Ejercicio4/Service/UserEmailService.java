package Tema2.Ejercicio4.Service;

import Tema2.Ejercicio4.Repository.UserEmailRepository;
import Tema2.Ejercicio4.Model.UserEmail;
import Tema2.Ejercicio4.Utils.EncryptUtil;


public class UserEmailService {

    //Variable UserEmailRepository
    private UserEmailRepository repository;

    public UserEmailService() {

        this.repository = new UserEmailRepository();

    }

    public boolean login(String email, String password) {

        //1º Campos OK

        //Comprobamos que terminan en @'dominio'.es o .com
        if (!email.matches("^\\w+@\\w+\\.(com|es)$")) {

            return false;

        }

        //2º Llamar a getUserEmail de repository
        UserEmail u = repository.getUserEmail(email);

        //3º Comprobar que el email existe
        if (u == null) return false;

        //4º Encriptar la password y comprobar que coinciden en la base de datos
        String passEncrypted = EncryptUtil.encryptPassword(password);

        //Comprobamos que  ambos campos coinciden
        return email.equals(u.getEmail()) && passEncrypted.equals(u.getPassword());

    }

    public UserEmail getUserEmail(String email) {

        //Comprobamos que email no este vacio
        if (email == null || email.isEmpty()) {

            return null;

        }

        //Obtenemos y devolvemos el UserEmail
        return repository.getUserEmail(email);

    }

    public UserEmail insertUserEmail(String nombre, String email, String password) {

        //Comprobamos que el nombre no empieza por símbolo
        CharSequence simbolos = "!#$~%&/()='*+,-.:;<>=?¿¡@[]^_`{}|€";

        if (nombre.contains(simbolos)) {

            return null;

        }

        //Comprobamos que el nombre tiene la longitud adecuada
        int minLen = 0;
        int maxLen = 15;

        if (nombre.length() < 0 || nombre.length() > 15) {

            return null;

        }

        //Comprobamos que email no este vacio
        if (email == null || email.isEmpty()) {

            return null;

        }

        //Comprobamos que terminan en @'dominio'.es o .com
        if (!email.matches("^\\w+@\\w+\\.(com|es)$")) {

            return null;

        }

        //Encriptamos la contraseña
        String passHashed = EncryptUtil.encryptPassword(password);

        //Obtenemos y devolvemos el UserEmail
        return repository.insertUserEmail(new UserEmail(nombre, email, passHashed));

    }

    public boolean deleteUserEmail(String email) {

        //Comprobamos que email no este vacio
        if (email == null || email.isEmpty()) {

            return false;

        }

        //Obtenemos y devolvemos el UserEmail
        repository.deleteUserEmail(email);

        return true;

    }
}
