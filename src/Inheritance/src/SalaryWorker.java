package Inheritance.src;

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
}

