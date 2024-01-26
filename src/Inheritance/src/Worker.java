package Inheritance.src;

public class Worker extends Person {
    private double hourlyPayRate;


    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    //Getters, Setters, and ToString

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "Worker{" +
            "hourlyPayRate='" + hourlyPayRate + "\'}"  + super.toString();
    }

    //Unique Methods
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
            return "\n\t| Regular Pay: 0 \n\t| Overtime: 0 \n\t| Total: 0";

        } else if (hoursWorked <= 40)
        {
            return "\n\t| Regular Pay: "+ (hoursWorked*hourlyPayRate) + "\n\t| Overtime: 0 \n\t| Total: " + (hoursWorked*hourlyPayRate);
        } else
        {
            return "\n\t| Regular Pay: " + (40*hourlyPayRate) + "\n\t| Overtime: " + ((hoursWorked - 40) * (1.5 * hourlyPayRate)) + "\n\t| Total: " + (((hoursWorked - 40) * (1.5 * hourlyPayRate)) +(40*hourlyPayRate)) ;
        }
    }



}
