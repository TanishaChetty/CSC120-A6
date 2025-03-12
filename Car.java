import java.util.ArrayList;

public class Car implements CarRequirements {

    //Attributes
    ArrayList <Passenger> passengersOnboard;
    private int maxCapacity;
    //private int availSeats;

    /**
     * Constructor for Car
     * @param maxCapacity Car's maximum capacity
     * @param passengersOnboard list of passengers onboard
     */
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<>();

    }

    /**
     * maximum amount of seats in the car
     */
    public int getCapacity(){
        return this.maxCapacity;
    }

    /**
     * Seats remaining in the car
     */
    public int seatsRemaining(){
        return this.maxCapacity - this.passengersOnboard.size();
    }

    /**
     * Adding a passenger
     */
    public Boolean addPassenger(Passenger passenger){
        if (this.maxCapacity > this.passengersOnboard.size()){
            this.passengersOnboard.add(passenger);
            return true;
       

        }else{
            return false;
        }
        
    }

    /**
     * removing a passenger
     */
    public Boolean removePassenger(Passenger passenger){
        if (passengersOnboard.contains(passenger)){
            this.passengersOnboard.remove(passenger);
            return false;
        } else{
            return true;
        }
    }

    /**
     * printing all the passengers in a car
     */
    public void printManifest(){
        String allPassengers = "";
        Passenger person = new Passenger("temp");
        if (this.passengersOnboard.isEmpty()){
            System.out.println( "This car is EMPTY");

        } else{
            for (int i = 0; i < this.passengersOnboard.size(); i ++){
                person = this.passengersOnboard.get(i);
                allPassengers = allPassengers + (i+1) + ". " + person +"\n";
            }
            System.out.println(allPassengers);
        }

  

        }




    public static void main(String[] args){
        //Car myCar = new Car()
    }


    




}