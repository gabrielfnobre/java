package showDateWithMethodAgain;

public class Date {
    int day;
    int month;
    int year;

   Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void showDate(){
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}
