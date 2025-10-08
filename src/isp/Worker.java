package isp;

public class Worker extends Employee{

    @Override
    public void checkAttandance(){
        System.out.println("Worker check attandance");
    }

    @Override
    public void working(){
        System.out.println("Worker working");
    }
}
