package isp.thuchanh1;

public class Teacher extends Employee implements Attendance, Enroll, Promote{

    public void teach(){
        System.out.println("Teaching.");
    }

    @Override
    public void takeAttendance() {
        System.out.println("Teacher take Attendance");
    }

    @Override
    public void promoteStudent() {
        System.out.println("Teacher PromoteStudent");
    }

    @Override
    public void enrollStudent() {
        System.out.println("Teacher EnrollStudent");
    }
}
