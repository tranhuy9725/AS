package designPattern.Builder.Bai2;

public class ProductBuilder implements Builder{

    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;
    private boolean hasWifi;
    private boolean hasBluetooth;

    @Override
    public ProductBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    @Override
    public ProductBuilder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    @Override
    public ProductBuilder setStorage(int STORAGE) {
        this.storage = STORAGE;
        return this;
    }

    @Override
    public ProductBuilder setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
        return this;
    }

    @Override
    public ProductBuilder setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
        return this;
    }

    @Override
    public ProductBuilder setRam(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public Computer build(){
        return new Computer(this.CPU,this.GPU,this.RAM,this.storage,this.hasWifi,this.hasBluetooth);
    }
}
