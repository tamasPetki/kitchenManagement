import java.util.Date;

abstract class Employee {

    String name;
    Date birthdate;
    double salary;

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void taxReport() {
        System.out.println("SALARY: " + getSalary() + "\n" + "TAX: " + getSalary()*0.99 + "\n");
    }
}
