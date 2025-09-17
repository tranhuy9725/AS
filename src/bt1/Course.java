package bt1;

import java.util.List;

public class Course {
    private String courseName;
    private int courseId;
    private Teacher teacher;
    private List<Student> studentList;

    public Course(String courseName, int courseId, Teacher teacher, List<Student> studentList) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        this.studentList.add(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + this.courseName + '\'' +
                ", courseId=" + this.courseId +
                ", teacher=" + this.teacher.getName() +
                ", studentList=" + this.getStudentList() +
                '}';
    }
}
