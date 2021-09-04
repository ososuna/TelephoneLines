package classes;

public class TelephoneLine {
    
    private double balance;
    private double time;
    private double numberCalls;
    private double totalCost;
    
    public TelephoneLine(double balance, double time, double numberCalls, double totalCost) {
        this.balance = balance;
        this.time = time;
        this.numberCalls = numberCalls;
        this.totalCost = totalCost;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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
        return "TelephoneLine [balance=" + balance + ", numberCalls=" + numberCalls + ", time=" + time + ", totalCost="
                + totalCost + "]";
    }
}
