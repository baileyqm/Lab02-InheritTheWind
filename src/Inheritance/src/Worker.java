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

    public String toCSVDataRecord(){
        return this.getID() + ", " + this.getFirstName() + ", " + this.getLastName() + ", " + this.getTitle() + ", " + this.getYOB()+ ", "+ hourlyPayRate;
    }


    public String toJSONRecord()
    {
        String retString = "";
        char DQ = '\u0022';
        retString =  "{" + DQ + "ID" + DQ + ":" + DQ + super.getID() + DQ + ",";
        retString += DQ + "firstName" + DQ + ":" + DQ + super.getFirstName() + DQ + ",";
        retString += " " + DQ + "lastName"  + DQ + ":" + DQ + super.getLastName() + DQ + ",";
        retString += " " + DQ + "Title"  + DQ + ":" + + DQ + super.getTitle() + DQ;
        retString += " " + DQ + "YOB"  + DQ + ":" + super.getYOB();
        retString += " " + DQ + "hourlyPayRate"  + DQ + ":" + hourlyPayRate + "}";

        return retString;
    }


    public String toXMLRecord()
    {
        String retString = "";

        retString = "<Worker>" + "<ID>" + super.getID() + "</ID>";
        retString += "<firstName>" + super.getFirstName() + "</firstName>";
        retString += "<lastName>" + super.getLastName() + "</lastName>";
        retString += "<title>" + super.getTitle() + "</title>";
        retString += "<YOB>" + super.getYOB() + "</YOB>";
        retString += "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate>" + "</Worker>";

        return retString;
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
            return " Regular Pay: $" + String.format("%.2f", 0.0) + "\t| Overtime: $" + String.format("%.2f", 0.0) + "\t| Total: $" + String.format("%.2f", 0.0);

        } else if (hoursWorked <= 40)
        {
            return " Regular Pay: $"+ String.format("%.2f", (hoursWorked*hourlyPayRate)) + "\t| Overtime: $" + String.format("%.2f", 0.0) + "\t| Total: $" + String.format("%.2f",(hoursWorked*hourlyPayRate))  ;
        } else
        {
            return " Regular Pay: $" + String.format("%.2f", (40*hourlyPayRate))  + "\t| Overtime: $" + String.format("%.2f", ((hoursWorked - 40) * (1.5 * hourlyPayRate)))  + "\t| Total: $" + String.format("%.2f", (((hoursWorked - 40) * (1.5 * hourlyPayRate)) +(40*hourlyPayRate)));
        }
    }

        // To create a rounded decimal: String.format("%.2f", )

}
