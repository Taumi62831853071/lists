package Transport;

public class Buses extends Transport implements Competing{

    private Capacity capacity;

    public Buses(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume, false);
        this.capacity = capacity;
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автобусу диагностика не требуется");
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начала движение.");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Автобус закончила движение.");
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость: от " + capacity.getFrom() + " до " + capacity.getTo());
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Автобусу " +getBrand()+ " необходимо заехать на Пит-стоп!");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга было у автобуса " +getBrand()+ "!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость на этом заезде была у автобуса " +getBrand()+ "!");
    }
}
