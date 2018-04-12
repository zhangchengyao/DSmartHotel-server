package application.multiAgent.agentHelper;

import application.DO.OrderRecord;
//import dao.daoImpl.tenantDao;
import jade.util.leap.ArrayList;
import jade.util.leap.List;
import application.multiAgent.ontology.Bid;
import application.multiAgent.ontology.RoomType;
import smile.classification.RandomForest;
import smile.data.Attribute;
import smile.data.NumericAttribute;

import java.util.HashMap;

/**
 * Created by sam on 2017/5/25.
 */
public class RandomForestCal {

    private RandomForest forest = null;
    private HashMap<RoomType,Integer> roomPoint = new HashMap<RoomType, Integer>();

    public RandomForestCal(){
        this.fill_hashmap();
    }

    //calculate the mark of all bids ,to find some bids whose mark is larger than average.
    public List bidvalue(List bids){
        List result = new ArrayList();
        int[] values = new int[bids.size()];
        int sum = 0;

        for(int i=0;i<bids.size();i++){
            Bid bid = (Bid)bids.get(i);
            int tempvalue = this.randomForestCal(bid);
            values[i] = tempvalue;
            sum+=tempvalue;
        }
        int average = sum/(bids.size());

        for(int i=0;i<bids.size();i++){
            if(values[i]>average){
                result.add(bids.get(i));
            }
        }

        return result;
    }

    public Bid getBestBid(List bids){
        Bid result = null;
        int point = 0;
        for(int i=0;i<bids.size();i++){
            Bid bid = (Bid)bids.get(i);
            int tempvalue = this.randomForestCal(bid);
            if(tempvalue>point){
                result = bid;
                point = tempvalue;
            }
        }

        return result;
    }

    //train the randomTree
    public void TrainrandomForest(int tenantid){

//        File f = new File("D:/jade/train.csv");
//        java.application.util.List<String> dataSet = CSVUtils.importCsv(f);
//        tenantDao Tenant = new tenantDao();
//        java.application.util.List<OrderRecord> orders = Tenant.getrecords(tenantid);
        java.util.List<OrderRecord> orders = new java.util.ArrayList<>();

        Attribute[] attrs = initAttribute();
        double[][] x = new double[orders.size()-1][4];
        int [] y = new int[orders.size()-1];
        for(int i = 0 ; i <orders.size() ; i++){
            OrderRecord record = orders.get(i);
            double[]  arr = dataDeal_train(record);
            x[i] = arr;
            y[i] = record.getPoint();
        }
        forest = new RandomForest(attrs,x,y,7);

    }
    //method for train randomtree
    private Attribute[] initAttribute(){
        Attribute[] attrs = new Attribute[4];
        attrs[0] = new NumericAttribute("price");
        attrs[1] = new NumericAttribute("facilities");
        attrs[2] = new NumericAttribute("aroundSites");
        attrs[3] = new NumericAttribute("roomType");
        return attrs;
    }
    //method for train randomtree
    private double[] dataDeal_train(OrderRecord record){
        double[] arr = new double[4];
        double price = record.getPrice();
        String[] facilities = record.getFacilities().split(",");
        double facility = facilities.length;
        String[] aroundsites = record.getAroundsite().split(",");
        double aroundsite = aroundsites.length;
        double roomtype = roomPoint.get(record.getRoomtype());

        arr[0] = price;
        arr[1] = facility;
        arr[2] = aroundsite;
        arr[3] = roomtype;

        return arr;
    }

    //Use the randomForest to compute the result of one Bid
    public int randomForestCal(Bid bid){
        double[] x = new double[4];
        double price = bid.getPrice();
        double facility = bid.getFacilities().size();
        double sites = bid.getAroundsites().size();
        String type = bid.getRoom().getType();
        double roomtype = roomPoint.get(type);
        x[0] = price;
        x[1] = facility;
        x[2] = sites;
        x[3] = roomtype;

        int y = forest.predict(x);
        return y;
    }

    //fill the hashmap
    private void fill_hashmap(){
        roomPoint.put(RoomType.Standard,1);
        roomPoint.put(RoomType.Superior,3);
        roomPoint.put(RoomType.Special,2);
        roomPoint.put(RoomType.Business,4);
        roomPoint.put(RoomType.Deluxe,5);
    }



}
