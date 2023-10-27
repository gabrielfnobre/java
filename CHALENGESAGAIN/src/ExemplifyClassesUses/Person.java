package ExemplifyClassesUses;

public class Person {
    String name;
    double weight;

    Person(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    void eating(Food food){
        this.weight += food.weight;
    }

    void weightOfPerson(){
        String format = "%s has %.2fKg\n";
        System.out.printf(format, this.name, this.weight);
    }
    void poop(Food food){
        this.weight -= food.weight;
    }
}
