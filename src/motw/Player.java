package motw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Player {
    private String name;
    private String description;
    private int armor;
    private Health health;
    private Map<String, Set<String>> gear = new HashMap<>();
    private Map<String, String> moves = new TreeMap<>();

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Health getHealth(){return this.health;}
    public void setHealth(Health health){this.health = health;}
    public Map getGear(){return gear;}
    public void setGear(Map<String, Set<String>> gear) { this.gear = gear; }
    public void setMoves(Map<String, String> moves) { this.moves = moves; }
    public Map<String, String> getMoves() { return moves; }
    public int decrementHealth(){
        return health.decrementHealth();
    }
    public int incrementHealth(){
        return health.incrementHealth();
    }
    public boolean isUnstable(){
        return health.isUnstable();
    }
    public void addMove(String moveName, String moveDescription){
        moves.put(moveName, moveDescription);
    }
    public void removeMove(String moveName){
        moves.remove(moveName);
    }

    //Adds a gear, if one already exists replace tags
    public void addGear(String gearDescription, Set<String> gearTags){
        gear.put(gearDescription,gearTags);
    }
    //removes a gear if only one exists, if more exists it will decrement by 1
    public void removeGear(String gearDescription){
        gear.remove(gearDescription);
    }
    public void addGearTag(String gearDescription, String gearTag){
        if(!gear.containsKey(gearDescription)){
            return;
            //TODO Add exception
        } else {
            gear.get(gearDescription).add(gearTag);
        }
    }
    public void removeGearTag(String gearDescription, String gearTag){
        if(!gear.containsKey(gearDescription)){
            return;
            //TODO Add exception
        } else {
            gear.get(gearDescription).remove(gearTag);
        }
    }
}
