public class Constructories {
    
    String name;
    double price;
    double discont;

    Constructories(){}

    Constructories(String nameInitial,
                double priceInitial,
                double discontInitial){
            name = nameInitial;
            price = priceInitial;
            discont = discontInitial;
    }

    String priceWithDiscont(){
        return String.format("R$ %.2f", (price * (1 - discont)));
    }

    String showProduct(){
        return String.format("Product: %s\nPrice: %.2f\nPrice with discont: %s", name, price, priceWithDiscont());
    }

}
