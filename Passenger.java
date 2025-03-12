public class Passenger implements PassengerRequirements {
    
    //Attributes
    private String name;

    /**
     * Constructor for Passenger
     * @param name name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * letting passengers board a car
     */
    public void boardCar(Car c){
        boolean added = c.addPassenger(this);
        if (! added){
            System.out.println("ERROR!! Couldn't add passenger :( ");
        }

    }

    /**
     * letting passengers off a car
     */
    public void getOffCar(Car c){
        boolean removed = c.removePassenger(this);
        if (! removed){
            System.out.println("ERROR!! Couldn't remove passenger :( ");
        }

        }

        public String toString(){
            return this.name;
        }

    }
