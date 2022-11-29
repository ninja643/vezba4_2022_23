package rs.ac.ni.pmf.oop2.vezbe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Employee {
    private final int id;
    private String name;
    private double salary;

    public double getAnnualSalary() {
        return 12 * salary;
    }

    public void raiseSalary(final int percent) {
        salary = salary * (1 + percent / 100.0);
    }
}
