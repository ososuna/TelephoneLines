package classes;

public abstract class TelephoneLine {
    
    private double time;
    private double numberCalls;
    private double totalCost;
    
    public TelephoneLine(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TelephoneLine [numberCalls=" + numberCalls + ", time=" + time + ", totalCost=" + totalCost + "]";
    }

}
