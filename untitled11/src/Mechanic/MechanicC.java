package Mechanic;

import Transport.Buses;

import java.util.ArrayList;
import java.util.List;

public class MechanicC extends Mechanics<Buses>{

    public MechanicC(String fullName, String companyName, String speciality, List<Buses> transport) throws Exception {
        super(fullName, companyName, speciality, transport);
    }
}
