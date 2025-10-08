package bt;

public class FullTimeEmployee extends Employee implements  IWorkable, IManageable {
    private double bonus;

    public FullTimeEmployee(String name, double salaryBasic, double bonus) {
        super(name, salaryBasic);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return this.getSalaryBasic() + bonus;
    }
    @Override
    public void work() {
        System.out.println("Full time employee is working.");
    }

    @Override
    public void manageTeam() {
        System.out.println("Full time employee is managing team.");
    }
}
