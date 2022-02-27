public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int Newn, double Newside){
        n = Newn;
        side = Newside;
        x = y = 0;
    }

    public RegularPolygon(int Newn, double Newside, double Newx, double Newy){
        n = Newn;
        side = Newside;
        x = Newx;
        y = Newy;
    }

    public void setN(int Newn){
        n = Newn;
    }

    public void setSide(int Newside){
        side = Newside;
    }

    public void setX(int Newx){
        x = Newx;
    }

    public void setY(int Newy){
        y = Newy;
    }


    public int getN(int Newn){
        return n;
    }

    public double getSide(int Newside){
        return side;
    }

    public double getX(int Newx){
        return x;
    }

    public double getY(int Newy){
        return y;
    }

    public double getPerimeter(){
        double perimeter = n * side;
        return perimeter;
    }

    public double getArea (){
        double area = (n * Math.pow(side, 2) / (4.0 * Math.tan(Math.PI/n)));
        return area;
    }
}

