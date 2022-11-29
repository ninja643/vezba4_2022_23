package rs.ac.ni.pmf.oop2.vezbe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {

    @Test
    public void shouldGetAnnualSalary()
    {
        final Employee employee = new Employee(1, "Pera", 100.0);
        assertThat(employee.getAnnualSalary()).isEqualTo(12 * employee.getSalary());
    }

    @Test
    public void shouldRaiseSalary()
    {
        final Employee employee = new Employee(1, "Pera", 1000.0);
        employee.raiseSalary(30);

        final double currentSalary = employee.getSalary();

        assertThat(currentSalary).isEqualTo(1300.0);
    }
}