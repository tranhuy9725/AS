package bt;

public class Employee implements IEmployee {
    private String name;
    private double salaryBasic;

    @Override
    public double calculatePay() {
        return salaryBasic;
    }

    public Employee(String name, double salaryBasic) {
        this.name = name;
        this.salaryBasic = salaryBasic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryBasic() {
        return salaryBasic;
    }

    public void setSalaryBasic(double salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaryBasic=" + salaryBasic +
                '}';
    }
}
