package multiAgent.agentHelper;

import DO.landlord;

/**
 * Created by H77 on 2017/5/16.
 */
public class LandlordCompare {

    private landlord land;
    private double distance;

    public LandlordCompare(landlord land, double distance) {
        this.land = land;
        this.distance = distance;
    }
    public landlord getLand() {
        return land;
    }

    public void setLand(landlord land) {
        this.land = land;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
