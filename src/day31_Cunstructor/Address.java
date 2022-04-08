package day31_Cunstructor;

public class Address {

    public int buildNumber;
    public String street, city, state;
    public int zipCode;

    public Address(int buildNumber, String street, String city, String state, int zipCode) {
        this.buildNumber = buildNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildNumber+" "+street+" \n"+city+" "+state+", "+zipCode;
    }
}
