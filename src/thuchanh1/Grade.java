package thuchanh1;

import java.util.ArrayList;
import java.util.List;

public class Grade  {

    public void addGrade(Student student, int grade) {
        student.getGrade().add(grade);
    }

    public double calculateAverage(Student student) {
        double sum = 0;
        for (Integer grade : student.getGrade()) {
            sum += grade;
        }
        return sum / student.getGrade().size();
    }


}
