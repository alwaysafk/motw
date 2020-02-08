package motw;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Hunter myHunter = new Hunter();
        System.out.println(myHunter.toString());

        myHunter.setName("Hank Williams");
        myHunter.setPlaybook("Mundane");

        Luck myHunterLuck = new Luck();
            myHunterLuck.setCurrentLuck(7);
            myHunterLuck.setMaxLuck(7);
            myHunter.setLuck(myHunterLuck);

        Health myHunterHealth = new Health();
            myHunterHealth.setMaxHealth(7);
            myHunterHealth.setCurrentHealth(7);
            myHunterHealth.setUnstableThreshold(4);
            myHunter.setHealth(myHunterHealth);

        Level myHunterLevel = new Level();
            myHunterLevel.setCurrentExp(0);
            myHunterLevel.setMaxExp(5);
            myHunterLevel.setLevelCount(1);
            myHunter.setLevel(myHunterLevel);

        myHunter.addRating("CHARM",3);
        myHunter.addRating("COOL",1);
        myHunter.addRating("SHARP",1);
        myHunter.addRating("TOUGH",2);
        myHunter.addRating("WIERD",-1);
        Set<String> testGearTag = new HashSet<>();
        testGearTag.add("2-harm hand");
        testGearTag.add("innocuous");
        testGearTag.add("messy");
        myHunter.addGear("Golf club", testGearTag);
        myHunter.addMove("Let’s Get Out Of Here!", "If you can protect someone " +
                "by telling them what to do, or by leading them out," +
                "roll +Charm instead of +Tough");

        System.out.println(myHunter.getName() + "\n\t  " +
                myHunter.getPlaybook() + "\n\t  " +
                myHunter.getLuck().toString()+ "\n\t  " +
                myHunter.getHealth().toString()+ "\n\t  " +
                myHunter.getLevel().toString() + "\n\t " +
                myHunter.getGear().toString() + "\n "
        );
        }
}
//String fName, String lName, int luck, int harm, boolean unstable, int exp
/*
*TODO Ratings Interfaces for Playbooks
* */