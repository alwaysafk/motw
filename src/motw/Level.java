package motw;

import java.util.Map;
import java.util.TreeMap;

public class Level {
    private int maxExp;
    private int currentExp;
    private int levelCount;


    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }
    public int getMaxExp() {
        return maxExp;
    }
    public void setCurrentExp(int currentExp) {
        this.currentExp = currentExp;
    }
    public int getCurrentExp() { return currentExp; }
    public void setLevelCount(int levelCount) { this.levelCount = levelCount; }
    public int getLevelCount() { return levelCount; }

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

    @Override
    public String toString(){
        return "Level " + currentExp + " out of " + maxExp + " and have leveled " + levelCount + " times.";
    }
}
