package ca.nscc.classes;

public class Weapon{

    //Declare properties of any Weapon
    private String weaponType;
    private int attackModifier;
    private int weight;

    //Declare constructor of any Weapon
    public Weapon(String weaponType, int attackModifier, int weight) {
        this.weaponType = weaponType;
        this.attackModifier = attackModifier;
        this.weight = weight;
    }

    //Declare getter and setter methods
    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public int getAttackModifier() {
        return attackModifier;
    }

    public void setAttackModifier(int attackModifier) {
        this.attackModifier = attackModifier;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Inherited and implemented getDescription method
    public String getDescription(){
        return "";
    }

    //Inherited and implemented toString method
    public String toString(){
        return "\nWeapon: ";
    }

}
