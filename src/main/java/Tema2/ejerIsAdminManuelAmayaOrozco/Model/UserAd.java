package Tema2.ejerIsAdminManuelAmayaOrozco.Model;

import java.util.Objects;

public class UserAd {

    private String id;
    private String email;
    private String password;
    private boolean admin;

    public UserAd(String nombre, String email) {
        this.id = nombre;
        this.email = email;
    }

    public UserAd(String nombre, String email, String password) {
        this.id = nombre;
        this.email = email;
        this.password = password;
    }

    public UserAd(String nombre, String email, String password, boolean admin) {
        this.id = nombre;
        this.email = email;
        this.password = password;
        this.admin = admin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAd userAd = (UserAd) o;
        return admin == userAd.admin && Objects.equals(id, userAd.id) && Objects.equals(email, userAd.email) && Objects.equals(password, userAd.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, admin);
    }

    @Override
    public String toString() {
        return "UserAd{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", admin=" + admin +
                '}';
    }
}
