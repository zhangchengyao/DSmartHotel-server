package application.DO;

import java.math.BigDecimal;
import java.util.Date;

public class Room {
    private Integer roomid;

    private Integer landlordid;

    private String roomtype;

    private Integer price;

    private Date validstarttime;

    private Date validendtime;

    private BigDecimal area;

    private Integer restnum;

    private Integer totalnum;

    public Room(Integer roomid, Integer landlordid, String roomtype, Integer price, Date validstarttime, Date validendtime, BigDecimal area, Integer restnum, Integer totalnum) {
        this.roomid = roomid;
        this.landlordid = landlordid;
        this.roomtype = roomtype;
        this.price = price;
        this.validstarttime = validstarttime;
        this.validendtime = validendtime;
        this.area = area;
        this.restnum = restnum;
        this.totalnum = totalnum;
    }

    public Room() {
        super();
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getLandlordid() {
        return landlordid;
    }

    public void setLandlordid(Integer landlordid) {
        this.landlordid = landlordid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getValidstarttime() {
        return validstarttime;
    }

    public void setValidstarttime(Date validstarttime) {
        this.validstarttime = validstarttime;
    }

    public Date getValidendtime() {
        return validendtime;
    }

    public void setValidendtime(Date validendtime) {
        this.validendtime = validendtime;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public Integer getRestnum() {
        return restnum;
    }

    public void setRestnum(Integer restnum) {
        this.restnum = restnum;
    }

    public Integer getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(Integer totalnum) {
        this.totalnum = totalnum;
    }
}
