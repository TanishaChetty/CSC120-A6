import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.util.ArrayList;


public class TrainTest {

    public Train x;


    // Engine Tests
    @Test
    public void testEngineConstructor() {
        Engine engine = new Engine(FuelType.ELECTRIC, 0., 100.);
        assert engine.getFuelType() == FuelType.ELECTRIC;
        assert engine.getCurrentFuel() == 0.;
        assert engine.getMaxFuel() == 100.;
    }

    @Test
    public void testEngineGo() {
        Engine engine = new Engine(FuelType.ELECTRIC, 0., 100.);
        assertFalse (engine.go());
        Engine otherEngine = new Engine(FuelType.ELECTRIC, 5., 100.);
        assertFalse(otherEngine.go());
        Engine e = new Engine(FuelType.ELECTRIC, 100., 100.);
        assertTrue(e.go());
        assert e.getCurrentFuel() == 95;

    }

    // Car Tests
    @Test ()
    public void testCarAddPassenger() {
        Passenger p = new Passenger ("Pete");
        Car c = new Car (1);
        assertFalse (c.isOnboard(p));
        assertTrue (c.addPassenger(p));

    }

    @Test
    public void testCarRemovePassenger() {
        Passenger p = new Passenger ("Pete");
        Car c = new Car (10);
        c.addPassenger(p);
        assertTrue (c.isOnboard(p));
        c.removePassenger(p);
        assertFalse (c.isOnboard(p));
        Car x = new Car (0);
        assertFalse(x.removePassenger(p));

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
        Car c = new Car (0);
        assertFalse (c.isOnboard(p));
        c.addPassenger(p);
        assertFalse (c.isOnboard(p));
    }

    // Train Tests
    @Test
    public void testTrainConstructor() {
        Train testTrain = new Train(FuelType.ELECTRIC, 200., 3, 30);
        assertTrue(testTrain.getCarNumber() == 3);
        assertTrue(testTrain.getEngine().getFuelType() == FuelType.ELECTRIC);
        assertTrue(testTrain.getEngine().getMaxFuel() == 200);
        assertTrue(testTrain.getMaxCapacity() == 90);
        
    }

    @Test
    public void testTrainPassengerCount() {
        Train testTrain = new Train(FuelType.ELECTRIC, 200., 3, 30);
        Passenger p = new Passenger ("Pete");
        Car c = testTrain.getCar(2);
        assertFalse (c.isOnboard(p));
        c.addPassenger(p);
        assertTrue(c.seatsRemaining() == 29);
        
    }

    @Test
    public void testTrainGetCar() {
        Train testTrain = new Train(FuelType.ELECTRIC, 200., 3, 30);
        Car car = testTrain.getCar(1);
        Car c = testTrain.getCar(2);
        assertFalse (c == car);
        assertTrue(car == testTrain.getCar(1));

    }

    @Test
    public void testTrainPrintManifest() {
        Train t = new Train(FuelType.ELECTRIC, 100, 1, 10);
        Passenger p = new Passenger ("Pete");
        p.boardCar(t.getCar(0));
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream memoryOut = new PrintStream(buffer);
        System.setOut(memoryOut);
        t.printManifest();
        assertEquals("1. Pete", buffer.toString().strip());

    }
    
}
