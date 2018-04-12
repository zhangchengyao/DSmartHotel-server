package application.vo;

import java.util.List;

/**
 * Created by H77 on 2017/5/28.
 */
public class BidInfo {

    String hotelName;
    String hotelType;
    String roomType;
    String actualPrice;
    String roomPrice;
    int num;
    List<String> facilitys;
    List<Consult> consults;
    String location;
    int score;

    public BidInfo(String hotelName, String hotelType, String roomType, String actualPrice, String roomPrice, int num, List<String> facilitys, List<Consult> consult) {
        this.hotelName = hotelName;
        this.hotelType = hotelType;
        this.roomType = roomType;
        this.actualPrice = actualPrice;
        this.roomPrice = roomPrice;
        this.num = num;
        this.facilitys = facilitys;
        this.consults = consult;
    }
    public BidInfo(){}

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(String actualPrice) {
        this.actualPrice = actualPrice;
    }

    public String getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<String> getFacilitys() {
        return facilitys;
    }

    public void setFacilitys(List<String> facilitys) {
        this.facilitys = facilitys;
    }

    public List<Consult> getConsults() {
        return consults;
    }

    public void setConsults(List<Consult> consults) {
        this.consults = consults;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "BidInfo{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelType='" + hotelType + '\'' +
                ", roomType='" + roomType + '\'' +
                ", actualPrice='" + actualPrice + '\'' +
                ", roomPrice='" + roomPrice + '\'' +
                ", num=" + num +
                ", facilitys=" + facilitys +
                ", consults=" + consults +
                ", location='" + location + '\'' +
                ", score=" + score +
                '}';
    }

}
