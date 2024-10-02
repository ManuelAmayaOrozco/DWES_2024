package Tema2.Ejercicio4.Repository;

import com.es.tema1.ejerEmail.model.UserEmail;

public interface UserEmailRepositoryAPI {

    //Voy a definir los metodos que despues implementaremos
    UserEmail getUserEmail(String email);

    UserEmail insertUserEmail(com.es.tema1.ejerEmail.model.UserEmail u);

    boolean deleteUserEmail(String email);
}
