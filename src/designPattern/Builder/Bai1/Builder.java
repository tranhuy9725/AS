package designPattern.Builder.Bai1;

public interface Builder {
    Builder setName(String name);
    Builder setPrice(double price);
    Builder setDescription(String description);
    Product build();
}
