package multiAgent.ontology;

import jade.content.AgentAction;
import jade.content.Concept;
import jade.core.AID;
import jade.util.leap.List;

import java.util.Date;

/**
 * Created by H77 on 2017/5/5.
 *
 */
public class Order implements Concept {

    //价格（给个范围），地点，时间，房间类型，房间数量，下单时间
    //设施：wifi，park，24小时热水，独立卫生间，提供早餐，接送机服务
    //类型：经济型，豪华型，公寓型
    //周边：机场，景点，超市
    private String id;
    private String customer;
    private String address;
    private String hotelType;
    private String roomType;
    private int roomNum;
    private Date startTime;
    private Date endTime;
    private Date createTime;
    private int minPrice;
    private int maxPrice;
    private List facilities;
    private AID source;

    public Order(String id,
                 String customer,
                 String address,
                 String hotelType,
                 String roomType,
                 int roomNum,
                 Date start,
                 Date end,
                 Date create,
                 int minPrice,
                 int maxPrice,
                 List facilities,
                 AID source)
    {
        this.id = id;
        this.customer = customer;
        this.address = address;
        this.hotelType = hotelType;
        this.roomType = roomType;
        this.roomNum = roomNum;
        this.startTime = start;
        this.endTime = end;
        this.createTime = create;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.facilities = facilities;
        this.source = source;
    }

    public Order(){

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public AID getSource() {
        return source;
    }

    public void setSource(AID source) {
        this.source = source;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public List getFacilities() {
        return facilities;
    }

    public void setFacilities(List facilities) {
        this.facilities = facilities;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
