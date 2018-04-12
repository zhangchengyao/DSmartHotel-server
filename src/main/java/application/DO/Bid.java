package application.DO;

public class Bid {
    private Integer bidid;

    private Integer tenantid;

    private String landlordname;

    private Integer result; //0:accept  1:refuse  2:negotiate

    private Integer price;

    private Integer roomid;

    private String orderid;

    private Integer score;

    public Bid(Integer bidid, Integer tenantid , String landlordname, Integer result, Integer price, Integer roomid, String orderid, Integer score) {
        this.bidid = bidid;
        this.tenantid = tenantid;
        this.landlordname = landlordname;
        this.result = result;
        this.price = price;
        this.roomid = roomid;
        this.orderid = orderid;
        this.score = score;
    }

    public Bid() {
        super();
    }

    public Integer getBidid() {
        return bidid;
    }

    public void setBidid(Integer bidid) {
        this.bidid = bidid;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getLandlordname() {
        return landlordname;
    }

    public void setLandlordname(String landlordname) {
        this.landlordname = landlordname;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }
}
