package day31_Cunstructor;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        double salary = hourlyRate*weeklyHours*52;
        return salary;
    }

    public double stateTax(){
       return stateTaxRate*weeklyHours*52;
    }

    public double federalTax(){
        return (federalTaxRate*weeklyHours*52);
    }

    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary() +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}
