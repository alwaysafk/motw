package motw;

import java.util.Set;

public class Threat extends Player{
    private String threatType;
    private String motivation;
    private Set<String> powers;
    private Set<String> weaknesses;

    public String getThreatType() { return threatType; }
    public void setThreatType(String threatType) { this.threatType = threatType; }
    public String getMotivation() { return motivation; }
    public void setMotivation(String motivation) { this.motivation = motivation; }
    public Set<String> getPowers() { return powers; }
    public void setPowers(Set<String> powers) { this.powers = powers; }
    public Set<String> getWeaknesses() { return weaknesses; }
    public void setWeaknesses(Set<String> weaknesses) { this.weaknesses = weaknesses; }

    public void addPower(String power){
        powers.add(power);
    }
    public void removePower(String power){
        if(powers.contains(power))
            powers.remove(power);
    }

}
