package Inheritance.src;

public class Worker extends Person {
    private double hourlyPayRate;


    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }


    public double calculateWeeklyPay(double hoursWorked)
    {
        if(hoursWorked <= 0)
        {
            return 0;

        } else if (hoursWorked <= 40)
        {
            return (hoursWorked * hourlyPayRate);
        } else
        {
            return (40 * hourlyPayRate) + ((hoursWorked - 40) * (1.5 * hourlyPayRate));
        }
    }

    public String displayWeeklyPay(double hoursWorked){
        if(hoursWorked <= 0)
        {
            return "Regular Pay: 0 | Overtime: 0 | Total: 0";

        } else if (hoursWorked <= 40)
        {
            return "Regular Pay: "+ (hoursWorked*hourlyPayRate) + "| Overtime: 0 | Total: " + (hoursWorked*hourlyPayRate);
        } else
        {
            return "Regular Pay: " + (40*hourlyPayRate) + "| Overtime: " + ((hoursWorked - 40) * (1.5 * hourlyPayRate)) + " | Total: " + (((hoursWorked - 40) * (1.5 * hourlyPayRate)) +(40*hourlyPayRate)) ;
        }
    }



}
