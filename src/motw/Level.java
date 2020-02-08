package motw;

import java.util.Map;
import java.util.TreeMap;

public class Level {
    private int maxExp;
    private int currentExp;
    private int levelCount;
    private Map<String, String> improvement = new TreeMap<>();

    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }

    public int getMaxExp() {
        return maxExp;
    }

    public void setCurrentExp(int currentExp) {
        this.currentExp = currentExp;
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public void setImprovement(Map<String, String> improvement) {
        this.improvement = improvement;
    }

    public Map<String, String> getImprovement() {
        return improvement;
    }
    public int levelUp(){
        if(currentExp < maxExp)
            currentExp++;
        if(currentExp == maxExp) {
            currentExp = 0;
            levelCount++;
        }
        return currentExp;
    }
    public int decrementLevel(){
        if(currentExp > 0)
            currentExp--;
        return currentExp;
    }
    public void addImprovement(String improvementName, String improvementDescription){
        improvement.put(improvementName, improvementDescription);
    }
    public void removeImprovement(int improvementLevel){
        improvement.remove(improvementLevel);
    }
    @Override
    public String toString(){
        return "Level " + currentExp + " out of " + maxExp +
                "\n Improvements " + improvement;
    }
}
