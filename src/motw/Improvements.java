package motw;

public class Improvements {
    private boolean advanced;
    private String improvementName;
    private String improvementDescription;
    private int improvementCeiling;
    private int improvementIncrease;


    public void setAdvanced(boolean advanced){
        this.advanced = advanced;
    };
    public boolean getAdvanced(){
        return advanced;
    };
    public void setImprovementName(String improvementName){
        this.improvementName = improvementName;
    };
    public String getImprovementName(){
        return improvementName;
    };
    public void setImprovementDescription(String improvementDescription){
        this.improvementDescription = improvementDescription;
    };
    public String getImprovementDescription(){
        return improvementDescription;
    };
    @Override
    public String toString(){
        return "\nadvanced = " + advanced + " improvementName = " + improvementName + " improvementDescription = " + improvementDescription;

    }
}
