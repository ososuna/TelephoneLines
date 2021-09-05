package classes;

public class VozIP extends TelephoneLine {

    public static double minuteLocal = 1.5;
    public static double minuteLongDistance = 0.8;
    public static double minuteCellphone = 0.7;
    public static double cellphoneLongDistanceBalance = 100;
    
    public VozIP(double time, String callType) {
        super(time, callType);
    }    
    
}
