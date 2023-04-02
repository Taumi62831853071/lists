package Driver;

import Transport.Buses;

public class DriverC extends Drivers <Buses>{

    public DriverC(String fullName, String driverLicence, int experience, Buses car) {
        super(fullName, driverLicence, experience, car);
    }
}