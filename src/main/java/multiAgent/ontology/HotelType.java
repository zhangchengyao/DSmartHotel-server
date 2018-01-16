package multiAgent.ontology;

/**
 * Created by zcy on 2017/5/16.
 *
 */
public enum HotelType {
    Motel("Motel"),
    ThemeHotel("ThemeHotel"),
    BoutiqueHotel("BoutiqueHotel");

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private HotelType(String description){
        this.description = description;
    }
}
