package classes;

public abstract class TelephoneLine {
    
    protected double time;
    protected String callType;
    
    public TelephoneLine(double time, String callType) {
        this.time = time;
        this.callType = callType;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    @Override
    public String toString() {
        return "TelephoneLine [callType=" + callType + ", time=" + time + "]";
    }

}
