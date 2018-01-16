package vo;

import java.math.BigDecimal;

/**
 * Created by zcy on 2017/6/4.
 *
 */
public class LandlordInfo extends UserInfo {
    private Integer landlordid;

    private String landlordname;

    private String password;

    private String landlordtype;

    private String feature;

    private Integer startprice;

    private String city;

    private String area;

    private String detailaddress;

    private String comment;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String concat;

    private String introduction;

    private String characteristic;

    public LandlordInfo(Integer landlordid, String landlordname, String password, String landlordtype, String feature, Integer startprice, String city, String area, String detailaddress, String comment, BigDecimal longitude, BigDecimal latitude, String concat, String introduction, String characteristic) {
        this.landlordid = landlordid;
        this.landlordname = landlordname;
        this.password = password;
        this.landlordtype = landlordtype;
        this.feature = feature;
        this.startprice = startprice;
        this.city = city;
        this.area = area;
        this.detailaddress = detailaddress;
        this.comment = comment;
        this.longitude = longitude;
        this.latitude = latitude;
        this.concat = concat;
        this.introduction = introduction;
        this.characteristic = characteristic;
    }

    public LandlordInfo() {
        super();
    }

    public Integer getLandlordid() {
        return landlordid;
    }

    public void setLandlordid(Integer landlordid) {
        this.landlordid = landlordid;
    }

    public String getLandlordname() {
        return landlordname;
    }

    public void setLandlordname(String landlordname) {
        this.landlordname = landlordname == null ? null : landlordname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getLandlordtype() {
        return landlordtype;
    }

    public void setLandlordtype(String landlordtype) {
        this.landlordtype = landlordtype == null ? null : landlordtype.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public Integer getStartprice() {
        return startprice;
    }

    public void setStartprice(Integer startprice) {
        this.startprice = startprice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getConcat() {
        return concat;
    }

    public void setConcat(String concat) {
        this.concat = concat == null ? null : concat.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic == null ? null : characteristic.trim();
    }
}
