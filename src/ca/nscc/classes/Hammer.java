package ca.nscc.classes;

import javax.swing.*;

public class Hammer extends Weapon{

    //Declare properties of any Hammer
    private ImageIcon hammerPic;
    private String feature;

    //Declare constructor of any Hammer
    public Hammer(String weaponType, int attackModifier, int weight, String feature) {
        super(weaponType, attackModifier, weight);
        this.feature = feature;

        hammerPic = new ImageIcon(this.getClass().getResource("/Images/hammer.png"));
    }

    //Inherited and implemented getDescription method
    public String getDescription() {
        return "Hammer is a both-side sharp weapon, it is not too heavy and inflicts a lot of damage";
    }

    //Inherited and implemented toString method
    public String toString() {
        return super.toString()+getWeaponType()+"\tWeight "+getWeight()+"\tAttack Mod: "+getAttackModifier();
    }

    //Declare getter and setter method
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public ImageIcon getHammerPic() { return hammerPic;}

}
