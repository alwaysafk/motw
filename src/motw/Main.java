package motw;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Hunter myHunter = new Hunter("Mundane", "Hank", "Williams",7,0,false,5);
        System.out.println(myHunter.toString());

        myHunter.addMove("Manipulate Someone", "Manipulate Someone", 3, 0);
        myHunter.addMove("Act Under Pressure", "Act Under Pressure", 1, 0);
        myHunter.addMove("Investigate a Mystery", "Investigate a Mystery", 2, 0);
        myHunter.addMove("Read a Bad Situation", "Read a Bad Situation", 2, 0);
        myHunter.addMove("Kick Some Ass", "Roll to kick some ass", 2, 0);
        myHunter.addMove("Protect Someone", "Protect Someone", 2, 0);
        myHunter.addMove("Use Magic", "Use Magic", -1, 0);
        myHunter.addMove("Use Magic", "Use Magic", -1, 0);

        myHunter.removeMove("Use Magic");

        myHunter.addImprovement(false, "Improvement 1", "Get +1 Charm, max +3");
        myHunter.addImprovement(false, "Improvement 2", "Get +1 Cool, max +3");
        myHunter.addImprovement(false, "Improvement 3", "Get +1 Sharp, max +3");
        myHunter.addImprovement(false, "Improvement 4", "Get +1 Tough, max +3");
        myHunter.addImprovement(false, "Improvement 5", "Take another Mundane Move");

        ArrayList<Tags> gearTags = new ArrayList<Tags>();
        String thisTagsType = "Weapons";
        ArrayList<String> thisTagsDescribers = new ArrayList<String>();
        thisTagsDescribers.add("2 harm");
        thisTagsDescribers.add("hand");
        thisTagsDescribers.add("innocuous");
        thisTagsDescribers.add("messy");
        Tags thisTag = new Tags();

        thisTag.setTagType(thisTagsType);
        thisTag.setTagList(thisTagsDescribers);
        gearTags.add(thisTag);

        myHunter.addGear("Golf Club", "Weapon", 2, 1, gearTags
        );
        myHunter.addGear("Golf Club2", "Weapon", 2, 1, gearTags
        );
        myHunter.removeGear("Golf Club"
        );
        System.out.println(myHunter.getfName() + "  " +
                myHunter.getlName() + "  " +
                myHunter.getLuck() + "  " +
                myHunter.getHarm() + "  " +
                myHunter.getUnstable() + "  " +
                myHunter.getExp() + " " +
                myHunter.getMoves().toString() + " " +
               // myHunter.getImprovements().toString() + " " +
                myHunter.getGear().toString() + " "
             //   "\n Hunter : " + myHunter.getfName() + " uses Manipulate Someone and gets as " + myHunter.useMove("Manipulate Someone", 3, 0)
        );
        //ArrayList useMove = new ArrayList(myHunter.getMoves());
        //System.out.println("useMove Test" + useMove);

        }
}
//String fName, String lName, int luck, int harm, boolean unstable, int exp
/*
*TODO Ratings Interfaces for Playbooks
* */