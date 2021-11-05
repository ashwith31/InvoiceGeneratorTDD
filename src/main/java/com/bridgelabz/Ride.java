package com.bridgelabz;

/*************************************************************
 * This is a pojo class where we create objects of rides.
 *
 * @author Ashwith
 * @since 5/11/21
 *************************************************************/
public class Ride {
    public int time;
    public double distance;

    /**
     * Constructor to initialize variables.
     *
     * @param distance
     * @param time
     */
    public Ride(double distance, int time) {
        this.time = time;
        this.distance = distance;
    }
}
