public class Engine implements EngineRequirements {

    //Attributes
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;


    /**
     * Constructuor for Engine
     * @param f Engine's fuel type
     * @param currentFuelLevel Engine's current fuel level
     * @param maxFuelLevel Engine's max fuel level
     */
    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel){
        this.f = f;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;

    }

    /**
     * Accessor for fuel type
     */
    public FuelType getFuelType() {
        return this.f;
    }

    /**
     * Accessor for max amount of fuel
     */
    public double getMaxFuel(){
        return this.maxFuelLevel;
    }

    /**
     * Accessor for current fuel level
     */
    public double getCurrentFuel(){
        return this.currentFuelLevel;
    }

    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;

    }

    /**
     * Testing if the train has enough fuel to go
     */
    public Boolean go(){
        if (this.currentFuelLevel >= 5){
            this.currentFuelLevel = this.currentFuelLevel - 5;
            System.out.println("Current Fuel Level: " + this.currentFuelLevel);
            if (this.currentFuelLevel > 0){
                return true;
            } else{
                return false;
            }
        } else{
            return false;
        }
    }

    public String toString(){
        return ("Engine has fuel type " + this.f + ", current fuel level " + this.currentFuelLevel + ", and max fuel level: " + this.maxFuelLevel);
    }

    public static void main(String[] args){
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0., 100.);
        System.out.println(myEngine);
        myEngine.refuel();
        System.out.println(myEngine);
        //while (myEngine.go()) {
        //    System.out.println("Choo choo!");
        //}
        //System.out.println("Out of fuel.");

        //Engine myOtherEngine = new Engine(FuelType.STEAM, 50., 100.);
        //System.out.println(myOtherEngine);
    }


}