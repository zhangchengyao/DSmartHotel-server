package multiAgent.ontology;

import jade.content.AgentAction;
import jade.content.Concept;
import jade.core.AID;
import jade.util.leap.List;


/**
 * Created by H77 on 2017/5/7.
 *
 */
public class Bid implements Concept {

    //市场价，是否再同意降价,床的大小，房间大小
    private String id; //就是orderId,现在暂时用的AID
    private Room room;
    private int num;
    private int price;
    private List facilities;
    private List aroundsites;
    private AID tenantId;
    private AID landlordId;
    private int type; // 0 拒绝竞标  1 竞标

    public Bid(String id,
               Room room,
               int price,
               int num,
               List facilities,
               List aroundsites,
               AID landlordId ,
               AID tenantId ,
               int type)
    {
        this.id = id;
        this.room = room;
        this.price = price;
        this.num = num;
        this.facilities =facilities;
        this.aroundsites = aroundsites;
        this.landlordId = landlordId;
        this.tenantId = tenantId;
        this.type = type;
    }
    public Bid(){}
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public AID getTenantId() {
        return tenantId;
    }
    public void setTenantId(AID tenantId) {
        this.tenantId = tenantId;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public AID getLandlordId() {
        return landlordId;
    }
    public void setLandlordId(AID landlordId) {
        this.landlordId = landlordId;
    }
    public int getType() { return type; }
    public void setType(int type) { this.type = type;}
    public List getFacilities() {
        return facilities;
    }
    public void setFacilities(List facilities) {
        this.facilities = facilities;
    }
    public List getAroundsites() {
        return aroundsites;
    }
    public void setAroundsites(List aroundsites) {
        this.aroundsites = aroundsites;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
}
