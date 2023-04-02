package Transport;

public enum BearingCapacity {

    N1(0.0, 3.5),
    N2(3.5, 12.0),
    N3(12D, null);

    private final Double From;
    private final Double to;

    BearingCapacity(Double from, Double to) {
        From = from;
        this.to = to;
    }

    public Double getFrom() {
        return From;
    }

    public Double getTo() {
        return to;
    }
}
