import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;


public class TrainTest {

    public Train x;

    @Before
    public void setup() {
        this.x = new Train();
    }

    // Engine Tests
    @Test
    public void testEngineConstructor() {
        Engine testEngine = new Engine(FuelType.ELECTRIC, 0., 100.);
        String expectedString = "Engine has fuel type ELECTRIC, current fuel level 0, and max fuel level: 100";
    }

    @Test
    public void testEngineGo() {
        fail();
    }

    // Car Tests
    @Test ()
    public void testCarAddPassenger() {
        Passenger p = new Passenger ("Pete");
        Car c = new Car (0);
        assertFalse (c.isOnboard(p));
        c.addPassenger(p);
        assertTrue (c.isOnboard(p));

    }

    @Test
    public void testCarRemovePassenger() {
        Passenger p = new Passenger ("Pete");
        Car c = new Car (10);
        assertTrue (c.isOnboard(p));
        c.addPassenger(p);
        assertFalse (c.isOnboard(p));
        // somehow make sure it doesn't go negative????????
    }

    // Passenger Tests
    @Test
    public void testPassengerBoardCarWithSpace() {
        Passenger p = new Passenger ("Pete");
        Car c = new Car (10);
        assertFalse (c.isOnboard(p));
        c.addPassenger(p);
        assertTrue (c.isOnboard(p));
    }

    @Test
    public void testPassengerBoardCarFull() {
        Passenger p = new Passenger ("Pete");
        Car c = new Car (10);
        assertFalse (c.isOnboard(p));
        c.addPassenger(p);
        assertFalse (c.isOnboard(p));
    }

    // Train Tests
    @Test //bruh idk
    public void testTrainConstructor() {
        Train tesTrain = 
        //AAGGGHHHHHHHHHH

        this.engine = new Engine (FuelType.ELECTRIC, 20, 300);
        this.cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++){
            Car car = new Car(passengerCapacity);
            cars.add(car);
        }
    }

    @Test
    public void testTrainPassengerCount() {
        Integer testCapac = 33;
        Integer expectedCapac = 55; //idk
    }

    @Test
    public void testTrainGetCar() {
        fail();
    }

    @Test
    public void testTrainPrintManifest() {
        Passenger p = new Passenger ("Pete");
        Passenger h = new Passenger ("Julia");
        expectedManifest = "1. Pete \n 2. Julia";

    }
    
}
