package designPattern.Builder.Bai2;

public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;
    private boolean hasWifi;
    private boolean hasBluetooth;

    public Computer(String CPU, String GPU, int RAM, int storage, boolean hasWifi, boolean hasBluetooth) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.storage = storage;
        this.hasWifi = hasWifi;
        this.hasBluetooth = hasBluetooth;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return storage;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM=" + RAM +
                ", storage=" + storage +
                ", hasWifi=" + hasWifi +
                ", hasBluetooth=" + hasBluetooth +
                '}';
    }
}
