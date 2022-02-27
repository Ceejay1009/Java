public class Cylinder
extends Circle{
    private double height;

    //constructor
    public Cylinder(double x, double y, double radius, double height){
        super(x, y, radius);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    //override area
    public double area(){
        return height * circumference() + 2 * super.area();
    }
    //override toString
    public String toString(){
        return super.toString() + String.format(", %.2f", height);
    }

    public static void main(String[] args){
        Cylinder cl;
        //create object
        Object cl1 = new Cylinder(0.0,0.0,2.0,6.0);
        //casting
        cl = (Cylinder)cl1;
        //invoke toString
        System.out.println(cl);
        //invoke area
        System.out.println("Cylinder 1 Area: reference by Object variable: "
        + cl.area());

        //create object
        Point cl2 = new Cylinder(5.0,5.0,3.0,9.0);
        //casting
        cl = (Cylinder)cl2;
        //invoke toString
        System.out.println(cl);
        //invoke area
        System.out.println("Cylinder 2 Area: reference by Object variable: "
                + cl.area());

        //create object
        Circle cl3 = new Cylinder(10.0,10.0,4.0,12.0);
        //casting
        cl = (Cylinder)cl3;
        //invoke toString
        System.out.println(cl);
        //invoke area
        System.out.println("Cylinder 3 Area: reference by Object variable: "
                + cl.area());
    }
}
