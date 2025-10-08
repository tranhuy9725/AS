package bt;

public class ReportGenerator {
    public void report(Employee employee) {
        System.out.println("Employee name: "+ employee.getName());
        System.out.println("Employee salary: "+ employee.getSalaryBasic());
        if (employee instanceof FullTimeEmployee fullTime) {
            System.out.println("Bonus: " + fullTime.getBonus());
        }
    }
}
