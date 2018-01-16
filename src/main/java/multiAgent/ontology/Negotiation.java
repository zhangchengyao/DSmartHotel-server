package multiAgent.ontology;

import jade.content.AgentAction;

/**
 * Created by zy on 17/5/8.
 *
 */
public class Negotiation implements AgentAction {

    private String id;

    private int minReduction;  //最小降价幅度

    private int maxReduction;  //最大降价幅度

    private int result;  //1表示同意，0表示拒绝，-1表示还未处理  2表示结束协商过程

    private int actualPrice;

    public Negotiation(String id , int minReduction, int maxReduction, int result,int actualPrice) {
        this.id = id;
        this.minReduction = minReduction;
        this.maxReduction = maxReduction;
        this.result = result;
        this.actualPrice=actualPrice;
    }

    public Negotiation(){}


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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(int actualPrice) {
        this.actualPrice = actualPrice;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
