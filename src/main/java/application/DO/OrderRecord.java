package application.DO;

import java.util.Date;

public class OrderRecord {
    private Integer recordid;

    private Integer userid;

    private Integer landlordid;

    private Integer price;

    private Date createdat;

    private String facilities;

    private String roomtype;

    private String hoteltype;

    private String aroundsite;

    private Date starttime;

    private Date leavetime;

    private Integer roomnum;

    private String orderid;

    private Integer point;

    public OrderRecord(Integer recordid, Integer userid, Integer landlordid, Integer price, Date createdat, String facilities, String roomtype, String hoteltype, String aroundsite, Date starttime, Date leavetime, Integer roomnum, String orderid, Integer point) {
        this.recordid = recordid;
        this.userid = userid;
        this.landlordid = landlordid;
        this.price = price;
        this.createdat = createdat;
        this.facilities = facilities;
        this.roomtype = roomtype;
        this.hoteltype = hoteltype;
        this.aroundsite = aroundsite;
        this.starttime = starttime;
        this.leavetime = leavetime;
        this.roomnum = roomnum;
        this.orderid = orderid;
        this.point = point;
    }

    public OrderRecord() {
        super();
    }

    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getLandlordid() {
        return landlordid;
    }

    public void setLandlordid(Integer landlordid) {
        this.landlordid = landlordid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities == null ? null : facilities.trim();
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }

    public String getHoteltype() {
        return hoteltype;
    }

    public void setHoteltype(String hoteltype) {
        this.hoteltype = hoteltype == null ? null : hoteltype.trim();
    }

    public String getAroundsite() {
        return aroundsite;
    }

    public void setAroundsite(String aroundsite) {
        this.aroundsite = aroundsite == null ? null : aroundsite.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    public Integer getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(Integer roomnum) {
        this.roomnum = roomnum;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
