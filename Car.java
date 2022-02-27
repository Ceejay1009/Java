public class Car implements CarbonFootprint{
    //var
    private int gas;
    //constructor
    Car(int gas){
        this.gas = gas;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    @Override
    public double getCarbonFootprint() {
        return gas * 20;
    }
    public String toString() {
        return "Car that has used " + gas + "gallons of gas: "
                + getCarbonFootprint();
    }
}
