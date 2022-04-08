package day11_SwitchUndScanner;

import java.util.Scanner;

public class SelectBrowser {
    public static void main(String[] args) {
        String BrowserName = "edge";
        switch (BrowserName){
            case "chrome":
                System.out.println("BrowserName = " + BrowserName);
                break;
            case "edge":
                System.out.println("BrowserName = " + BrowserName);
                break;
            case "firefox":
                System.out.println("BrowserName = " + BrowserName);
                break;
            case "opera":
                System.out.println("BrowserName = " + BrowserName);
                break;
            default:
                System.out.println("invalid Browse Name");
        }
           /* Scanner scan = new Scanner(System.in);
            String BrowserName2 = scan.nextLine();
        switch (BrowserName2){
            case "chrome":
                System.out.println("BrowserName = " + BrowserName);
                break;
            case "edge":
                System.out.println("BrowserName = " + BrowserName);
                break;
            case "firefox":
                System.out.println("BrowserName = " + BrowserName);
                break;
            case "opera":
                System.out.println("BrowserName = " + BrowserName);
                break;
            default:
                System.out.println("invalid Browse Name");
        }

            */

    }


}
/*
3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary

 */
