package practice;

public class Player {

    private String name;
    private double balance;
    private int wins;
    private int losses;
    private double highestBalance;

    public Player(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.highestBalance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        balance += amount;

        if (balance > highestBalance) {
            highestBalance = balance;
        }
    }

    public void deductBalance(double amount) {
        balance -= amount;
    }

    public void addWin() {
        wins++;
    }

    public void addLoss() {
        losses++;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public double getHighestBalance() {
        return highestBalance;
    }
}