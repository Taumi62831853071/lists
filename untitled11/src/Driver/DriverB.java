package Driver;

import Transport.Cars;

public class DriverB extends Drivers<Cars>{

    public DriverB(String fullName, String driverLicence, int experience, Cars car) {
        super(fullName, driverLicence, experience, car);
    }
}