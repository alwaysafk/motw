package motw;


import java.util.*;

public class Hunter extends Player{
    //Has Get and Set operations


    private String playbook;
    private Luck luck;
    private Level level;
    private Map<String, Integer> ratings = new HashMap<>();

    /*
    Moves and Improvements removed to be added as separate objects
    */
    //Object Changes

    public String getPlaybook() {return playbook;};
    public void setPlaybook(String playbooks) {this.playbook = playbooks;}

    public Luck getLuck(){return this.luck;}
    public void setLuck(Luck luck){this.luck = luck;}

    public Level getLevel(){return this.level;}
    public void setLevel(Level level){this.level = level;}
    public Map<String, Integer> getRatings() {return ratings;}
    public void setRatings(Map<String, Integer> ratings) { this.ratings = ratings;}

    public int decrementLuck(){
        return luck.derementLuck();
    }
    public int incrementLevel(){
        return level.levelUp();
    }
    public int decrementLevel(){
        return level.decrementLevel();
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
