package designPattern.Builder;

public class AdminUserBuilder implements UserBuilderInterface{
    private String firstName;
    private String lastName;
    private int age = 0;
    private String address = null;
    private String phone  = null;

    public AdminUserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public UserBuilderInterface setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public UserBuilderInterface setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public UserBuilderInterface setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    @Override
    public User build() {
        return new User(this.firstName, this.lastName, this.age, this.address, this.phone);
    }
}
