package bt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Trần Đức Việt", 1412.20, 1234));
        employees.add(new ContractEmployee("Nguyễn Trờng An", 123.1));
        employees.add(new Intern("Nguyễn An Trường", 12.15));

        ReportGenerator reportGenerator = new ReportGenerator();
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        for (Employee employee : employees) {
            reportGenerator.report(employee);
            if(employee instanceof Intern) {
                System.out.println("Intern salary calculator: "+salaryCalculator.calculateSalary(employee));;
                ((Intern) employee).work();
            }else if(employee instanceof FullTimeEmployee) {
                System.out.println("Full time salary calculator: "+salaryCalculator.calculateSalary(employee));;
                ((FullTimeEmployee) employee).work();
                ((FullTimeEmployee) employee).manageTeam();
            }else if(employee instanceof ContractEmployee) {
                System.out.println("Contract employee salary calculator: "+salaryCalculator.calculateSalary(employee));;
                ((ContractEmployee) employee).work();
            }
        }
    }
}
