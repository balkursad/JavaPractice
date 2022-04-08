package day10_NestedIf_Ternary;

import org.w3c.dom.ls.LSOutput;

public class Loans {
    public static void main(String[] args) {
        int creditScore = 750, salary = 70000;
        String canLoan= (creditScore>650&&salary>60000)? "Loan Approved" : "Loan Denied" ;
        System.out.println(canLoan);


    }


}
