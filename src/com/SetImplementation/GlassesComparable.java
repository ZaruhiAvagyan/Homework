package com.SetImplementation;

public class GlassesComparable implements Comparable <GlassesComparable>  {

    private double price;

    public GlassesComparable(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(GlassesComparable o) {
        return (this.getPrice()==o.getPrice() ? 0 : (this.getPrice() > o.getPrice() ? 1 : -1));
    }

    @Override
    public String toString() {
        return "Glasses : " +
                "price=" + price;
    }
}
