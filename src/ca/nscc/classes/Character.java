package ca.nscc.classes;

public abstract class Character {

    //Declare properties of any Character
    private int hitPoint;
    private int defPoint;
    private int agiPoint;
    private int baseAttack;

    // Declare constructor of Character
    public Character(int hitPoint, int defPoint, int agiPoint, int baseAttack) {
        this.hitPoint = hitPoint;
        this.defPoint = defPoint;
        this.agiPoint = agiPoint;
        this.baseAttack = baseAttack;
    }

    //Declare setter and getter methods
    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getDefPoint() {
        return defPoint;
    }

    public void setDefPoint(int defPoint) {
        this.defPoint = defPoint;
    }

    public int getAgiPoint() {
        return agiPoint;
    }

    public void setAgiPoint(int agiPoint) {
        this.agiPoint = agiPoint;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    // Declare an abstract method to be inherited by subclass
    public abstract String getDescription();

    //Declare an abstract method to be inherited by subclass
    public abstract String toString();

}


