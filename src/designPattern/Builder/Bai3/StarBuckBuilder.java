package designPattern.Builder.Bai3;

public class StarBuckBuilder implements Builder {
    private String drink;
    private String size;

    @Override
    public StarBuckBuilder setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    @Override
    public StarBuckBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public StarBuck build() {
        return new StarBuck(drink, size);
    }
}
