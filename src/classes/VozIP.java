package classes;

public class VozIP extends AlternativeLine {

    private double minuteLocal;
    private double minuteLongDistance;
    private double minuteCellphone;
    public static double cellphoneLongDistanceBalance;
    
    public VozIP(double time, double numberCalls, double totalCost, double minuteLocal, double minuteLongDistance,
            double minuteCellphone) {
        super(time, numberCalls, totalCost);
        this.minuteLocal = 1.5;
        this.minuteLongDistance = 0.8;
        this.minuteCellphone = 0.7;
    }

    public double getMinuteLocal() {
        return minuteLocal;
    }

    public void setMinuteLocal(double minuteLocal) {
        this.minuteLocal = minuteLocal;
    }

    public double getMinuteLongDistance() {
        return minuteLongDistance;
    }

    public void setMinuteLongDistance(double minuteLongDistance) {
        this.minuteLongDistance = minuteLongDistance;
    }

    public double getMinuteCellphone() {
        return minuteCellphone;
    }

    public void setMinuteCellphone(double minuteCellphone) {
        this.minuteCellphone = minuteCellphone;
    }

    @Override
    public String toString() {
        return "VozIP [minuteCellphone=" + minuteCellphone + ", minuteLocal=" + minuteLocal + ", minuteLongDistance="
                + minuteLongDistance + "]";
    }

}
