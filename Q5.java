public class Q5 {
    public static void main(String[] args){
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5,23,55);
        System.out.println(time1.getHour() + ":" + time1.minute + ":" + time1.second);
        System.out.println(time2.getHour() + ":" + time2.minute + ":" + time2.second);
        System.out.println(time3.getHour() + ":" + time3.minute + ":" + time3.second);
    }
}
