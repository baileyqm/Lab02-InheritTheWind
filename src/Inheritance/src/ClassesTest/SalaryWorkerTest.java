import Inheritance.src.SalaryWorker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker s1;
    @BeforeEach
    void setUp() {
        s1 = new SalaryWorker("000001", "Sally", "Worker", "Ma\'am",1980,0, 123000);
    }

    @Test
    void setAnnualSalary() {
        s1.setAnnualSalary(90000);
        assertEquals(90000,s1.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(2365.3846153846152,s1.calculateWeeklyPay(0));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Each week you get paid $2365.38 which is 1.9% of your annual salary of $123000.00", s1.displayWeeklyPay(0));
    }
}