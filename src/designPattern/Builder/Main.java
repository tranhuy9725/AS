package designPattern.Builder;

public class Main {
    public static void main(String[] args) {
        ConcreteUserBuilder concreteUserBuilder = new ConcreteUserBuilder("Viet", "Tran Duc");
        User user = concreteUserBuilder.setAddress("Chau Phi").setAge(20).setPhone("911").build();
        System.out.println(user.toString());
    }
}
