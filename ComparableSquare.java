public class ComparableSquare
extends Square implements Comparable{
    public ComparableSquare(){}

    public ComparableSquare(double side){
        super(side);
    }
    public int compareTo(Square o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public static void main(String[] args){
        ComparableSquare CS1 = new ComparableSquare(10.0);
        ComparableSquare CS2 = new ComparableSquare(5.0);
        if(CS1.compareTo(CS2) > 0){
            System.out.println("Instance 1 is lager.");
        }else
            System.out.println("Instance 2 is lager.");

    }
}


