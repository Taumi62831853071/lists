package Mechanic;

import Transport.Transport;
import Transport.Cars;

import java.util.*;

public class Mechanics<T extends Transport>  {

    private String fullName;
    private String companyName;
    private String speciality;
    private List<T> transport;
    private Queue<T> queue = new LinkedList<>();

    public Mechanics(String fullName, String companyName, String speciality, List<T> transport) throws Exception {
        this.fullName = fullName;
        this.companyName = companyName;
        this.speciality = speciality;
        this.transport = transport;
        for (T entry: transport) {
            entry.addMechanic(this);
        }
    }

    public void addTransportForMaintenance(T transport) throws Exception {
        if (this.transport.contains(transport)){
            queue.offer(transport);
        } else {
            throw new Exception("Механик не может проводить техобслуживание не со своей машиной");
        }


    }

    public void performMaintenance() {
        T transport = queue.poll();
        if (transport != null) {
            System.out.println("Механик " + fullName + " проводит техобслуживание " + transport.getBrand() +" "+ transport.getModel());
            performMaintenance();
        } else {
            System.out.println("В очереди больше никого нет");
        }
    }

    public void addTransportForFixing(T transport) throws Exception {
        if (this.transport.contains(transport)){
            queue.offer(transport);
        } else {
            throw new Exception("Механик не может чинить не свою машину");
        }
    }

    public void fixTheCar() {
        T transport = queue.poll();
        if (transport != null) {
            System.out.println("Механик " + fullName + " чинит транспорт " + transport.getBrand() +" "+ transport.getModel());
            fixTheCar();
        } else {
            System.out.println("В очереди больше никого нет");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Механик " + fullName +
                ", работает в компании " + companyName +
                ", может работать с автомобилями " + speciality;
    }

}
