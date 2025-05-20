package com.pluralsight.finance;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(double weight) {
        super( "Gold", weight * 50);
        this.weight = weight;
    }
    public double getValue(double amount) {
        return weight;
    }
}
