package isp;

import isp.thuchanh1.*;
import isp.thuchanh1.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Employee manage = new Manager();
//        Employee worker = new Worker();
//
//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(manage);
//        employees.add(worker);
//        for (Employee employee : employees){
//            employee.working();
//            employee.checkAttandance();
//            if (employee instanceof Manage){
//                ((Manage) employee).assignTask();
//            }
//        }
        Employee teacher = new Teacher();
        Employee janitor = new Janitor();
        Employee secretary = new Secretary();
        Employee principal = new Principal();

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(teacher);
        employees.add(janitor);
        employees.add(secretary);
        employees.add(principal);
        for(Employee e:employees){
            if(e instanceof Teacher){
                ((Teacher)e).teach();
                ((Teacher)e).takeAttendance();
                ((Teacher)e).enrollStudent();
                ((Teacher)e).promoteStudent();
            }else if(e instanceof Janitor){
                ((Janitor) e).clean();
            }else if(e instanceof Secretary){
                ((Secretary) e).schedule();
                ((Secretary) e).enrollStudent();
                ((Secretary) e).promoteStudent();
            }else if(e instanceof Principal){
                ((Principal) e).manage();
                ((Principal) e).enrollStudent();
                ((Principal) e).promoteStudent();
            }
        }

    }
}
