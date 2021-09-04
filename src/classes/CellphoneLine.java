package classes;

public class CellphoneLine extends AlternativeLine {
    
    private double minuteLocal;
    private double minuteCellphone;
    public static double localBalance = 50;
    
    public CellphoneLine(double time, double minuteLocal, double minuteCellphone) {
        super(time);
        this.minuteLocal = 2;
        this.minuteCellphone = 4;
    }

    public double getMinuteLocal() {
        return minuteLocal;
    }

    public void setMinuteLocal(double minuteLocal) {
        this.minuteLocal = minuteLocal;
    }

    public double getMinuteCellphone() {
        return minuteCellphone;
    }

    public void setMinuteCellphone(double minuteCellphone) {
        this.minuteCellphone = minuteCellphone;
    }

    @Override
    public String toString() {
        return "CellphoneLine [minuteCellphone=" + minuteCellphone + ", minuteLocal=" + minuteLocal + "]";
    }

}
