package Tema2.Ejercicio4.Service;

import Tema2.Ejercicio4.Repository.UserEmailRepository;
import com.es.tema1.ejerEmail.model.UserEmail;


public class UserEmailService {

    //Variable UserEmailRepository
    private UserEmailRepository repository;

    public UserEmailService() {

        this.repository = new UserEmailRepository();

    }

    public UserEmail getUserEmail(String email) {

        //Comprobamos que email no este vacio
        if (email == null || email.isEmpty()) {

            return null;

        }

        //Obtenemos y devolvemos el UserEmail
        return repository.getUserEmail(email);

    }

    public UserEmail insertUserEmail(String nombre, String email) {

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

        //Obtenemos y devolvemos el UserEmail
        return repository.insertUserEmail(new UserEmail(nombre, email));

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
