package constructorAgain;

public class ConstructorAgain {
    public static void main(String[] args) {

        ConstructorBase date1 = new ConstructorBase();
        ConstructorBase date2 = new ConstructorBase(26, 3, 1991);

        date1.showMeDate();
        date2.showMeDate();

    }
}
