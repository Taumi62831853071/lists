package Transport;
import java.util.List;
import java.util.ArrayList;

public class Cars extends Transport implements Competing{

    private BodyType bodyType;

    public Cars(String brand, String model, double engineVolume, String bodyType) {
        super(brand, model, engineVolume, true);
        this.bodyType = BodyType.valueOf(bodyType);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }


    @Override
    public void passDiagnostics() {
        System.out.println("Пройти диагностику");
    }

    @Override
    public void startMoving() {
        System.out.println("Легковая машина начала движение.");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Легковая машина закончила движение.");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова: " + bodyType);
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Легковому автомобилю " +getBrand()+ " необходимо заехать на Пит-стоп!");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга было у легкового автомобиля " +getBrand()+ "!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость на этом заезде была у легкового автомобиля " +getBrand()+ "!");
    }
}