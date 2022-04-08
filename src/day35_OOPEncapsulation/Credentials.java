package day35_OOPEncapsulation;

import java.sql.Array;

public class Credentials {

    private String username;
    private String password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStrongPassWord(){
        boolean strong1 = password.length()>8&&!(password.contains(" "));
        boolean strong2 = false;
        boolean strong3 = false;
        boolean strong4 = false;
        boolean strong5 = false;

        char [] strongPass = password.toCharArray();

        for (char pass : strongPass) {
            if (Character.isLetter(pass)){
                strong2=true;
            }else
            if (Character.isDigit(pass)){
                strong3=true;
            }else
              {
                strong4 = true;
            }

        }
        strong5 = strong1&&strong2&&strong3&&strong4;
        return strong5;


    }

    public String toString() {

        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + isStrongPassWord() + '\'' +
                '}';
    }
}
