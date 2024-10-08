package Tema2.ejerIsAdminManuelAmayaOrozco.Service;

import Tema2.ejerIsAdminManuelAmayaOrozco.Model.UserAd;

public interface UserAdServiceAPI {

    public boolean login(String email, String password);

    public UserAd getUserAdEmail(String email);

    public UserAd insertUserEmail(String id, String email, String password, boolean admin);

    public boolean deleteUserEmail(String email);

}
