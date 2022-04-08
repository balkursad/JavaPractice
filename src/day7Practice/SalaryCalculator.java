package day7Practice;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 18;
        int weeklyHours = 40;
        double stateTaxRate = 3;
        double federalTaxRate = 20;

        double salaryBeforeTax = hourlyRate*weeklyHours*52;
        double stateTax = stateTaxRate*weeklyHours*52;
        double federalTax = federalTaxRate*5*52;//Hafta ici gunler
        double TotalTax = stateTax+federalTax;
        double salaryAfterTax = salaryBeforeTax-TotalTax;

        System.out.println("Gross pay is "+salaryBeforeTax);
        System.out.println("Federal tax is "+ federalTax);
        System.out.println("State tax is "+ stateTax);
        System.out.println("Total tax is "+TotalTax);
        System.out.println("Net income is "+salaryAfterTax);





    }





}
/*3. Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax (saat basina 3 aldım)
					3. federalTax (gün basına 20 aldım)
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
					   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560

 */
