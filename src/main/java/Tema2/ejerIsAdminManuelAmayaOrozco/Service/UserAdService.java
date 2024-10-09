package Tema2.ejerIsAdminManuelAmayaOrozco.Service;

import Tema2.ejerIsAdminManuelAmayaOrozco.Model.UserAd;
import Tema2.ejerIsAdminManuelAmayaOrozco.Repository.UserAdRepository;
import Tema2.ejerIsAdminManuelAmayaOrozco.Utils.EncryptUtil;

public class UserAdService implements UserAdServiceAPI{

    //Variable UserEmailRepository
    private UserAdRepository repository;

    public UserAdService() {

        this.repository = new UserAdRepository();

    }

    @Override
    public boolean login(String email, String password) {

        //1º Campos OK

        //Comprobamos que terminan en @'dominio'.es o .com
        if (!email.matches("^\\w+@\\w+\\.(com|es)$")) {

            return false;

        }

        //2º Llamar a getUserAdEmail de repository
        UserAd u = repository.getUserAdEmail(email);

        //3º Comprobar que el email existe
        if (u == null) return false;

        //4º Encriptar la password y comprobar que coinciden en la base de datos
        String passEncrypted = EncryptUtil.encryptPassword(password);

        //Comprobamos que  ambos campos coinciden
        return email.equals(u.getEmail()) && passEncrypted.equals(u.getPassword());

    }

    @Override
    public UserAd getUserAdEmail(String email) {

        //Comprobamos que email no este vacio
        if (email == null || email.isEmpty()) {

            return null;

        }

        //Obtenemos y devolvemos el UserAd
        return repository.getUserAdEmail(email);

    }

    @Override
    public UserAd insertUserAdEmail(String id, String email, String password, boolean admin) {

        //Comprobamos que correo y contraseña tienen la longitud adecuada
        int maxLen = 15;

        if (password.length() > maxLen || email.length() > maxLen) {

            return null;

        }

        //Comprobamos que email no este vacio
        if (email == null || email.isEmpty()) {

            return null;

        }

        //Comprobamos que no hay duplicados
        if (getUserAdEmail(email) != null) {

            return null;

        }

        //Comprobamos que terminan en @'dominio'.es o .com
        if (!email.matches("^\\w+@\\w+\\.(com|es)$")) {

            return null;

        }

        //Encriptamos la contraseña
        String passHashed = EncryptUtil.encryptPassword(password);

        //Obtenemos y devolvemos el UserAd
        return repository.insertUserAdEmail(new UserAd(id, email, passHashed, admin));

    }

    @Override
    public UserAd updateUserAdEmail(UserAd u, String id, String email, String password, boolean admin) {

        //Comprobamos que correo y contraseña tienen la longitud adecuada
        int maxLen = 15;

        if (password.length() > maxLen || email.length() > maxLen) {

            return null;

        }

        //Comprobamos que email no este vacio
        if (email == null || email.isEmpty()) {

            return null;

        }

        //Comprobamos que no hay duplicados
        if (getUserAdEmail(email) != null) {

            return null;

        }

        //Comprobamos que terminan en @'dominio'.es o .com
        if (!email.matches("^\\w+@\\w+\\.(com|es)$")) {

            return null;

        }

        //Encriptamos la contraseña
        String passHashed = EncryptUtil.encryptPassword(password);

        //Obtenemos y devolvemos el UserAd
        return repository.updateUserAdEmail(u, new UserAd(id, email, passHashed, admin));

    }

    @Override
    public boolean deleteUserAdEmail(String email) {

        //Comprobamos que email no este vacio
        if (email == null || email.isEmpty()) {

            return false;

        }

        //Obtenemos y devolvemos el UserAd
        repository.deleteUserAdEmail(email);

        return true;

    }
}
