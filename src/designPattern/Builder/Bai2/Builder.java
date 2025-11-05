package designPattern.Builder.Bai2;

public interface Builder {
    Builder setCPU(String CPU);
    Builder setGPU(String GPU);
    Builder setRam(int RAM);
    Builder setStorage(int STORAGE);
    Builder setHasWifi(boolean hasWifi);
    Builder setHasBluetooth(boolean hasBluetooth);
}
