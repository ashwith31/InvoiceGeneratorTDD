package com.bridgelabz;

/******************************************************
 * Purpose: This class has methods with which we calculate the fare for the rides.
 *
 * @author : Ashwith
 * @since : 04/11/21
 ********************************************************/

public class InvoiceService {
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;
    private RideRepository rideRepository;

    public InvoiceService() {
        this.rideRepository =  new RideRepository();
    }

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
     * @return object of invoice summary.
     */
    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += ride.cabRide.calculateCostOfRide(ride);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }

    /**
     * This method is used to add the rides of the specific user.
     *
     * @param userId
     * @param rides
     */
    public void addRides(String userId, Ride[] rides) {
        rideRepository.addRides(userId, rides);
    }

    /**
     * This method is used to get the invoice summary of a user
     *
     * @param userId
     * @return Invoice Summary object
     */
    public InvoiceSummary getInvoiceSummary(String userId) {
        return this.calculateFare(rideRepository.getRides(userId));
    }

    public void setRideRepository(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }
}
