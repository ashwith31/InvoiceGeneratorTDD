package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*****************************************************************
 * Purpose: This class is used to add the rides of a specific user
 *           based on userID.
 *
 * @author Ashwith
 * @since 5/11/21
 ******************************************************************/
public class RideRepository {
    Map<String, ArrayList<Ride>> userRides = null;

    public RideRepository() {
        this.userRides = new HashMap<>();
    }

    /**
     * This method is used to add rides of a specific user.
     *
     * @param userId
     * @param rides
     */
    public void addRides(String userId, Ride[] rides) {
        ArrayList<Ride> rideList = this.userRides.get(userId);
        if (rideList == null) {
            this.userRides.put(userId, new ArrayList<>(Arrays.asList(rides)));
        }
    }

    /**
     * This method is used to get the total rides based on the ID of user.
     *
     * @param userId
     * @return Array of rides
     */
    public Ride[] getRides(String userId) {
        return this.userRides.get(userId).toArray(new Ride[0]);
    }
}
