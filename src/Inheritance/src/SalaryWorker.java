package Inheritance.src;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class SalaryWorker extends Worker {

    private double annualSalary;



    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary)
    {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    //Getters, Setters, and ToString
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalaryWorker{annualSalary =\'"  +annualSalary + "\'} " + super.toString();
    }

    //Unique Methods
    public String toCSVDataRecord(){
        return this.getID() + ", " + this.getFirstName() + ", " + this.getLastName() + ", " + this.getTitle() + ", " + this.getYOB()+ ", " + this.getHourlyPayRate() + ", " + annualSalary;
    }

    public String toJSONRecord()
    {
        String retString = "";
        char DQ = '\u0022';
        retString =  "{" + DQ + "ID" + DQ + ":" + DQ + super.getID() + DQ + ",";
        retString += DQ + "firstName" + DQ + ":" + DQ + super.getFirstName() + DQ + ",";
        retString += " " + DQ + "lastName"  + DQ + ":" + DQ + super.getLastName() + DQ + ",";
        retString += " " + DQ + "Title"  + DQ + ":" + + DQ + super.getTitle() + DQ + ",";
        retString += " " + DQ + "YOB"  + DQ + ":" + super.getYOB() + ",";
        retString += " " + DQ + "hourlyPayRate"  + DQ + ":" + this.getHourlyPayRate() + ",";
        retString += " " + DQ + "annualSalary"  + DQ + ":" + annualSalary + "}";

        return retString;
    }

    public String toXMLRecord()
    {
        String retString = "";

        retString = "<SalaryWorker>" + "<ID>" + super.getID() + "</ID>";
        retString += "<firstName>" + super.getFirstName() + "</firstName>";
        retString += "<lastName>" + super.getLastName() + "</lastName>";
        retString += "<title>" + super.getTitle() + "</title>";
        retString += "<YOB>" + super.getYOB() + "</YOB>";
        retString += "<hourlyPayRate>" + this.getHourlyPayRate() + "</hourlyPayRate>";
        retString += "<annualSalary>" + annualSalary + "</annualSalary>" + "</SalaryWorker>";

        return retString;
    }

    public double calculateWeeklyPay (double hoursWorked)
    {
        return annualSalary/52;
    }

    public String displayWeeklyPay (double hoursWorked)
    {
        double weeklyPay = annualSalary/52;
        return "Each week you get paid $" + String.format("%.2f", (annualSalary/52)) + " which is 1.9% of your annual salary of $" + String.format("%.2f", (annualSalary));
    }
}

