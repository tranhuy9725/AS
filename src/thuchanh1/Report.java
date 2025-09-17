package thuchanh1;

public class Report {
    public void generateReport(Student student) {
        System.out.println("Student{" +
                "name='" + student.getName() + '\'' +
                ", age=" + student.getAge() +
                ", grade=" + student.getGrade() +
                '}');
    }
}
