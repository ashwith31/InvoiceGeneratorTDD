package com.bridgelabz;

public enum CabRide {
    NORMAL(10.0, 1.0, 5.0), PREMIUM(15.0, 2.0, 20.0);

    private final double costPerKm;
    private final double costPerMin;
    private final double minFarePerRide;

    /**
     * Constructor to initialize variables.
     * @param costPerKm
     * @param costPerMin
     * @param minFarePerRide
     */
    CabRide(double costPerKm, double costPerMin, double minFarePerRide) {
        this.costPerKm = costPerKm;
        this.costPerMin = costPerMin;
        this.minFarePerRide = minFarePerRide;
    }

    /**
     * This method is used to calculate the fare of ride.
     *
     * @param ride
     * @return double - fare of ride
     */
    public double calculateCostOfRide(Ride ride) {
        double rideCost = ride.distance * costPerKm + ride.time * costPerMin;
        return Math.max(rideCost, minFarePerRide);
    }
}
