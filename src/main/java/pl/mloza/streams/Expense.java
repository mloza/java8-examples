package pl.mloza.streams;

public class Expense {
    int cost;
    Category category;

    public Expense(int cost, Category category) {
        this.cost = cost;
        this.category = category;
    }

    public int getCost() {
        return cost;
    }

    public Category getCategory() {
        return category;
    }

    @Override public String toString() {
        return "Expense("+cost +", " +category +")";
    }
}
