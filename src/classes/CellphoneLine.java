package classes;

public class CellphoneLine extends TelephoneLine {
    
    private double minuteLocal;
    private double minuteCellphone;
    
    public CellphoneLine(double balance, double time, double numberCalls, double totalCost, double minuteLocal,
            double minuteCellphone) {
        super(balance, time, numberCalls, totalCost);
        this.minuteLocal = minuteLocal;
        this.minuteCellphone = minuteCellphone;
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
