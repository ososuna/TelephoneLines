package classes;

public class LandLine extends TelephoneLine {
    
    private double minuteLocal;
    private double minuteLongDistance;
    private double minuteCellphone;
    
    public LandLine(double time, double numberCalls, double totalCost) {
        super(time, numberCalls, totalCost);
        this.minuteLocal = 1;
        this.minuteLongDistance = 1.5;
        this.minuteCellphone = 2;
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
