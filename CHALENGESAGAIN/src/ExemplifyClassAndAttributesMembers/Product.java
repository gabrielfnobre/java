package ExemplifyClassAndAttributesMembers;

public class Product {
    String name;
    double price;

    static final double DISCOUNT = 0.25;

    Product(String name, double price){
        this.name = name;
        this.price = price - (price * DISCOUNT);
    }

    void showMePrice(){
        System.out.printf("%s: R$ %.2f\n", this.name, this.price);
    }
}
