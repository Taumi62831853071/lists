import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Driver.Drivers;
import Mechanic.MechanicB;
import Mechanic.MechanicC;
import Mechanic.MechanicD;
import Mechanic.Mechanics;
import Transport.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Легковые автомобили");

        Cars Lada = new Cars("Lada","Granta", 1.7, BodyType.SEDAN.toString());
        System.out.println(Lada);
        Lada.pitStop();
        Lada.bestLapTime();
        Lada.maxSpeed();
        Lada.passDiagnostics();
        Cars Audi = new Cars("Audi","A8", 2.8,BodyType.SEDAN.toString());
        System.out.println(Audi);
        Audi.passDiagnostics();
        Cars BMW = new Cars("BMW","Z8", 3.0,BodyType.SEDAN.toString());
        System.out.println(BMW);
        BMW.passDiagnostics();
        Cars KIA = new Cars("KIA","Sportage", 2.4,BodyType.CROSSOVER.toString());
        System.out.println(KIA);
        KIA.passDiagnostics();
        Lada.startMoving();
        KIA.finishTheMove();

        System.out.println("Грузовые автомобили");

        Trucks Kamaz = new Trucks("КамАЗ","5490", 11.97, BearingCapacity.N2);
        System.out.println(Kamaz);
        Kamaz.pitStop();
        Kamaz.bestLapTime();
        Kamaz.maxSpeed();
        Kamaz.passDiagnostics();
        Kamaz.startMoving();
        Trucks Man = new Trucks("MAN","TGX", 10.5, BearingCapacity.N2);
        System.out.println(Man);
        Man.passDiagnostics();
        Trucks MAZ = new Trucks("МАЗ","544018", 11.95, BearingCapacity.N2);
        System.out.println(MAZ);
        MAZ.passDiagnostics();
        Trucks Hyundai = new Trucks("Hyundai","HD500", 12.34, BearingCapacity.N3);
        System.out.println(Hyundai);
        Hyundai.finishTheMove();
        Hyundai.passDiagnostics();

        System.out.println("Автобусы");

        Buses Nefaz = new Buses("НефАЗ","5299", 6.7, Capacity.AVERAGE);
        System.out.println(Nefaz);
        Nefaz.pitStop();
        Nefaz.bestLapTime();
        Nefaz.maxSpeed();
        Buses Volvo = new Buses("Volvo","9700", 10.8, Capacity.BIG);
        System.out.println(Volvo);
        Buses Scania = new Buses("Scania","Touring", 9.00, Capacity.AVERAGE);
        System.out.println(Scania);
        Scania.passDiagnostics();
        Buses PAZ = new Buses("ПАЗ","Vector-Next", 4.43, Capacity.SMALL);
        System.out.println(PAZ);
        Nefaz.startMoving();
        PAZ.finishTheMove();

        System.out.println();
        System.out.println("Задания про типы авто:");

        Lada.printType();
        Audi.printType();
        BMW.printType();
        KIA.printType();

        Kamaz.printType();
        Man.printType();
        MAZ.printType();
        Hyundai.printType();

        Nefaz.printType();
        Volvo.printType();
        Scania.printType();
        PAZ.printType();

        List<Transport> transport = new ArrayList<>();
        transport.add(Lada);
        transport.add(Audi);
        transport.add(BMW);
        transport.add(KIA);
        transport.add(Kamaz);
        transport.add(Man);
        transport.add(MAZ);
        transport.add(Hyundai);
        transport.add(Nefaz);
        transport.add(Scania);
        transport.add(PAZ);
        transport.add(Volvo);

        System.out.println(transport);

        String driverLicencePrint;

        DriverB driverB1 = new DriverB("Иван Иваныч", "B", 15, BMW);
        driverLicencePrint = driverB1.getDriverLicence();
        if (driverLicencePrint == null || driverLicencePrint.isBlank() || driverLicencePrint.isEmpty()) {
            throw new RuntimeException("Необходимо указать тип прав!");
        } else driverB1.setDriverLicence(driverB1.getDriverLicence());
        DriverB driverB2 = new DriverB("Виктор Семёныч", "B", 12, Lada);
        driverLicencePrint = driverB2.getDriverLicence();
        if (driverLicencePrint == null || driverLicencePrint.isBlank() || driverLicencePrint.isEmpty()) {
            throw new RuntimeException("Необходимо указать тип прав!");
        } else driverB2.setDriverLicence(driverB2.getDriverLicence());
        DriverC driverC1 = new DriverC("Игорь Ракетович", "С", 30, PAZ);
        driverLicencePrint = driverC1.getDriverLicence();
        if (driverLicencePrint == null || driverLicencePrint.isBlank() || driverLicencePrint.isEmpty()) {
            throw new RuntimeException("Необходимо указать тип прав!");
        } else driverC1.setDriverLicence(driverC1.getDriverLicence());
        DriverC driverC2 = new DriverC("Олег Торпедович", "С", 33, Volvo);
        driverLicencePrint = driverC2.getDriverLicence();
        if (driverLicencePrint == null || driverLicencePrint.isBlank() || driverLicencePrint.isEmpty()) {
            throw new RuntimeException("Необходимо указать тип прав!");
        } else driverC2.setDriverLicence(driverC2.getDriverLicence());
        DriverD driverD1 = new DriverD("Серёга", "D", 9, MAZ);
        driverLicencePrint = driverD1.getDriverLicence();
        if (driverLicencePrint == null || driverLicencePrint.isBlank() || driverLicencePrint.isEmpty()) {
            throw new RuntimeException("Необходимо указать тип прав!");
        } else driverD1.setDriverLicence(driverD1.getDriverLicence());
        DriverD driverD2 = new DriverD("Санёк", "D", 25, Hyundai);
        driverLicencePrint = driverD2.getDriverLicence();
        if (driverLicencePrint == null || driverLicencePrint.isBlank() || driverLicencePrint.isEmpty()) {
            throw new RuntimeException("Необходимо указать тип прав!");
        } else driverD2.setDriverLicence(driverD2.getDriverLicence());


        System.out.println(driverB1);
        System.out.println(driverB2);
        System.out.println(driverC1);
        System.out.println(driverC2);
        System.out.println(driverD1);
        System.out.println(driverD2);
        System.out.println();

        driverD2.startMovement();
        driverC1.stopMovement();
        driverB2.refuel();

        List<Drivers> drivers = new ArrayList<>();
        drivers.add(driverB1);
        drivers.add(driverB2);
        drivers.add(driverC1);
        drivers.add(driverC2);
        drivers.add(driverD1);
        drivers.add(driverD2);

        System.out.println(drivers);

        List<Cars> cars = new ArrayList<>();
        cars.add(Lada);
        cars.add(Audi);
        cars.add(BMW);
        cars.add(KIA);

        Mechanics mechanicB1 = new MechanicB("Иван Иваныч", "Альфа", "B", cars);
        Mechanics mechanicB2 = new MechanicB("Виктор Семёныч", "SANRENO", "B", cars);
