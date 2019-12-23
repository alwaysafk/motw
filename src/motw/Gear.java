package motw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Gear extends TagEditor{
    private String gearDescription;
    private String gearType;
    private int gearRating;
    private int gearCount;
    public Gear(){}
    public Gear(String gearDescription, String gearType, int gearRating, int gearCount, ArrayList<Tags> tags){
        this.gearDescription = gearDescription;
        this.gearType = gearType;
        this.gearRating = gearRating;
        this.gearCount = gearCount;
        this.tags = tags;
    }

    public void setGearDescription(String gearDescription) {
        this.gearDescription = gearDescription;
    }

    public String getGearDescription() {
        return gearDescription;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearRating(int gearRating) {
        this.gearRating = gearRating;
    }

    public int getGearRating() {
        return gearRating;
    }
    public void setGearCount(int gearCount){
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }
/*
    public void setGearTags(String[] gearTags) {
        this.gearTags = gearTags;
    }

    public String[] getGearTags() {
        return gearTags;
    }

    public void addTags(String[] newTags){
        Stream.concat(Arrays.stream(gearTags), Arrays.stream(newTags)).toArray(String[]::new);
    }

 */
    @Override
    public String toString() {
        return "\nGear Description: " + gearDescription +
                " Gear Type: " + gearType +
                " Gear Rating: " + gearRating +
                " Gear Count: " + gearCount +
                " Gear Tags: " + tags.toString();
    }
}
