package example;

public class Main {
    public static void main(String[] args) {
        student student1 = new student("ABC");
        student1.addScore(2);
        student1.addScore(3);
        student1.addScore(4);
        System.out.println(student1.getScore());
    }
}
