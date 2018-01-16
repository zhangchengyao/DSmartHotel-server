package multiAgent.agentHelper.calScore;

import jade.util.leap.List;
import multiAgent.ontology.RoomType;

import java.util.HashMap;

/**
 * Created by sam on 2017/5/25.
 */
public interface CalPoints {
    //to calculate the score of price
    public int calPrice(int max,int min,int average,int targetPrice);

    //to calculate the score of roomType
    public int calRoom(String bidRoomtype,String orderRoomType,HashMap<RoomType,Integer> roomPoint);

    //to calculate the score of facilities
    public int calFacility(List bidFacilities,List orderFacilities);

    //to calculate the score of aroundSites
    public int calsite(List aroundSites);
}
