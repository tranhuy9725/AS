package bt;

public class ContractEmployee extends Employee implements IWorkable {

    public ContractEmployee(String name, double salaryBasic) {
        super(name, salaryBasic);
    }

    @Override
    public double calculatePay() {
        return this.getSalaryBasic();
    }
    @Override
    public void work() {
        System.out.println("Salary contract employee is working.");
    }
}
