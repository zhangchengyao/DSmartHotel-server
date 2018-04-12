package application.multiAgent.agentHelper;

import application.DO.Landlord;

/**
 * Created by H77 on 2017/5/16.
 */
public class LandlordCompare {

    private Landlord land;
    private double distance;

    public LandlordCompare(Landlord land, double distance) {
        this.land = land;
        this.distance = distance;
    }
    public Landlord getLand() {
        return land;
    }

    public void setLand(Landlord land) {
        this.land = land;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
