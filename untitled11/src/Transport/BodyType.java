package Transport;
public enum BodyType {

    SEDAN,
    HATCHBACK,
    COUPE,
    STATION_WAGON,
    SUV,
    CROSSOVER,
    PICKUP,
    VAN,
    MINIVAN;



}

class Type {

    public void printBodyType(BodyType bodyType) {

        switch (bodyType) {

            case SEDAN:
                System.out.println("Седан");
                break;
            case HATCHBACK:
                System.out.println("Хетчбек");
                break;
            case COUPE:
                System.out.println("Купе");
                break;
            case STATION_WAGON:
                System.out.println("Универсал");
                break;
            case SUV:
                System.out.println("Внедорожник");
                break;
            case CROSSOVER:
                System.out.println("Кроссовер");
                break;
            case PICKUP:
                System.out.println("Пикап");
                break;
            case VAN:
                System.out.println("Фургон");
                break;
            case MINIVAN:
                System.out.println("Минивэн");
                break;
        }
    }
}

