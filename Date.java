public class Date {
    //var
    private int day;
    private int month;
    private int year;

    //constructor
    Date(int day, int month, int year){
        if(month > 0 && month <= 12){
            this.month = month;
        }else{
            throw new IllegalArgumentException("Value of month should be between 1 and 12");
        }

        if(day > 0 && day <= 31){
            this.day = day;
        }else{
            throw new IllegalArgumentException("Value of month should be between 1 and 31");
        }
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(day > 0 && day <= 31){
            this.day = day;
        }else{
            throw new IllegalArgumentException("Value of month should be between 1 and 31");
        }
    }

    public void setMonth(int month) {
        if(month > 0 && month <= 12){
            this.month = month;
        }else{
            throw new IllegalArgumentException("Value of month should be between 1 and 12");
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return month + "/" + day + "/" + year;
    }
}
