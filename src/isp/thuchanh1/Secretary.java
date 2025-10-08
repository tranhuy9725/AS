package isp.thuchanh1;


public class Secretary extends Employee implements Enroll, Promote{
    public void schedule(){
        System.out.println("Schedule");
    }

    @Override
    public void promoteStudent() {
        System.out.println("Secretary PromoteStudent");
    }

    @Override
    public void enrollStudent() {
        System.out.println("Secretary EnrollStudent");
    }
}
