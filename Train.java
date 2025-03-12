import java.util.ArrayList;

public class Train implements TrainRequirements{


    //Attributes
    private Engine engine;
    private ArrayList <Car> cars;

    /**
     * Constructor for the Train class
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine (fuelType, fuelCapacity, fuelCapacity);
        this.cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++){
            Car car = new Car(passengerCapacity);
            cars.add(car);
        }
 
    }

    /**
     * Accessor for Car
     */
    public Car getCar(int i){
        return this.cars.get(i);
    }

    /**
     * Accessor for Engine
     */
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * Accessor for max capacity
     */
    public int getMaxCapacity(){
        int maxCapacity = 0;
        for(int i = 0; i < cars.size(); i ++){
            maxCapacity = maxCapacity + cars.get(i).getCapacity();
        }
        return maxCapacity;
    }
     /**
     * Accessor for seats Remaining
     */

     public int seatsRemaining(){
        int openSeats = 0;
        for(int i = 0; i < cars.size(); i ++){
            openSeats = openSeats + cars.get(i).getCapacity();
        }
        return openSeats;

     }

     /**
      * prints manifests from each car
      */
      public void printManifest(){
        for (int i = 0; i < cars.size(); i ++){
            cars.get(i).printManifest();
            System.out.println("\n");
        }
      }







}
