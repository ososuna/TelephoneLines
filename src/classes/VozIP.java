package classes;

public class VozIP extends TelephoneLine {

    public static double minuteLocal = 1.5;
    public static double minuteLongDistance = 0.8;
    public static double minuteCellphone = 0.7;
    public static double cellphoneLongDistanceBalance = 100;
    
    public VozIP(double time, String callType) {
        super(time, callType);
    }

    @Override
    public String toString() {
        
        switch ( this.callType ) {
            case "Local":
                return "\nVozIP call" + "\nCall type: " + this.callType
                        + "\nMinutes: " + this.time + "\nCost: $"
                        + String.format("%.2f", this.time * VozIP.minuteLocal);
            case "Long distance":
                return "\nVozIP call" + "\nCall type: " + this.callType
                        + "\nMinutes: " + this.time + "\nCost: $"
                        + String.format("%.2f", this.time * VozIP.minuteLongDistance);
            case "Cellphone":
                return "\nVozIP call" + "\nCall type: " + this.callType
                        + "\nMinutes: " + this.time + "\nCost: $"
                        + String.format("%.2f", this.time * VozIP.minuteCellphone);
            default:
                return "\nVozIP call" + "\nCall type: " + this.callType
                        + "\nMinutes: " + this.time;
        }

    }
    
}
