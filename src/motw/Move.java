package motw;

import java.util.Random;

public class Move {
    private String moveName;
    private String moveDescription;
    private int moveRating;
    private int moveBonus;

    public Move(){}
    public Move(String moveName, String moveDescription, int moveRating, int moveBonus){
        this.moveName = moveName;
        this.moveDescription = moveDescription;
        this.moveRating = moveRating;
        this.moveBonus = moveBonus;
    }
    public int rollDice(int moveRating, int moveBonus){
        Random r = new Random();
        return r.nextInt(5) + r.nextInt(5) + moveRating + moveBonus + 2;
    }

    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    public String getMoveName() {
        return moveName;
    }

    public void setMoveDescription(String moveDescription) {
        this.moveDescription = moveDescription;
    }

    public String getMoveDescription() {
        return moveDescription;
    }

    public void setMoveRating(int moveRating) {
        this.moveRating = moveRating;
    }

    public int getMoveRating() {
        return moveRating;
    }

    public void setMoveBonus(int moveBonus) {
        this.moveBonus = moveBonus;
    }

    public int getMoveBonus() {
        return moveBonus;
    }

    @Override
    public String toString() {return "\nmoveName = " + moveName +
                                     " moveDescription " + moveDescription +
                                     " moveRating " + moveRating +
                                     " moveBonus " +  moveBonus;}

}
