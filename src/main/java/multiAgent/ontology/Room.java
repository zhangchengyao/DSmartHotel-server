package multiAgent.ontology;

import jade.content.Concept;
import jade.core.AID;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zcy on 2017/5/8.
 *
 */
public class Room implements Concept{
    private Integer roomId;
    private Integer landlordId;
    private String type;
    private int price;
    private Date validStartTime;
    private Date validEndTime;
    private String area;
    private Integer restNum;
    private AID owner;


    public Room(Integer roomId, Integer landlordId, String type, AID owner, int price, Date validStartTime, Date validEndTime, String area, Integer restNum){
        this.roomId = roomId;
        this.landlordId = landlordId;
        this.type = type;
        this.owner = owner;
        this.price = price;
        this.validStartTime = validStartTime;
        this.validEndTime = validEndTime;
        this.area = area;
        this.restNum = restNum;
    }
    public Room(){}
    public AID getOwner() {
        return owner;
    }

    public void setOwner(AID owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(Integer landlordId) {
        this.landlordId = landlordId;
    }

    public Date getValidStartTime() {
        return validStartTime;
    }

    public void setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
    }

    public Date getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getRestNum() {
        return restNum;
    }

    public void setRestNum(Integer restNum) {
        this.restNum = restNum;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", landlordId=" + landlordId +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", validStartTime=" + validStartTime +
                ", validEndTime=" + validEndTime +
                ", area='" + area + '\'' +
                ", restNum=" + restNum +
                ", owner=" + owner +
                '}';
    }
}
