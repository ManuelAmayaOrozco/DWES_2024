package Tema2.ejerIsAdminManuelAmayaOrozco.Service;

import Tema2.ejerIsAdminManuelAmayaOrozco.Model.UserAd;

public interface UserAdServiceAPI {

    public boolean login(String email, String password);

    public UserAd getUserAdEmail(String email);

    public UserAd insertUserAdEmail(String id, String email, String password, boolean admin);

    public UserAd updateUserAdEmail(UserAd u, String id, String email, String password, boolean admin);

    public boolean deleteUserAdEmail(String email);

}
