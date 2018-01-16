package multiAgent.ontology;

/**
 * Created by zcy on 2017/5/8.
 *
 */
public enum RoomType {

    Standard("Standard"),
    Superior("Superior"),
    Deluxe("Deluxe"),
    Business("Business"),
    Special("Special");

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private RoomType(String description){
        this.description = description;
    }


}
