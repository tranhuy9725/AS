package bt1;

public class Teacher extends Person implements Role{
    private String subject;

    public Teacher(int id, String name, String gender,String subject){
        super(id,name,gender);
        this.subject=subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach(){

    }

    public void assignHomework(String homework){
        System.out.println("Homework assigned to " + homework);
    }

    public void displayInfo(){
        System.out.println("Subject: " + getSubject());
    }

    @Override
    public void roleInfo() {
        System.out.println("I am a Teacher.");
    }
}
