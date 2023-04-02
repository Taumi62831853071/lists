package Mechanic;

import Transport.Trucks;

import java.util.ArrayList;
import java.util.List;

public class MechanicD extends Mechanics<Trucks>{

    public MechanicD(String fullName, String companyName, String speciality, List<Trucks> transport) throws Exception {
        super(fullName, companyName, speciality, transport);
    }
}
