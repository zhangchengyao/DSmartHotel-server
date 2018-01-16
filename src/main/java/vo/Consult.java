package vo;

/**
 * Created by sam on 2017/6/4.
 */
public class Consult
{
    private String tenantName;

    private String landlordName;

    private int minReduction;   //最低降价幅度
    private int maxReduction;   //最高降价幅度

    private int actualPrice;    //协商后的实际价格

    private int type;     //0:申请降价，1：返回协商结果(同意)，2：返回协商结果(拒绝)

    private String BidLevel;    //好，中，差

    public Consult(String tenant,String landlord,int minreduction,int maxreduction,int type,String level, int actual){
        this.tenantName = tenant;
        this.landlordName = landlord;
        this.minReduction = minreduction;
        this.maxReduction = maxreduction;
        this.type = type;
        this.BidLevel = level;
        this.actualPrice = actual;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getBidLevel() {
        return BidLevel;
    }

    public void setBidLevel(String bidLevel) {
        BidLevel = bidLevel;
    }

    public int getMinReduction() {
        return minReduction;
    }

    public void setMinReduction(int minReduction) {
        this.minReduction = minReduction;
    }

    public int getMaxReduction() {
        return maxReduction;
    }

    public void setMaxReduction(int maxReduction) {
        this.maxReduction = maxReduction;
    }

    public int getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(int actualPrice) {
        this.actualPrice = actualPrice;
    }
}
