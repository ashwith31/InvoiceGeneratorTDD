package com.bridgelabz;

/******************************************************
 * Purpose: This class has methods with which we calculate the fare for the rides.
 *
 * @author : Ashwith
 * @since : 04/11/21
 ********************************************************/

public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    /**
     * This method calculates the fare for the ride.
     *
     * @param distance
     * @param time
     * @return double - fare amount.
     */
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER+time * COST_PER_TIME;
        if(totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;
    }

    /**
     * This method is used to calculate fare for multiple rides.
     *
     * @param rides
     * @return double - Total fare for the rides
     */
    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }
}
