package classes;

public class LandLine extends TelephoneLine {
    
    private double minuteLocal;
    private double minuteLongDistance;
    private double minuteCellphone;
    
    public LandLine(double balance, double time, double numberCalls, double totalCost, double minuteLocal,
            double minuteLongDistance, double minuteCellphone) {
        super(balance, time, numberCalls, totalCost);
        this.minuteLocal = minuteLocal;
        this.minuteLongDistance = minuteLongDistance;
        this.minuteCellphone = minuteCellphone;
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
        return "LandLine [minuteCellphone=" + minuteCellphone + ", minuteLocal=" + minuteLocal
                +", minuteLongDistance=" + minuteLongDistance + "]";
    }

}
