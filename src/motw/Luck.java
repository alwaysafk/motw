package motw;

public class Luck {
    private int maxLuck;
    private int currentLuck;

    public void setCurrentLuck(int currentLuck) {
        this.currentLuck = currentLuck;
    }

    public int getCurrentLuck() {
        return currentLuck;
    }

    public void setMaxLuck(int maxLuck) {
        this.maxLuck = maxLuck;
    }

    public int getMaxLuck() {
        return maxLuck;
    }

    public int incrementLuck(){
        if(currentLuck < maxLuck)
            currentLuck++;
        return currentLuck;
    }
    public int derementLuck(){
        if(currentLuck > 0)
            currentLuck--;
        return currentLuck;
    }
    @Override
    public String toString(){
        return "Luck is " + currentLuck + " out of " +maxLuck;
    }
}
