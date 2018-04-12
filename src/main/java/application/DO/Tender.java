package application.DO;

import java.util.Date;

public class Tender {
    private Integer tenderid;

    private String orderid;

    private Integer userid;

    private Integer price;

    private String address;

    private Date starttime;

    private Date leavetime;

    private String roomtype;

    private Integer roomnum;

    private Date createdat;

    private String facilities;

    private String hoteltype;

    private String aroundsite;

    public Tender(String orderid, Integer userid, Integer price, String address, Date starttime, Date leavetime, String roomtype, Integer roomnum, Date createdat, String facilities, String hoteltype) {
        this.orderid = orderid;
        this.userid = userid;
        this.price = price;
        this.address = address;
        this.starttime = starttime;
        this.leavetime = leavetime;
        this.roomtype = roomtype;
        this.roomnum = roomnum;
        this.createdat = createdat;
        this.facilities = facilities;
        this.hoteltype = hoteltype;
    }

    public Tender() {
        super();
    }

    public Integer getTenderid() {
        return tenderid;
    }

    public void setTenderid(Integer tenderid) {
        this.tenderid = tenderid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }

    public Integer getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(Integer roomnum) {
        this.roomnum = roomnum;
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
}
