package classes;

public class LandLine extends TelephoneLine {
    
    public static double minuteLocal = 1;
    public static double minuteLongDistance = 1.5;
    public static double minuteCellphone = 2;
    
    public LandLine(double time, String callType) {
        super(time, callType);
    }

    @Override
    public String toString() {
        return "\nLand line call" + "\nCall type: " + this.getCallType()
                + "\nMinutes: " + this.getTime();
    }

}
