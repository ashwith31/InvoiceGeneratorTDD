package com.bridgelabz;
/*******************************************************
 * Purpose: This is a pojo class which is used while making the summary of rides
 *
 * @author : Ashwith
 * @since : 5/11/21
 ********************************************************/
public class InvoiceSummary {
    private final int numOfRides;
    private final double totalFare;
    private final double averageFare;

    /**
     * Constructor to initialize the variables.
     *
     * @param numberOfRides
     * @param totalFare
     */
    public InvoiceSummary(int numberOfRides, double totalFare) {
        this.numOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / numberOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numOfRides == that.numOfRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.averageFare, averageFare) == 0;
    }
}
