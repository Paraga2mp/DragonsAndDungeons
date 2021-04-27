package ca.nscc.gui;

import ca.nscc.classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    //Some controls need to be declared at the class level
    private static Warrior theWarrior;
    private static Wizard theWizard;
    private static Cleric theCleric;
    private static Monster theMonster;
    private static Dagger theDagger;
    private static Sword theSword;
    private static Hammer theHammer;

    //Set Font object
    Font myFont= new Font("Matura MT Script Capitals", Font.BOLD, 24);

    public MainFrame(){

    //Create default instances of player objects
    theWarrior = new Warrior(60, 64, 25, 67,"",   "Warrior");
    theWizard = new Wizard(65, 73, 23, 32,  "", "Wizard");
    theCleric = new Cleric(45,60,55,25, "", "Cleric");
    theMonster = new Monster(50, 40, 34, 45);

    //Create default instances of Weapon objects
    theDagger = new Dagger("", 12, 5, 55);
    theSword = new Sword("", 5, 10, true);
    theHammer = new Hammer("", 4, 12, "");

    //Set Frame properties
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 750, 750);
    setTitle("DND Game");
    setLayout(new CardLayout());

    //Add Panel "screens"
    FirstPanel firstScreen = new FirstPanel();
    ChoosePanel chooseScreen = new ChoosePanel();
    DisplayPanel displayScreen = new DisplayPanel();

    add(firstScreen);
    add(chooseScreen);
    add(displayScreen);

    //Set nav button for Build a Character
    JButton displayCharBtn = firstScreen.getBuildCharacterBtn();
    displayCharBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            firstScreen.setVisible(false);
            chooseScreen.setVisible(true);
        }
    });

    //Set nav button for Reroll
    JButton reRollBtn = chooseScreen.getRerollBtn();
        reRollBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            chooseScreen.setVisible(false);
            chooseScreen.swapAgilityPoint(0);
            chooseScreen.swapAttackModifier(0);
            chooseScreen.swapBaseAttackPoint(0);
            chooseScreen.swapDefensePoint(0);
            chooseScreen.swapHitPoint(0);
            chooseScreen.swapWeight(0);

            chooseScreen.clearCharTypeRadios();
            chooseScreen.clearWeaponTypeRadios();
            chooseScreen.setSwapImages();

            displayScreen.displayChoice();
            displayScreen.displayWeaponChoice();

        }
    });



    //Set nav button for Start the Battle
    JButton startBattleBtn = chooseScreen.getStartBattleBtn();
        startBattleBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            chooseScreen.setVisible(false);
            chooseScreen.createShape();
            chooseScreen.createWeaponShape();
            displayScreen.displayChoice();
            displayScreen.displayWeaponChoice();
            displayScreen.setVisible(true);
        }
    });

    //Set nav button for Build Play again
    JButton playAgainBtn = displayScreen.getPlayAgainBtn();
        playAgainBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            displayScreen.setVisible(false);
            chooseScreen.swapAgilityPoint(0);
            chooseScreen.swapAttackModifier(0);
            chooseScreen.swapBaseAttackPoint(0);
            chooseScreen.swapDefensePoint(0);
            chooseScreen.swapHitPoint(0);
            chooseScreen.swapWeight(0);
            chooseScreen.clearCharTypeRadios();
            chooseScreen.clearWeaponTypeRadios();
            chooseScreen.setSwapImages();
            displayScreen.displayChoice();
            displayScreen.displayWeaponChoice();

            firstScreen.setVisible(true);
        }
    });

    }

    //Declare getter methods for player amd weapon objects
    public static Warrior getTheWarrior(){ return theWarrior;}

    public static Wizard getTheWizard(){return theWizard; }

    public static Cleric getTheCleric(){return theCleric;}

    public static Monster getTheMonster(){return theMonster;}

    public static Dagger getTheDagger(){return theDagger;}

    public static Sword getTheSword(){return theSword; }

    public static Hammer getTheHammer(){return theHammer; }

}
