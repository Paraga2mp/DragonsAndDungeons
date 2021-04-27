package ca.nscc.classes;

import javax.swing.*;

public class Warrior extends Player {

    // Declare property of Warrior
    private ImageIcon warriorPic;

    // Declare constructor of Warrior
    public Warrior(int hitPoint, int defPoint, int agiPoint, int baseAttack, String name, String charType) {
        super(hitPoint, defPoint, agiPoint, baseAttack,  name, charType);

        warriorPic = new ImageIcon(this.getClass().getResource("/Images/warrior.png"));

    }


    @Override
    public String getCharType() {
        return super.getCharType();
    }

    @Override
    public void setCharType(String charType) {
        super.setCharType(charType);
    }

    @Override
    public Weapon getMyWeapon() {
        return super.getMyWeapon();
    }

    @Override
    public void setMyWeapon(Weapon myWeapon) {
        super.setMyWeapon(myWeapon);
    }

    //Inherited and implemented getDescription method
    public String getDescription() {
        return "Fighters are often human. Have higher HP and defence but low agility";
    }

    //Inherited and implemented toString method
    public String toString(){
        return super.toString()+"\nClass: "+getCharType()+"\nHP: "+getHitPoint()+"\tDefense: "+getDefPoint()+
                "\tAgility: "+getAgiPoint()+"\tBase Attack: "+getBaseAttack();
    }

    public ImageIcon getWarriorPic() { return warriorPic;}

    public void setWarriorPic(ImageIcon warriorPic) {
        this.warriorPic = warriorPic;
    }


}
