package Inheritance.src;

public class Main {

    public static void main(String args[])
    {
        Worker testWorker = new Worker("00001", "Bob", "Test", "Sir", 9032, 5);

        System.out.println("40 HRS: " + testWorker.displayWeeklyPay(40));

        System.out.println("0 HRS: " + testWorker.displayWeeklyPay(0));

        System.out.println("-10 HRS: " + testWorker.displayWeeklyPay(-10));

        System.out.println("70 HRS: \n" + testWorker.displayWeeklyPay(70));

    }

}
