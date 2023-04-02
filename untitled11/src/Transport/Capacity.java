package Transport;

public enum Capacity {


    ESPECIALLY_SMALL(0,10),
    SMALL(10,25),
    AVERAGE(40,50),
    BIG(60,80),
    EXTRA_LARGE(100,120);

    private final int From;
    private final int to;

    Capacity(int from, int to) {
        From = from;
        this.to = to;
    }

    public int getFrom() {
        return From;
    }

    public int getTo() {
        return to;
    }
}