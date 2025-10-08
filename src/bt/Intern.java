package bt;

public class Intern extends  Employee implements IWorkable{

    public Intern(String name, double salaryBasic) {
        super(name, salaryBasic);
    }

    @Override
    public double calculatePay() {
        return this.getSalaryBasic();
    }
    @Override
    public void work() {
        System.out.println("Intern work");
    }
}
