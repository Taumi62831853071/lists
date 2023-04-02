package Transport;

public class Trucks extends Transport implements Competing{

    private BearingCapacity bearingCapacity;

    public Trucks(String brand, String model, double engineVolume,BearingCapacity bearingCapacity) {
        super(brand, model, engineVolume, true);
        this.bearingCapacity = bearingCapacity;
    }

    public BearingCapacity getBearingCapacity() {
        return bearingCapacity;
    }

    public void setBearingCapacity(BearingCapacity bearingCapacity) {
        this.bearingCapacity = bearingCapacity;
    }

    @Override
    public  void passDiagnostics() {
        System.out.println("Пройти диагностику");
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение.");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Грузовик закончил движение.");
    }

    @Override
    public void printType() {
        if (bearingCapacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = bearingCapacity.getFrom() == null ?"" : "от " + bearingCapacity.getFrom() + " ";
            String to = bearingCapacity.getTo() == null ? "" : "до " + bearingCapacity.getTo();
            System.out.println("Грузоподъемность: " + from + to);
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовому автомобилю " +getBrand()+ " необходимо заехать на Пит-стоп!");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга было у грузового автомобиля " +getBrand()+ "!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость на этом заезде была у грузового автомобиля " +getBrand()+ "!");
    }
}