package isp.thuchanh1;

public class Principal extends Employee implements Promote, Enroll {
    public void manage(){
        System.out.println("Principal manage");
    }

    @Override
    public void promoteStudent() {
        System.out.println("Principal PromoteStudent");
    }

    @Override
    public void enrollStudent() {
        System.out.println("Principal EnrollStudent");
    }
}
