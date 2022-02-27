import java.awt.*;

class Square extends GeometricObject implements Colorable{
    private double side;
    //constructor
    public Square(){
        side = 0.0;
    }
    public Square(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }
    public void setSide(){
        this.side = side;
    }
    public double getArea(){
        double area = side*side;
        return area;
    }
    public double getPerimeter() {
        return side * 4;
    }
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    public static void main(String[] args){
        GeometricObject[] GS = new GeometricObject[3];
        GS[0] = new Square(5.0);
        GS[1] = new Circle(6.0);
        GS[2] = new Rectangle(5.0,7.0);

        for(int i = 0; i < GS.length; i++){
            System.out.println("Shape: " + (i + 1) + "\tArea: "
                    + GS[i].getArea());
            if(GS[i] instanceof Colorable){
                ((Colorable)GS[i]).howToColor();
            }
        }
    }


}
