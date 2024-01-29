import Inheritance.src.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker w1;

    @BeforeEach
    void setUp() {
        w1 = new Worker("000001", "Bob", "Builder", "Sir", 1940, 20.20);
    }

    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(50.50);
        assertEquals(50.50,w1.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1111.00, w1.calculateWeeklyPay(50));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals(" Regular Pay: $808.00\t| Overtime: $303.00\t| Total: $1111.00", w1.displayWeeklyPay(50));
    }
}