package ReviewClass;

import java.util.Scanner;

public class email {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String title = "Please enter a valid E-Mail: ";
        System.out.println(title);
        String email = scan.next();

        String name = email.substring(0, email.indexOf("_"));
        String lastname = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        String who = email.substring(email.indexOf("@")+1 , email.indexOf("."));
        System.out.println("name = " + name);
        System.out.println("lastname = " + lastname);
        System.out.println("who = " + who);


    }
}
