package isp;

public class Manager extends Employee implements Manage {
    @Override
    public void working(){
        System.out.println("Manager working");
    }

    @Override
    public void checkAttandance(){
        System.out.println("Manager check attandance");
    }
    @Override
    public void assignTask(){
        System.out.println("Manager assign task");
    }

}
