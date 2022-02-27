public class Bicycle implements CarbonFootprint{
    //var
    String type = "";
    //constructor
    Bicycle(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getCarbonFootprint() {
        return 0;
    }
    public String toString() {
        return "Bicycle of type " + type + ": "
                + getCarbonFootprint();
    }
}
