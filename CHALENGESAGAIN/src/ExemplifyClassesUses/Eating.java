package ExemplifyClassesUses;

public class Eating {
    public static void main(String[] args) {

        Person p1 = new Person("Gabriel", 110);
        Food f1 = new Food("Rice", 0.150);
        Food f2 = new Food("Beans", 0.230);

        p1.weightOfPerson();
        p1.eating(f1);
        p1.eating(f2);
        p1.weightOfPerson();
        p1.poop(f1);
        p1.poop(f2);
        p1.weightOfPerson();


    }
}
