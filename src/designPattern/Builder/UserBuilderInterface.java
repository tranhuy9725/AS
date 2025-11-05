package designPattern.Builder;

public interface UserBuilderInterface {
    UserBuilderInterface setAge(int age);
    UserBuilderInterface setAddress(String address);
    UserBuilderInterface setPhone(String phone);
    User build();
}
