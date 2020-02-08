package motw;

public class Health {
    private int maxHealth;
    private int currentHealth;
    private boolean unstable;
    private int unstableThreshold;

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setUnstableThreshold(int unstableThreshold) {
        this.unstableThreshold = unstableThreshold;
    }

    public void setUnstable(boolean unstable) {
        this.unstable = unstable;
    }

    public boolean isUnstable() {
        return unstable;
    }

    public int getUnstableThreshold() {
        return unstableThreshold;
    }

    public int incrementHealth(){
        if(currentHealth<maxHealth)
            currentHealth++;
        unstable = false;
        return currentHealth;
    }

    public int decrementHealth(){
        if(currentHealth > 0)
            currentHealth--;
        if(currentHealth <= unstableThreshold)
            unstable = true;
        return currentHealth;
    }
    @Override
    public String toString(){
        return "Player is " + currentHealth + " out of " + maxHealth + " and unstable is " + unstable;
    }
}
