package ca.nscc.classes;

import javax.swing.*;

public class Dagger extends Weapon {

    //Declare properties of any Dagger
    private ImageIcon daggerPic;
    private int damagePoint;

    //Declare constructor of any Dagger
    public Dagger(String weaponType, int attackModifier, int weight, int damagePoint) {
        super(weaponType, attackModifier, weight);
        this.damagePoint = damagePoint;

        daggerPic = new ImageIcon(this.getClass().getResource("/Images/dagger.png"));

    }

    //Inherited and implemented getDescription method
    public String getDescription() {
        return "Dagger is a good all-round weapon, it is not too heavy and inflicts a lot of damage";
    }

    //Inherited and implemented toString method
    public String toString() {
        return super.toString()+ getWeaponType()+"\t Weight "+getWeight()+"\tAttack Mod: "+getAttackModifier();
    }

    public ImageIcon getDaggerPic() { return daggerPic;}

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }
}
