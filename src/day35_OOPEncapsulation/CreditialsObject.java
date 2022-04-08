package day35_OOPEncapsulation;

import javax.xml.namespace.QName;

public class CreditialsObject {

    public static void main(String[] args) {

        Credentials credentials = new Credentials("Kursad", "Kursad26");

        credentials.isStrongPassWord();
        System.out.println(credentials);



    }
}
