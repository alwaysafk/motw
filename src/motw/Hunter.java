package motw;


import java.util.*;

public class Hunter {
    //Has Get and Set operations
    private String playbook;
    private String name;
    private Luck luck;
    private Health health;
    private Level level;

    private Map<String, Integer> ratings = new HashMap<>();
    private Map<String, Set<String>> gear = new HashMap<>();
    private Map<String, String> moves = new TreeMap<>();

    /*
    Moves and Improvements removed to be added as separate objects
    */
    //Object Changes

    public String getPlaybook() {return playbook;};
    public void setPlaybook(String playbooks) {this.playbook = playbooks;}
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    public Luck getLuck(){return this.luck;}
    public void setLuck(Luck luck){this.luck = luck;}
    public Health getHealth(){return this.health;}
    public void setHealth(Health health){this.health = health;}
    public Level getLevel(){return this.level;}
    public void setLevel(Level level){this.level = level;}
    public Map<String, Integer> getRatings() {return ratings;}
    public void setRatings(HashMap<String, Integer> ratings) {this.ratings = ratings;}
    public Map getGear(){return gear;}
    public void setGear(HashMap gear){this.gear = gear;}


    public int decrementLuck(){
        return luck.derementLuck();
    }
    public int decrementHealth(){
        return health.decrementHealth();
    }
    public int incrementHealth(){
        return health.incrementHealth();
    }
    public boolean isUnstable(){
        return health.isUnstable();
    }
    public int incrementLevel(){
        return level.levelUp();
    }
    public int decrementLevel(){
        return level.decrementLevel();
    }
    public void addImprovement(String improvementName, String improvementDescription){
        level.addImprovement(improvementName, improvementDescription);
    }
    public void removeImprovement(int improvementLevel){
        level.removeImprovement(improvementLevel);
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
    public void addRating(String ratingName, int ratingValue){
        if(!ratings.isEmpty() && ratings.containsKey(ratingName))
            return;
        ratings.put(ratingName,ratingValue);
    }
    public void incrementRating(String ratingName){
        if(!ratings.containsKey(ratingName))
            return;
        ratings.put(ratingName,ratings.get(ratingName)+1);
    }

}
