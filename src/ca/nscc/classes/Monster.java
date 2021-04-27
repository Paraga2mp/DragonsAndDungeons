package ca.nscc.classes;


import javax.swing.*;

public class Monster extends Character {

    private ImageIcon monsterPic;

    //Declare constructor of any Monster
    public Monster(int hitPoint, int defPoint, int agiPoint, int baseAttack) {
        super(hitPoint, defPoint, agiPoint, baseAttack);

         monsterPic = new ImageIcon(this.getClass().getResource("/Images/monster.png"));
    }

    //Inherited and implemented toString method
    public String toString(){
        return "\n\nMonster: Gazer" + "\n------------------------\n" +
                "HP: "+getHitPoint()+ "\t" + "Defense: "+getDefPoint() + "\t" +
                "Agility: "+getAgiPoint() + "\t" + "Attack Mod:" +getBaseAttack();
    }

    //Inherited and implemented getDescription method
    public String getDescription(){
        return " ";
    }

    public ImageIcon getMonsterPic() { return monsterPic;}

}
