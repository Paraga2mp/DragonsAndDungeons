package ca.nscc.classes;

import javax.swing.*;

public class Wizard extends Player {

    private ImageIcon wizardPic;

    //Declare constructor of any Wizard
    public Wizard(int hitPoint, int defPoint, int agiPoint, int baseAttack, String name, String charType) {
        super(hitPoint, defPoint, agiPoint, baseAttack, name, charType);

        wizardPic = new ImageIcon(this.getClass().getResource("/Images/wizard.png"));

    }

    //Inherited and implemented toString method
    public String toString() {
        return super.toString()+"\nClass: "+getCharType()+"\nHP: "+getHitPoint()+"\tDefense: "+getDefPoint()+
                "\tAgility: "+getAgiPoint()+"\tBase Attack: "+getBaseAttack();
    }

    //Inherited and implemented getDescription method
    public String getDescription() {
        return "Fighters are often special character. Have higher hit point and defence but low agility.";
    }

    public ImageIcon getWizardPic() { return wizardPic;}

    public void setWizardPic(ImageIcon wizardPic) {
        this.wizardPic = wizardPic;
    }


}
