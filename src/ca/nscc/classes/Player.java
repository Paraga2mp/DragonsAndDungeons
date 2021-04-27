package ca.nscc.classes;

import javax.swing.*;

public class Player extends Character {

    // Declare properties of any Player
    private String name;
    private String charType;
    private Weapon myWeapon;

    //Declare constructor of any Player
    public Player(int hitPoint, int defPoint, int agiPoint, int baseAttack, String name, String charType) {
        super(hitPoint, defPoint, agiPoint, baseAttack);
        this.name = name;
        this.charType = charType;
        this.myWeapon = myWeapon;
    }

    //Declare setter and getter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharType() {
        return charType;
    }

    public void setCharType(String charType) {
        this.charType = charType;
    }

    public Weapon getMyWeapon() {
        return myWeapon;
    }

    public void setMyWeapon(Weapon myWeapon) {
        this.myWeapon = myWeapon;
    }

    //Inherited and implemented getDescription method
    public String getDescription(){
        return "";
    };

    //Inherited and implemented toString method
    public String toString(){
        return "Player: "+this.getName()+"\n-----------------";
    }

}
