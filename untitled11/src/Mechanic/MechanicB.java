package Mechanic;

import Transport.Cars;

import java.util.ArrayList;
import java.util.List;

public class MechanicB extends Mechanics<Cars>{

    public MechanicB(String fullName, String companyName, String speciality, List<Cars> transport) throws Exception {
        super(fullName, companyName, speciality, transport);
    }

}
