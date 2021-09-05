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
        return "\nCellphone line call" + "\nCall type: " + this.getCallType()
                + "\nMinutes: " + this.getTime();
    }

}
