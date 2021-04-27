package ca.nscc.gui;

import ca.nscc.classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoosePanel extends JPanel {

    //Some controls need to be declared at the class level, if referenced in multiple places
    private JButton startBattleBtn;
    private JButton rerollBtn;
    private JTextField nameText;
    private JTextField hitPointText;
    private JTextField defensePointText;
    private JTextField agilityPointText;
    private JTextField baseAttackPointText;
    private JTextArea charDescriptionText;
    private JTextArea weaponDescriptionText;
    private JTextField attackModifierPointText;
    private JTextField weightText;
    private JLabel dimensionsLabel;
    private JLabel imageLabel;
    private JLabel imageWeaponLabel;
    private JLabel charStatLabel;
    private JLabel weaponStatLabel;
    private JRadioButton rdoWarrior;
    private JRadioButton rdoWizard;
    private JRadioButton rdoCleric;
    private JRadioButton rdoDagger;
    private JRadioButton rdoSword;
    private JRadioButton rdoHammer;
    private Warrior warrior = null;
    private Wizard wizard = null;
    private Cleric cleric = null;
    private Dagger dagger = null;
    private Sword sword = null;
    private Hammer hammer = null;
    private ButtonGroup weaponTypeRadios;
    private ButtonGroup charTypeRadios;
    private JLabel selectClassLabel;

    Font regularFont = new Font("Calibri", Font.PLAIN, 20);


    public ChoosePanel(){

        //Set font object
        Font myFont= new Font("Matura MT Script Capitals", Font.BOLD, 24);
        Font bigFont= new Font("Matura MT Script Capitals", Font.BOLD, 32);
        Font smallFont= new Font("Calibri", Font.PLAIN, 16);

        //Set panel properties
        setLayout(null);
        setVisible(true);
        setBackground(Color.CYAN);

        //Create GUI objects
        //Radio buttons for Player
        addShapeRadios();
        //Radio buttons for Weapon
        addWeaponRadios();

        //Label control dnd name
        JLabel pageLabel= new JLabel("Character Generator");
        pageLabel.setFont(bigFont);
        pageLabel.setBounds(140, 20, 340, 50);

        //Label control to display enter name
        JLabel nameLabel = new JLabel("Enter Name");
        nameLabel.setFont(myFont);
        nameLabel.setBounds(50, 70, 200, 50);

        //TextField to get entered name
        nameText = new JTextField();
        nameText.setFont(regularFont);
        nameText.setBounds(210, 80, 200, 40);

        //TextField to display player's description
        charDescriptionText = new JTextArea();
        charDescriptionText.setFont(regularFont);
        charDescriptionText.setBounds(55, 330, 360, 80);
        charDescriptionText.setEnabled(false);
        charDescriptionText.setLineWrap(true);
        charDescriptionText.setWrapStyleWord(true);

        //Label to display character type
        JLabel charLabel = new JLabel("Character Type");
        charLabel.setFont(myFont);
        charLabel.setBounds(50, 120, 200, 50);

        //Label control to display Character Stats
        JLabel charStatLabel = new JLabel("Character Stats");
        charStatLabel.setFont(myFont);
        charStatLabel.setBounds(450, 120, 200, 50);

        //Label to display player's image
        imageLabel= new JLabel();
        imageLabel.setBounds(180, 170, 150, 150);

        //Label control to display weapon's image
        imageWeaponLabel = new JLabel();
        imageWeaponLabel.setBounds(200, 455, 150, 150);

        //Labels to show dimensions of each shape in a single field
        dimensionsLabel = new JLabel();
        dimensionsLabel.setFont(myFont);
        dimensionsLabel.setBounds(130, 70, 300, 300);

        //Button control for Reroll
        rerollBtn = new JButton("Reroll");
        rerollBtn.setFont(myFont);
        rerollBtn.setBounds(475, 350, 130, 50);

        //Button control for Start Battle
        startBattleBtn = new JButton("Start Battle");
        startBattleBtn.setFont(myFont);
        startBattleBtn.setBounds(460, 640, 190, 50);

        //Label control to display Select a class
        selectClassLabel = new JLabel("Select a Class");
        selectClassLabel.setFont(smallFont);
        selectClassLabel.setBounds(210, 180, 150, 150);

        //Label control to display Select a Weapon
        JLabel selectWeaponLabel = new JLabel("Select a Weapon");
        selectWeaponLabel.setFont(smallFont);
        selectWeaponLabel.setBounds(210, 460, 140, 150);

        //Label control for Hit Points
        JLabel hitPointLabel = new JLabel("Hit Points");
        hitPointLabel.setFont(regularFont);
        hitPointLabel.setBounds(470, 160, 100, 50);

        //TextField for Hit Points
        hitPointText = new JTextField();
        hitPointText.setFont(regularFont);
        hitPointText.setBounds(620, 165, 50, 30);

        //Label control for Defense
        JLabel defensePointLabel = new JLabel("Defense");
        defensePointLabel.setFont(regularFont);
        defensePointLabel.setBounds(470, 195, 100, 50);

        //TextField to display Defense
        defensePointText = new JTextField();
        defensePointText.setFont(regularFont);
        defensePointText.setBounds(620, 205, 50, 30);

        //Label control for Agility
        JLabel agilityPointLabel = new JLabel("Agility");
        agilityPointLabel.setFont(regularFont);
        agilityPointLabel.setBounds(470, 235, 100, 50);

        //TextField control to display Agility
        agilityPointText = new JTextField();
        agilityPointText.setFont(regularFont);
        agilityPointText.setBounds(620, 245, 50, 30);

        //Label control for Base Attack
        JLabel baseAttackPointLabel = new JLabel("Base Attack");
        baseAttackPointLabel.setFont(regularFont);
        baseAttackPointLabel.setBounds(470, 275, 100, 50);

        //TextField control to display Base Attack
        baseAttackPointText = new JTextField();
        baseAttackPointText.setFont(regularFont);
        baseAttackPointText.setBounds(620, 285, 50, 30);

        //Label control for Select a Weapon
        JLabel weaponLabel = new JLabel("Select Your Weapon");
        weaponLabel.setFont(myFont);
        weaponLabel.setBounds(50, 410, 270, 50);

        //Label control to display Weapon Stats
        JLabel weaponStatLabel = new JLabel("Weapon Stats");
        weaponStatLabel.setFont(myFont);
        weaponStatLabel.setBounds(450, 420, 200, 50);

        //Label control for Attack Modifier
        JLabel attackModifierPointLabel = new JLabel("Attack Modifier");
        attackModifierPointLabel.setFont(regularFont);
        attackModifierPointLabel.setBounds(470, 490, 140, 50);

        //TextField control to display Attack Modifier
        attackModifierPointText = new JTextField();
        attackModifierPointText.setFont(regularFont);
        attackModifierPointText.setBounds(620, 500, 50, 30);

        //Label control for Weight
        JLabel weightLabel = new JLabel("Weight");
        weightLabel.setFont(regularFont);
        weightLabel.setBounds(470, 535, 100, 50);

        //TextField to display Weight
        weightText = new JTextField();
        weightText.setFont(regularFont);
        weightText.setBounds(620, 535, 50, 30);

        //TextArea to display weapon's description
        weaponDescriptionText = new JTextArea();
        weaponDescriptionText.setFont(regularFont);
        weaponDescriptionText.setBounds(50, 615, 360, 80);
        weaponDescriptionText.setEnabled(false);
        weaponDescriptionText.setLineWrap(true);
        weaponDescriptionText.setWrapStyleWord(true);


        //Add all controls to Panel
        add(rdoWarrior);
        add(rdoWizard);
        add(rdoCleric);
        add(rdoDagger);
        add(rdoSword);
        add(rdoHammer);
        add(dimensionsLabel);
        add(pageLabel);
        add(nameLabel);
        add(charLabel);
        add(nameText);
        add(imageLabel);
        add(rerollBtn);
        add(startBattleBtn);
        add(charStatLabel);
        add(charDescriptionText);
        add(hitPointLabel);
        add(hitPointText);
        add(defensePointLabel);
        add(defensePointText);
        add(agilityPointLabel);
        add(agilityPointText);
        add(baseAttackPointLabel);
        add(baseAttackPointText);
        add(weaponLabel);
        add(weaponStatLabel);
        add(selectClassLabel);
        add(selectWeaponLabel);
        add(attackModifierPointLabel);
        add(attackModifierPointText);
        add(weightLabel);
        add(weightText);
        add(imageWeaponLabel);
        add(weaponDescriptionText);

    }

    //Declares method to display palyer's radio buttons and stats
    private void addShapeRadios() {
        rdoWarrior = new JRadioButton("Warrior");
        rdoWarrior.setBackground(Color.CYAN);
        rdoWarrior.setFont(regularFont);
        //If warrior clicked, display warrior stats
        rdoWarrior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                warrior = MainFrame.getTheWarrior();
                swapHitPoint(warrior.getHitPoint());
                swapDefensePoint(warrior.getDefPoint());
                swapAgilityPoint(warrior.getAgiPoint());
                swapBaseAttackPoint(warrior.getBaseAttack());
                swapGetDescription(warrior.getDescription());
                swapImages(warrior.getWarriorPic());
                createShape();
            }
        });

        rdoWizard = new JRadioButton("Wizard");
        rdoWizard.setBackground(Color.CYAN);
        rdoWizard.setFont(regularFont);
        //If wizard selected, display wizard stats
        rdoWizard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                wizard = MainFrame.getTheWizard();
                swapHitPoint(wizard.getHitPoint());
                swapDefensePoint(wizard.getDefPoint());
                swapAgilityPoint(wizard.getAgiPoint());
                swapBaseAttackPoint(wizard.getBaseAttack());
                swapGetDescription(wizard.getDescription());
                swapImages(wizard.getWizardPic());
                createShape();
            }
        });

        rdoCleric = new JRadioButton("Cleric");
        rdoCleric.setBackground(Color.CYAN);
        rdoCleric.setFont(regularFont);
        //If Cleric clicked, display Cleric stats
        rdoCleric.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cleric = MainFrame.getTheCleric();
                swapHitPoint(cleric.getHitPoint());
                swapDefensePoint(cleric.getDefPoint());
                swapAgilityPoint(cleric.getAgiPoint());
                swapBaseAttackPoint(cleric.getBaseAttack());
                swapGetDescription(cleric.getDescription());
                swapImages(cleric.getClericPic());
                createShape();
            }
        });

        //Set locations of player buttons
        rdoWarrior.setBounds(50, 170, 130, 60);
        rdoWizard.setBounds(50, 220, 130, 60);
        rdoCleric.setBounds(50, 270, 130, 60);

        //ButtonGroup to group the radio buttons
        charTypeRadios = new ButtonGroup();
        charTypeRadios.add(rdoWarrior);
        charTypeRadios.add(rdoWizard);
        charTypeRadios.add(rdoCleric);
    }

    //Declare addWeaponRadios method to display Weapon radios and stats
    private void addWeaponRadios() {
        rdoDagger = new JRadioButton("Dagger");
        rdoDagger.setBackground(Color.CYAN);
        rdoDagger.setFont(regularFont);
        //If Dagger is selected, display Dagger stats
        rdoDagger.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dagger = MainFrame.getTheDagger();
                swapAttackModifier(dagger.getAttackModifier());
                swapWeight(dagger.getWeight());
                swapGetWeaponDescription(dagger.getDescription());
                swapWeaponImages(dagger.getDaggerPic());
                createWeaponShape();
            }
        });

        rdoSword = new JRadioButton("Sword");
        rdoSword.setBackground(Color.CYAN);
        rdoSword.setFont(regularFont);
        //If Sword is selected, display Sword stats
        rdoSword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                sword = MainFrame.getTheSword();
                swapAttackModifier(sword.getAttackModifier());
                swapWeight(sword.getWeight());
                swapGetWeaponDescription(sword.getDescription());
                swapWeaponImages(sword.getSwordPic());
                createWeaponShape();
            }
        });

        rdoHammer = new JRadioButton("Hammer");
        rdoHammer.setBackground(Color.CYAN);
        rdoHammer.setFont(regularFont);
        //If Hammer is selected, display Hammer stats
        rdoHammer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                hammer = MainFrame.getTheHammer();
                swapAttackModifier(hammer.getAttackModifier());
                swapWeight(hammer.getWeight());
                swapGetWeaponDescription(hammer.getDescription());
                swapWeaponImages(hammer.getHammerPic());
                createWeaponShape();
            }
        });

        //Set radio buttons for Weapon
        rdoDagger.setBounds(50, 460, 130, 60);
        rdoSword.setBounds(50, 500, 130, 60);
        rdoHammer.setBounds(50, 540, 130, 60);

        //ButtonGroup to group the radio buttons
        weaponTypeRadios = new ButtonGroup();
        weaponTypeRadios.add(rdoDagger);
        weaponTypeRadios.add(rdoSword);
        weaponTypeRadios.add(rdoHammer);
    }

    //Declare a method to get character name from user and set the name to the player
    public void createShape() {

        String charName = nameText.getText();
        if (rdoWarrior.isSelected()) {
            warrior.setName(charName);
        }
        else if (rdoWizard.isSelected()) {
            wizard.setName(charName);
        }
        else if (rdoCleric.isSelected()) {
            cleric.setName(charName);
        }
    }

    //Declare a method to set weapon type if selected
    public void createWeaponShape() {

        if (rdoDagger.isSelected()) {
            dagger.setWeaponType("Dagger");
        }
        else if (rdoSword.isSelected()) {
            sword.setWeaponType("Sword");
        }
        else if (rdoHammer.isSelected()) {
            hammer.setWeaponType("Hammer");
        }
    }



    //Declare a method to swap player's image based on selection
    public void swapImages(ImageIcon image){imageLabel.setVisible(true);imageLabel.setIcon(image); }

    //Declare a method to swap weapon image based on selection
    public void swapWeaponImages(ImageIcon image){imageWeaponLabel.setVisible(true);
        imageWeaponLabel.setIcon(image);}

    //Declare methods to set player's stats
    public void swapHitPoint(int hitPoint){hitPointText.setText(String.valueOf(hitPoint));}

    public void swapDefensePoint(int defensePoint){defensePointText.setText(String.valueOf(defensePoint));}

    public void swapAgilityPoint(int agilityPoint){agilityPointText.setText(String.valueOf(agilityPoint));}

    public void swapBaseAttackPoint(int baseAttackPoint){baseAttackPointText.setText(String.valueOf(baseAttackPoint));}

    public void swapGetDescription(String description){charDescriptionText.setText(description);}

    // Methods to return buttons to navigate pages
    public JButton getStartBattleBtn() {
        return startBattleBtn;
    }

    public JButton getRerollBtn() { return rerollBtn; }

    //Declare methods to set weapon's stats
    public void swapAttackModifier(int attackModifier){
        if(attackModifier >= 0)
            attackModifierPointText.setText("+"+String.valueOf(attackModifier));
        else
            attackModifierPointText.setText("-"+String.valueOf(attackModifier));
    }

    public void swapWeight(int weight){weightText.setText(String.valueOf(weight));}

    private void swapGetWeaponDescription(String des){weaponDescriptionText.setText(des);}

    public void getAddShapeRadios() {addShapeRadios();}

    public void getAddWeaponRadios() { addWeaponRadios();}

    public void getCreateShape(){ createShape();}
    public void getCreateWeaponShape() {createWeaponShape();}

    //Methods to clear radio button selection
    public void clearWeaponTypeRadios() {weaponTypeRadios.clearSelection();
       weaponDescriptionText.setText("");}

    public void clearCharTypeRadios() {charTypeRadios.clearSelection(); nameText.setText("");
        charDescriptionText.setText(""); }

    //Methods for deselecting image display
    public void setSwapImages(){imageLabel.setVisible(false); imageWeaponLabel.setVisible(false);
    }


}
