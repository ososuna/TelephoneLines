package classes;

public class CellphoneLine extends TelephoneLine {
    
    public static double minuteLocal = 2;
    public static double minuteCellphone = 4;
    public static double localBalance = 50;
    
    public CellphoneLine(double time, String callType) {
        super(time, callType);
    }

    @Override
    public String toString() {
        
        switch ( this.callType ) {
            case "Local":
                return "\nCellphone call" + "\nCall type: " + this.callType
                        + "\nMinutes: " + this.time + "\nCost: $"
                        + String.format("%.2f", this.time * CellphoneLine.minuteLocal);
            case "Cellphone":
                return "\nCellphone call" + "\nCall type: " + this.callType
                        + "\nMinutes: " + this.time + "\nCost: $"
                        + String.format("%.2f", this.time * CellphoneLine.minuteCellphone);
            default:
                return "\nCellphone call" + "\nCall type: " + this.callType
                        + "\nMinutes: " + this.time;
        }

    }

}
