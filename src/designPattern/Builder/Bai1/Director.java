package designPattern.Builder.Bai1;

public class Director {
    public static void main(String[] args) {
        ProductBuilder productBuilder = new ProductBuilder();
        Product tranDucViet = productBuilder.setName("Tran Duc Viet").setPrice(0.01).setDescription("Tran Duc Viet du hoc sinh.").build();
        System.out.println(tranDucViet.toString());
    }
}
