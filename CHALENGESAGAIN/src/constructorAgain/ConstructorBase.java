package constructorAgain;

public class ConstructorBase {
    int day;
    int month;
    int year;

    ConstructorBase(){
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    ConstructorBase(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void showMeDate(){
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}
