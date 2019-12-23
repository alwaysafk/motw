package motw;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hunter extends TagEditor{
    //Has Get and Set operations
    private String playbook;
    private String fName;
    private String lName;
    private int luck;
    private int harm;
    private boolean unstable;
    private int exp;

    private HashMap<String, Integer> hunterRating;
    ArrayList<Move> moves;
    ArrayList<Improvements> improvements;
    ArrayList<Gear> gear;

    public Hunter(){}
    public Hunter(String playbook, String fName, String lName, int luck, int harm, boolean unstable, int exp){
        this.playbook = playbook;
        this.fName = fName;
        this.lName = lName;
        this.luck = luck;
        this.harm = harm;
        this.unstable = unstable;
        this.exp = exp;
        this.hunterRating = new HashMap<String, Integer>();
        this.moves = new ArrayList<Move>();
        this.improvements = new ArrayList<Improvements>();
        this.gear = new ArrayList<Gear>();
    }

    //Object Changes

    public String getPlaybook() {return playbook;};
    public void setPlaybook(String playbooks) {this.playbook = playbooks;}
    public String getfName(){
        return this.fName;
    }
    public void setfName(String fName){
        this.fName = fName;
    }
    public String getlName(){
        return this.lName;
    }
    public void setlName(String lName){
        this.lName = lName;
    }
    public int getLuck(){
        return this.luck;
    }
    public void setLuck(int luck){
        this.luck = luck;
    }
    public int getHarm(){
        return this.harm;
    }
    public void setHarm(int harm){
        this.harm = harm;
    }
    public boolean getUnstable(){return this.unstable;}
    public void setUnstable(boolean unstable){this.unstable = unstable;}
    public int getExp(){return this.exp;}
    public void setExp(int exp){
        this.exp = exp;
    }
    public ArrayList<Move> getMoves(){return moves;}
    public void setMoves(ArrayList<Move> moves){this.moves = moves;}
    public ArrayList<Improvements> getImprovements(){return improvements;}
    public void setImprovements(ArrayList<Improvements> improvements){this.improvements = improvements;}
    public ArrayList<Gear> getGear(){return gear;}
    public void setGear(ArrayList<Gear> gear){this.gear = gear;}
    public void setHunterRating(HashMap<String, Integer> hunterRating) {this.hunterRating = hunterRating;}
    public HashMap<String, Integer> getHunterRating() {return hunterRating;}

    //Adds a gear, if one already exists it increments the gearCount by 1
    public void addGear(String gearDescription, String gearType, int gearRating, int gearCount, ArrayList<Tags> gearTags){
        for(Gear thisGear: gear){
            if(thisGear.getGearDescription().equals(gearDescription)){
                thisGear.setGearCount(thisGear.getGearCount()+gearCount);
                return;
            }
        }
        Gear newGear = new Gear(gearDescription, gearType,gearRating,gearCount, gearTags);
        gear.add(newGear);
    }
    //removes a gear if only one exists, if more exists it will decrement by 1
    public void removeGear(String gearDescription){
        Iterator<Gear> removeGear = gear.iterator();
        while(removeGear.hasNext()){
            Gear thisGear = removeGear.next();
            if(thisGear.getGearDescription().equals(gearDescription)){
                if(thisGear.getGearCount()>1) {
                    thisGear.setGearCount(thisGear.getGearCount() - 1);
                }else{
                    removeGear.remove();
                }
            }
        }
    }
//Adds improvement if it doesn't exist
    public void addImprovement(boolean advanced,String improvementName,String improvementDescription){
        for(Improvements curImprovement : improvements){
            if(curImprovement.getImprovementName().equals(improvementName)){
                return;
            }
        }
        Improvements newImprovement = new Improvements(advanced, improvementName,improvementDescription);
        improvements.add(newImprovement);
    }
//removes an improvement if it exists;
    public void removeImprovement(String improvementName){
        Iterator<Improvements> removeImprovement = improvements.iterator();
        while(removeImprovement.hasNext()){
            Improvements thisImprovement = removeImprovement.next();
            if(thisImprovement.getImprovementName().equals(improvementName)){
                removeImprovement.remove();
            }
        }
    };
//clear improvements
    //Adds a move is it doesn't already exist
    public void addMove(String moveName, String moveDescription, int moveRating, int moveBonus){
        try{
            if(!moves.isEmpty()) {
                for (Move thisMove : moves) {
                    if (thisMove.getMoveName().equals(moveName)) {
                        System.out.println("Move " + moveName + " Already Exist, move not added.");

                    }
                }
            }
            Move newMove = new Move(moveName, moveDescription, moveRating, moveBonus);
            moves.add(newMove);
        }
        catch(Exception e){
            System.out.println("Error in add move method with following stack trace." + e.fillInStackTrace());
        }

    }
    //Looks up and removes a Move
    public void removeMove(String moveName){
        try{
            if(moves.isEmpty()) {
                System.out.println("Move does not exist.");
                return;
            }
            Iterator<Move> deleteMove = moves.iterator();
            System.out.println(deleteMove.toString());
            while(deleteMove.hasNext()){
                Move thisMove = deleteMove.next();
                if(thisMove.getMoveName().equals(moveName)){
                    deleteMove.remove();
                }
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    };
    public int useMove(String moveName, int moveRating, int moveBonus){
        int returnMove = 0;
        for(Move thisMove : moves) {
            if (thisMove.getMoveName().equals(moveName)) {
                returnMove = thisMove.rollDice(moveRating, moveBonus);
                break;
            }
        }
        return returnMove;
    }

}
