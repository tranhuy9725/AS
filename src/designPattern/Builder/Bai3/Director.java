package designPattern.Builder.Bai3;

public class Director {
    public static void main(String[] args) {
        StarBuckBuilder builder = new StarBuckBuilder();
        StarBuck starBuck = builder.setDrink("Coffee").setSize("L").build();
        System.out.println(starBuck.toString());
    }
}
