package ca.nscc.classes;

import javax.swing.*;

public class Sword extends Weapon {

    //Declare properties of any Sword
    private ImageIcon swordPic;
    private boolean isSharp;

    //Declare constructor of any Sword
    public Sword(String weaponType, int attackModifier, int weight, boolean isSharp) {
        super(weaponType, attackModifier, weight);
        this.isSharp = isSharp;

        swordPic = new ImageIcon(this.getClass().getResource("/Images/sword.png"));
    }

    public boolean isSharp() {
        return isSharp;
    }

    public void setSharp(boolean sharp) {
        isSharp = sharp;
    }

    //Inherited and implemented getDescription method
    public String getDescription() {
        return "Sword is a sharp weapon, it is not too heavy and inflicts a lot of damage";
    }

    public ImageIcon getSwordPic() { return swordPic;}

    //Inherited and implemented toString method
    public String toString() {
        return super.toString()+getWeaponType()+"\t Weight "+getWeight()+"\tAttack Mod: "+getAttackModifier();
    }
}
