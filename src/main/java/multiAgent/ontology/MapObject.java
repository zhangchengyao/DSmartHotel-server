package multiAgent.ontology;

import jade.content.Concept;

/**
 * Created by zy on 17/5/15.
 */
public class MapObject implements Concept{

    private String name;//地点名称

    private String lng;//经度

    private String lat;//纬度

    private String address;//具体地址

    private String distance;//距离酒店距离

    public MapObject(){

    }

    /**
     * 下面两个属性都可能为null
     */
    private String overall_rating;//地点的总体评分，如果没有评分为null，使用时请注意

    private String tag;//地点的标签

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getOverall_rating() {
        return overall_rating;
    }

    public void setOverall_rating(String overall_rating) {
        if(overall_rating != null){
            this.overall_rating = overall_rating;
        }else {
            this.overall_rating = "";
        }
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        if(tag != null){
            this.tag = tag;
        }else{
            this.tag = "";
        }
    }

    @Override
    public String toString() {
        return "MapObject{" +
                "name='" + name + '\'' +
                ", lng='" + lng + '\'' +
                ", lat='" + lat + '\'' +
                ", address='" + address + '\'' +
                ", distance='" + distance + '\'' +
                ", overall_rating='" + overall_rating + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
