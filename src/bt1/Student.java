package bt1;

public class Student extends Person implements Role{
    private int grade;
    private double score;

    public Student(int id, String name, String gender, int grade, double score) {
        super(id, name, gender);
        this.grade = grade;
        this.score = score;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void study(){
        System.out.println("Student is studying");
    }

    public void evaluate(){
        if(this.score >= 9){
            System.out.println("Student is Excellent");
        } else if (this.score >= 7) {
            System.out.println("Student is Good");
        } else if (this.score >= 5) {
            System.out.println("Student is Average");
        }else if(this.score <= 4) {
            System.out.println("Student is Poor");
        }
    }

    public void displayInfo(){
        System.out.println("Student{" + "grade=" + this.grade + ", score=" + this.score +
                '}');
    }

    @Override
    public void roleInfo() {
        System.out.println("I am a Student.");
    }
}
