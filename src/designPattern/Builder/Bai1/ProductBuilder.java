package designPattern.Builder.Bai1;

public class ProductBuilder implements Builder{
    private String name = null;
    private double price = 0;
    private String description =  null;

    @Override
    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public Builder setDescription(String description) {
        this.description = description;
        return this;
    }

    public Product build(){
        return new Product(name,price,description);
    }
}
