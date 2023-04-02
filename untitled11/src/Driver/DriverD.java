package Driver;

import Transport.Trucks;

public class DriverD extends Drivers<Trucks> {

    public DriverD(String fullName, String driverLicence, int experience, Trucks car) {
        super(fullName, driverLicence, experience, car);
    }
}