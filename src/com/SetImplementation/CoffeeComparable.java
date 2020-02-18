package com.SetImplementation;

public class CoffeeComparable implements Comparable<CoffeeComparable> {

    private int coffeeLevel;

    public CoffeeComparable(int coffeeLevel) {
        this.coffeeLevel = coffeeLevel;
    }

    public int getCoffeeLevel() {
        return coffeeLevel;
    }

    public void setCoffeeLevel(int coffeeLevel) {
        this.coffeeLevel = coffeeLevel;
    }

    @Override
    public int compareTo(CoffeeComparable o) {
        int tempLevel = o.getCoffeeLevel();
        return (this.getCoffeeLevel() == tempLevel ? 0 : (this.getCoffeeLevel() < tempLevel ? -1 : 1));

    }

    @Override
    public String toString() {
        return "Coffee : " +
                "coffeeLevel=" + coffeeLevel;
    }
}
