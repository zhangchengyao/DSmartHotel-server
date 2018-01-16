package multiAgent.agentHelper;

import DO.bid;
import DO.landlord;
import DO.orderRecord;
import DO.tenant;
import vo.Consult;
import dao.daoImpl.landlordDao;
import multiAgent.agent.TenantAgent;
import multiAgent.agentHelper.calScore.CalPoints;
import multiAgent.agentHelper.calScore.ComfortablePerson;
import multiAgent.agentHelper.calScore.EconomicalPerson;
import multiAgent.ontology.Bid;
import multiAgent.ontology.Order;
import multiAgent.ontology.RoomType;
import smile.classification.RandomForest;

import jade.util.leap.List;
import jade.util.leap.ArrayList;

import java.util.HashMap;

/**
 * Created by zy on 17/5/8.
 * evaluate the quality of the room(bid) which is from the landlord
 */
public class ValueCal {
    private String character = null;

    private RandomForest forest = null;
    private HashMap<RoomType,Integer> roomPoint = new HashMap<RoomType, Integer>();

    //the result of bid
    private List reject = new ArrayList();
    private List GoodBid = new ArrayList();

    private List GoodScore = new ArrayList();

    private static int init_maxPrice = 0;
    private static int init_minPrice = 0;
    private static int init_avePrice = 0;
    private static int goodLevel = 11;

    public ValueCal(){
        this.fill_hashmap();
    }

    public void initPrice(List bids){
        int sumPrice = 0;
        int maxPrice = ((Bid)bids.get(0)).getPrice();
        int minPrice = ((Bid)bids.get(0)).getPrice();
        for(int i=0;i<bids.size();i++){
            int tempPrice = ((Bid)bids.get(i)).getPrice();
            sumPrice+= tempPrice;
            if(tempPrice>maxPrice){
                maxPrice = tempPrice;
            }else if(tempPrice<minPrice){
                minPrice = tempPrice;
            }
        }
        init_avePrice = sumPrice/(bids.size());
        init_maxPrice = maxPrice;
        init_minPrice = minPrice;
    }

    public List ScreenBids(List bids, tenant user, Order order, boolean InNegotiation, jade.core.Agent agent){
        List resultBids = new ArrayList();

        int goodBidScore = 0;

        //deal with the detail scores
        CalPoints calPoints = null;
        if(user.getPreference().equals("economical")){
            calPoints = new EconomicalPerson();
            for(int i=0;i<bids.size();i++){
                Bid tempbid = ((Bid)bids.get(i));
                int priceScore = calPoints.calPrice(init_maxPrice,init_minPrice,init_avePrice,tempbid.getPrice());
                int roomScore = calPoints.calRoom(tempbid.getRoom().getType(),order.getRoomType(),roomPoint);
                int facilityScore = calPoints.calFacility(tempbid.getFacilities(),order.getFacilities());
                int siteScore = calPoints.calsite(tempbid.getAroundsites());
                int sum = priceScore+roomScore+facilityScore+siteScore;
                System.out.println("竞标书 ID 是"+tempbid.getLandlordId().getName() +" 并且他的分数是:"+sum);
                if(sum<6){
                    reject.add(tempbid);
                }else if(sum>=goodLevel){
                    goodBidScore+=sum;
                    GoodBid.add(tempbid);
                    GoodScore.add(sum);
                }else{
                    resultBids.add(tempbid);
                }

                if(!InNegotiation){
                    this.initConsult(tempbid.getRoom().getLandlordId(),user.getName(),user.getEconomic(),sum,tempbid.getPrice(),agent);
                }else{
                    this.setConsult(tempbid.getRoom().getLandlordId(),user.getEconomic(),sum,tempbid.getPrice(),agent);
                }
            }
        }else if(user.getPreference().equals("comfortable")){
            calPoints = new ComfortablePerson();
            for(int i=0;i<bids.size();i++){
                Bid tempbid = (Bid)bids.get(i);
                int priceScore = calPoints.calPrice(init_maxPrice,init_minPrice,init_avePrice,tempbid.getPrice());
                int roomScore = calPoints.calRoom(tempbid.getRoom().getType(),order.getRoomType(),roomPoint);
                int facilityScore = calPoints.calFacility(tempbid.getFacilities(),order.getFacilities());
                int siteScore = calPoints.calsite(tempbid.getAroundsites());
                int sum = priceScore+roomScore+facilityScore+siteScore;
                System.out.println("竞标书 ID 是"+tempbid.getLandlordId().getName() +" 并且他的分数是:"+sum);
                if(sum<6){
                    reject.add(tempbid);
                }else if(sum>=goodLevel){
                    goodBidScore+=sum;
                    GoodBid.add(tempbid);
                    GoodScore.add(sum);
                }else{
                    resultBids.add(tempbid);
                }

                if(!InNegotiation){
                    this.initConsult(tempbid.getRoom().getLandlordId(),user.getName(),user.getEconomic(),sum,tempbid.getPrice(),agent);
                }else{
                    this.setConsult(tempbid.getRoom().getLandlordId(),user.getEconomic(),sum,tempbid.getPrice(),agent);
                }
            }
        }else{
        }

        if(!InNegotiation){
            if(GoodBid.size()==1){          //只有唯一的好的Bid
                return null;
            }else if(GoodBid.size()>1){     //有多个好的Bid
                goodLevel = goodBidScore/(GoodBid.size());
                return resultBids;
            }else if(GoodBid.size()==0){        //没有好的Bid
                if(resultBids.size()==0){       //全部拒绝
                    return null;
                }else{
                    goodLevel=11;
                    return resultBids;
                }
            }
        }else{
            if(resultBids.size()!=0){
                return resultBids;
            }else{
                return null;
            }
        }

        return null;
    }

