package Inheritance.src;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Main {

    public static void main(String args[])
    {
        ArrayList<Worker> EmployeeList = new ArrayList<>();
        Worker worker1 = new Worker("00001", "Bob", "Builder", "Sir", 1990, 15);
        EmployeeList.add(worker1);
        Worker worker2 = new Worker("00002", "Jim", "Plumber", "King", 1989, 13);
        EmployeeList.add(worker2);
        Worker worker3 = new Worker("00003", "Timothy", "Samuels", "Esq.", 2005, 20);
        EmployeeList.add(worker3);
        SalaryWorker SWorker1 = new SalaryWorker("00004", "Sally", "Worker", "Madam", 1999, 0, 123000);
        EmployeeList.add(SWorker1);
        SalaryWorker SWorker2 = new SalaryWorker("00005", "Leslie", "Pope", "Director", 1980, 0, 65000);
        EmployeeList.add(SWorker2);
        SalaryWorker SWorker3 = new SalaryWorker("00006", "Jimmy", "Test", "Sir", 2000, 0, 105000);
        EmployeeList.add(SWorker3);


        for (int i = 1; i <= 3; i++) {
            if(i == 2)
            {
                System.out.println("Week " + i +":");
                for (Worker weeklyWorker : EmployeeList)
                {
                    
                    System.out.print("Employee ID: " + weeklyWorker.getID() + " - ");
                    System.out.println(weeklyWorker.displayWeeklyPay(50));
                }
            } else
            {
                System.out.println("Week " + i +":");
                for (Worker weeklyWorker : EmployeeList)
                {
                    System.out.print("Employee ID: " + weeklyWorker.getID() + " - ");
                    System.out.println(weeklyWorker.displayWeeklyPay(40));
                }
            }
            System.out.println();
        }

    }

}
