package multiAgent.ontology;

import jade.content.Concept;
import jade.util.leap.List;

/**
 * Created by H77 on 2017/5/16.
 */
public class MapObjects implements Concept {

    private String keyWords;
    private List objects;

    public MapObjects(String keyWords, List objects) {
        this.keyWords = keyWords;
        this.objects = objects;
    }
    public MapObjects(){

    }
    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public List getObjects() {
        return objects;
    }

    public void setObjects(List objects) {
        this.objects = objects;
    }

}
