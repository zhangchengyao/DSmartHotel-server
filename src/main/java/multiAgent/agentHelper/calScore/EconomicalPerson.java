package multiAgent.agentHelper.calScore;

import jade.util.leap.List;
import multiAgent.ontology.MapObject;
import multiAgent.ontology.MapObjects;
import multiAgent.ontology.RoomType;

import java.util.HashMap;

/**
 * Created by sam on 2017/5/25.
 */
public class EconomicalPerson implements CalPoints {

    public int calPrice(int max, int min, int average, int targetPrice) {   //max 6 points
        if(targetPrice <= min){
            return 6;
        }else if(targetPrice >= max){
            return 0;
        }

        if(targetPrice <= average){ //less than average
            if((average-targetPrice)>=(targetPrice-min)){       //close to min price
                return 5;
            }else{                                              //close to average
                return 4;
            }
        }else{  //more than average
            if((targetPrice-average)>=(max-targetPrice)){       //close to max price
                return 1;
            }else{                                              //close to average
                return 3;
            }
        }
    }

    public int calRoom(String bidRoomtype, String orderRoomType,HashMap<RoomType,Integer> roomPoint) {  //max 3 points
        RoomType roomType = RoomType.valueOf(bidRoomtype);
        int getInt = roomPoint.get(roomType);
        RoomType order = RoomType.valueOf(orderRoomType);
        int orderInt = roomPoint.get(order);
        if(getInt == orderInt){
            return 2;
        }else if(getInt > orderInt){
            return 3;
        }else{
            return 1;
        }
    }

    public int calFacility(List bidFacilities, List orderFacilities) {  //max 3 points
        int orderSize = orderFacilities.size();
        int bidSize = bidFacilities.size();
        int bidINorder = 0;
        for(int i=0;i<orderSize;i++){
            if(bidFacilities.contains(orderFacilities.get(i))){     //the facility in order is also in bid
                bidINorder++;
            }
        }

        if(bidINorder == orderSize){        //order中要求的facilities都有
            if(bidSize > orderSize){        //bid中还有order没要求的
                return 3;
            }else if(bidSize == orderSize){     //just as order
                return 2;
            }else {
                System.out.println("calFacility is wrong!");
            }
        }else if(bidINorder < orderSize){       //order中要求的facilities并不是都有
            if(bidSize>bidINorder){             //有order中未要求的facility
                return 1;
            }else if(bidSize == bidINorder){
                if(bidINorder>(orderSize/2)){   //satisfy the half of order
                    return 1;
                }else{
                    return 0;
                }
            }else{
                System.out.println("calFacility is wrong!!");
            }
        }else{
            System.out.println("calFacility is wrong!!!");
        }
        return 0;
    }

    public int calsite(List aroundSites) {  //max 3 points
        int siteSize = aroundSites.size();
        List bus = null;
        List stores = null;
        for(int i=0;i<aroundSites.size();i++){
            if(((MapObjects)aroundSites.get(i)).getKeyWords().equals("公交")){
                bus = ((MapObjects)aroundSites.get(i)).getObjects();
            }else if(((MapObjects)aroundSites.get(i)).getKeyWords().equals("超市")){
                stores = ((MapObjects)aroundSites.get(i)).getObjects();
            }
        }

        if(bus.size()==0&&stores.size()==0){
            return 0;
        }else if(bus.size()==0||stores.size()==0){
            return 0;
        }else{
            int minbus = Integer.parseInt(((MapObject)bus.get(0)).getDistance());
            int minstore = Integer.parseInt(((MapObject)stores.get(0)).getDistance());
            for(int i=0;i<bus.size();i++){
                int temp = Integer.parseInt(((MapObject)bus.get(i)).getDistance());
                if(temp<minbus){
                    minbus = temp;
                }
            }

            for(int i=0;i<stores.size();i++){
                int temp = Integer.parseInt(((MapObject)stores.get(i)).getDistance());
                if(temp<minstore){
                    minstore = temp;
                }
            }

            if(minbus<100&&minstore<100){
                return 3;
            }else if(minbus<100||minstore<100){
                return 2;
            }else {
                return 1;
            }
        }

    }
}
