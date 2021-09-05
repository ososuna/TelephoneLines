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

        switch ( this.callType ) {
            case "Local":
                return "\nLand line call" + "\nCall type: " + this.callType
                        + "\nMinutes: " + this.time + "\nCost: $"
                        + String.format("%.2f", this.time * LandLine.minuteLocal);
            case "Long distance":
                return "\nLand line call" + "\nCall type: " + this.callType
                        + "\nMinutes: " + this.time + "\nCost: $"
                        + String.format("%.2f", this.time * LandLine.minuteLongDistance);
            case "Cellphone":
                return "\nLand line call" + "\nCall type: " + this.callType
                        + "\nMinutes: " + this.time + "\nCost: $"
                        + String.format("%.2f", this.time * LandLine.minuteCellphone);
            default:
                return "\nLand line call" + "\nCall type: " + this.callType
                        + "\nMinutes: " + this.time;
        }

    }

}
