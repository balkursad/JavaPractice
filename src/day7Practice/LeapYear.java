package day7Practice;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2010;

        int leap = year%4;
        boolean a= leap==0;

        System.out.println(year+ " is leap year: " + a );





    }





}
/*2. create a class named LeapYear, and write a program that can identify if the given year is leap Year, print true if it's leap year, otherwise print false

	        Ex:
	             if  year = 2020

	            output:
	                2020 is leap year: true

        Hint: if the number of year can be evenly divisible by 4 (with remainder of zero), it's leap year

 */
