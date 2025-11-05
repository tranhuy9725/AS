package designPattern.Builder.Bai3;

public class StarBuck {
    private String size;
    private String drink;

    public StarBuck(String size, String drink) {
        this.size = size;
        this.drink = drink;
    }

    public String getSize() {
        return size;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return "StarBuck{" +
                "size='" + size + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
