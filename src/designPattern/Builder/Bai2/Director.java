package designPattern.Builder.Bai2;

public class Director {
    public static void main(String[] args) {
        ProductBuilder productBuilder = new ProductBuilder();
        Computer computer = productBuilder.setCPU("Intel Core i5-12400H").setGPU("NVIDIA GeForce RTX 3050").setHasBluetooth(true).setHasWifi(true).setRam(8).setStorage(1024).build();
        System.out.println(computer.toString());
    }
}
