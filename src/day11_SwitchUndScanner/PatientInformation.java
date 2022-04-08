package day11_SwitchUndScanner;
import java.util.Scanner;
public class PatientInformation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age, zipcode;
        double height,weight;
        boolean isMarried ;
        long workPhonenumber, personalPhonenumber;
        String firstName, lastName, fullName, eMail, street, state, city, address, contacts;

        System.out.println("Welcome to the patient portal!\n" +
                "Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.next();

        System.out.println("Enter your last name");
        lastName = scan.next();

        System.out.println("Enter your email");
        eMail = scan.next();

        scan.nextLine();
        System.out.println("Enter your street");
        street = scan.nextLine();

        System.out.println("Enter your city");
        city = scan.nextLine();

        System.out.println("Enter your state");
        state = scan.nextLine();

        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();

        System.out.println("Enter your work phone number");
        workPhonenumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        personalPhonenumber = scan.nextLong();

        System.out.println("Enter your age");
        age = scan.nextInt();

        System.out.println("Enter your height");
        height = scan.nextDouble();

        System.out.println("Enter your weight");
        weight = scan.nextDouble();

        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();

        System.out.println("Patient personal information Full name: "+lastName+","+firstName+" Address: "+street+","+city+","+state+
                " "+zipcode+ " Contacts: work phone number - "+workPhonenumber+", personal phone number - "+personalPhonenumber+", e-mail: "+eMail+
                " Age: "+age+" Heiight: "+height+" Weight: "+weight+" pounds Married?: "+isMarried);




        }










}
