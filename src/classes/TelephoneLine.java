package classes;

public class TelephoneLine {
    
    private double time;
    private double numberCalls;
    private double totalCost;
    
    public TelephoneLine(double time, double numberCalls, double totalCost) {
        this.time = time;
        this.numberCalls = numberCalls;
        this.totalCost = totalCost;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getNumberCalls() {
        return numberCalls;
    }

    public void setNumberCalls(double numberCalls) {
        this.numberCalls = numberCalls;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "TelephoneLine [numberCalls=" + numberCalls + ", time=" + time + ", totalCost=" + totalCost + "]";
    }

}
