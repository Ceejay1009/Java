public class Building implements CarbonFootprint{
    //var
    private double squareFootage;
    //constructor
    Building(double squareFootage){
        this.squareFootage = squareFootage;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    @Override
    public double getCarbonFootprint() {
        return squareFootage * 50 + squareFootage * 20
                + squareFootage * 47 + squareFootage * 17;
    }

    public String toString(){
        return "Building with " + squareFootage +"Square feet: "
                + getCarbonFootprint();
    }
}
