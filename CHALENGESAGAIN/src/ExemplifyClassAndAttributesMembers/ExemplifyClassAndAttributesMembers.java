package ExemplifyClassAndAttributesMembers;

public class ExemplifyClassAndAttributesMembers {
    public static void main(String[] args) {

        Product television = new Product("Television", 4599.99);
        Product radio = new Product("Radio", 149.99);

        television.showMePrice();
        radio.showMePrice();
        System.out.println("This is the discount: " + (int) (Product.DISCOUNT * 100) + "%\n");

    }
}
