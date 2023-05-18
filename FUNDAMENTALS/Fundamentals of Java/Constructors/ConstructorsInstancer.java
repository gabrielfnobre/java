public class ConstructorsInstancer {
    public static void main(String[] args){
        
        //EX01
        Constructories p1 = new Constructories();
        System.out.println("Ex01:");
        System.out.println(p1.showProduct());
        System.out.println();
        
        //EX02
        p1.name = "NoteBook";
        p1.price = 2340.50;
        p1.discont = 0.15;
        System.out.println("EX02:");
        System.out.println(p1.name);
        System.out.println(p1.showProduct());
        
        Constructories p2 = new Constructories("Caneta", 1.50, 0.20);
        System.out.println("\nEx03:");
        System.out.println(p2.showProduct());

    }
}