    public List getReject() {
        return reject;
    }

    public List getGoodBid() {
        return GoodBid;
    }

    public List getGoodScore() {
        return GoodScore;
    }

    public void setGoodScore(List goodScore) {
        GoodScore = goodScore;
    }

    //fill the hashmap
    private void fill_hashmap(){
        roomPoint.put(RoomType.Standard,1);
        roomPoint.put(RoomType.Superior,3);
        roomPoint.put(RoomType.Special,2);
        roomPoint.put(RoomType.Business,4);
        roomPoint.put(RoomType.Deluxe,5);
    }

    private void initConsult(int landlordid, String tenantName, String economy, int score, int price, jade.core.Agent agent){
        landlord lord = landlordDao.findlandlordByid(landlordid);
        int minReduction = 0;
        int maxReduction = (price>=init_minPrice)?(((price-init_minPrice)*100)/price):5;
        if(maxReduction == 0){
            maxReduction = 10;
        }
        if(economy.equals("poor")){
            minReduction = maxReduction/3+1;
        }else if(economy.equals("normal")){
            minReduction = maxReduction/5+1;
        }else if(economy.equals("rich")){
            minReduction = 1;
        }
        System.out.println("最大降价幅度："+maxReduction+" 最小降价幅度:"+minReduction);

        String level = "";
        if(score>=goodLevel){
            level = "good";
        }else if(score<6){
            level = "bad";
        }else{
            level = "middle";
        }
        Consult consult = new Consult(tenantName,lord.getLandlordname(),minReduction,maxReduction,0,level,price);
        java.util.List<Consult> consults = new java.util.ArrayList<Consult>();
        consults.add(consult);
        ((TenantAgent)agent).setConsult(landlordid,consults);
    }

    private void setConsult(int landlordid, String economy, int score, int price, jade.core.Agent agent){
        java.util.List<Consult> consults = ((TenantAgent)agent).getConsult(landlordid);
        Consult oneConsult = consults.get(consults.size() - 1);
        int minReduction = 0;
        int maxReduction = (price>=init_minPrice)?(((price-init_minPrice)*100)/price):5;
        if(maxReduction == 0){
            maxReduction = 10;
        }
        if(economy.equals("poor")){
            minReduction = maxReduction/3+1;
        }else if(economy.equals("normal")){
            minReduction = maxReduction/5+1;
        }else if(economy.equals("rich")){
            minReduction = 1;
        }
        System.out.println("最大降价幅度："+maxReduction+"  最小降价幅度:"+minReduction);

        String level = "";
        if(score>=goodLevel){
            level = "好";
        }else if(score<6){
            level = "差";
        }else{
            level = "中";
        }
        Consult result = new Consult(oneConsult.getTenantName(), oneConsult.getLandlordName(), minReduction, maxReduction, 0, level, price);
        consults.add(result);
        ((TenantAgent)agent).setConsult(landlordid,consults);
    }



    private void saveBid(int tenantid,String name,int result){
        bid saveobject = new bid();
    }

}
