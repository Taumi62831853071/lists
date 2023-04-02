package Driver;

import Transport.Transport;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Drivers<T extends Transport> {

    private String fullName;
    private String driverLicence;
    private int experience;
    private final T car;

    public Drivers(String fullName, String driverLicence, int experience, T car) {
        this.fullName = fullName;
        if (driverLicence != null || driverLicence.isEmpty() || driverLicence.isBlank()) {
            this.driverLicence = driverLicence;
        } else throw new RuntimeException("Необходимо указать тип прав!");
        this.experience = experience;
        this.car = car;
        car.setDriver(this);
    }

    public void startMovement() {
        System.out.println("На старт! Внимание! Погнали! " + this.fullName + " начал движение!");
    }

    public void stopMovement() {
        System.out.println(this.fullName + " финишировал!");
    }

    public void refuel() {
        System.out.println("Водитель " + this.fullName + " заправляет "
                + this.car.getBrand() + " " + this.car.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель " + fullName +
                ", имеет водительское удостоверение категории " + driverLicence +
                ", стаж: " + experience + " лет, водит автомобиль " +
                this.car.getBrand() + ' ' + this.car.getModel() + " и будет участвовать в заезде!";
    }
    public class Main {
        public static void main(String[] args) {

            String[] users = new String[2];
            users [0] = "Max";
            users [1] = "John";
            System.out.println("Hello, " + Arrays.toString(users));
        }
    }

}