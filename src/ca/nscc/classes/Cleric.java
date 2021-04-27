package ca.nscc.classes;

import javax.swing.*;

public class Cleric extends Player {

    private ImageIcon clericPic;

    //Declare constructor of any Cleric
    public Cleric(int hitPoint, int defPoint, int agiPoint, int baseAttack, String name, String charType) {
        super(hitPoint, defPoint, agiPoint, baseAttack, name, charType);

        clericPic = new ImageIcon(this.getClass().getResource("/Images/cleric.png"));

    }

    //Inherited and implemented getDescription method
    public String getDescription() {
        return "Fighters are often human. Have higher agility and defence but low base attack.";
    }

    //Inherited and implemented toString method
    public String toString() {
        return super.toString()+ "\nClass: "+getCharType()+"\nHP: "+getHitPoint()+"\tDefense: "+getDefPoint()+
                "\tAgility: "+getAgiPoint()+"\tBase Attack: "+getBaseAttack();
    }

    public ImageIcon getClericPic() { return clericPic;}

    public void setClericPic(ImageIcon clericPic) {
        this.clericPic = clericPic;
    }


}
