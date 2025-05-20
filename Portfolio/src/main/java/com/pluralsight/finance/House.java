package com.pluralsight.finance;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(int yearBuilt, int squareFeet, int bedrooms) {
        super( "House", (squareFeet * 200) + (bedrooms * 10000) - ((2023 - yearBuilt) * 1000));
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }
    public double getValue(double amount) {
        return (squareFeet * 200) + (bedrooms * 10000) - ((2023 - yearBuilt) * 1000);
    }
}