//        Mechanics mechanicB3 = new MechanicB("Иван Иваныч", "Альфа", "B", cars);

        List<Buses> buses = new ArrayList<>();
        buses.add(Nefaz);
        buses.add(Volvo);
        buses.add(Scania);
        buses.add(PAZ);

        Mechanics mechanicC1 = new MechanicC("Игорь Ракетович", "БестВей", "C", buses);
        Mechanics mechanicC2 = new MechanicC("Олег Торпедович", "ВолгоВятАвто", "C", buses);

        List<Trucks> trucks = new ArrayList<>();
        trucks.add(Kamaz);
        trucks.add(Man);
        trucks.add(MAZ);
        trucks.add(Hyundai);

        Mechanics mechanicD1 = new MechanicD("Серёга", "Citrus", "D", trucks);
        Mechanics mechanicD2 = new MechanicD("Санёк", "Автотехплюс", "D", trucks);

        System.out.println("Механики для КИА " + KIA.getMechanics());

        List<Mechanics> mechanics = new ArrayList<>();
        mechanics.add(mechanicB1);
        mechanics.add(mechanicB2);
        mechanics.add(mechanicC1);
        mechanics.add(mechanicC2);
        mechanics.add(mechanicD1);
        mechanics.add(mechanicD2);

        System.out.println(mechanics);

        mechanicB1.addTransportForFixing(Audi);
        mechanicB1.addTransportForFixing(BMW);

        mechanicB1.performMaintenance();

        /*ArrayList<Mechanics> mechanicsForAudi = new ArrayList<>();
        mechanicsForAudi.add(mechanicB1);
        mechanicsForAudi.add(mechanicB2);
        *//*mechanicsForAudi.add(mechanicC1);
        mechanicsForAudi.add(mechanicC2);*//*

        Audi.setMechanics(mechanicsForAudi);*/

        System.out.println("Механики для Ауди " + Audi.getMechanics());
        System.out.println(Hyundai.getDriver());


        Type type = new Type() {
            @Override
            public String getTypeName() {
                return Type.super.getTypeName();
            }
        };
        type.getTypeName();

    }
}