package ca.nscc.gui;

import ca.nscc.classes.*;

import javax.swing.*;
import java.awt.*;



public class DisplayPanel extends JPanel {

    //Some controls need to be declared at the class level, if referenced in multiple places
    private Warrior warrior = null;
    private Wizard wizard = null;
    private Cleric cleric = null;
    private Monster monster = null;
    private Dagger dagger = null;
    private Sword sword = null;
    private Hammer hammer = null;
    private JLabel playerImageLabel;
    private JLabel monsterImageLabel;
    private JButton playAgainBtn;
    private JLabel playerLabel;
    private JLabel monsterLabel;
    private JTextArea displayText;
    String playerType = "";
    String text = "";

    //Set Font object
    Font regularFont = new Font("Calibri", Font.BOLD, 22);

        public DisplayPanel(){

            //Set Font and monster object
            Font myFont= new Font("Matura MT Script Capitals", Font.BOLD, 38);
            monster = MainFrame.getTheMonster();

            //Set Panel properties
            setLayout(null);
            setBackground(Color.cyan);

            //Label control to display text
            JLabel pageLabel= new JLabel("Battle To The Death!");
            pageLabel.setFont(myFont);
            pageLabel.setBounds(80, 20, 480, 60);

            //Label control to display player type
            playerLabel= new JLabel();
            playerLabel.setFont(regularFont);
            playerLabel.setBounds(70, 80, 300, 60);

            //Label control to display monster type
            monsterLabel= new JLabel("Monster: Gazer");
            monsterLabel.setFont(regularFont);
            monsterLabel.setBounds(400, 80, 300, 60);

            //Label control for player image
            playerImageLabel= new JLabel();
            playerImageLabel.setBounds(50, 130, 150, 150);

            //Label control to display monster image
            monsterImageLabel= new JLabel();
            monsterImageLabel.setIcon(monster.getMonsterPic());
            monsterImageLabel.setBounds(400, 130, 150, 150);

            //TextArea control for displaying game summary
            displayText = new JTextArea();
            displayText.setFont(regularFont);
            displayText.setBounds(80, 300, 620, 300);
            displayText.setEnabled(false);
            displayText.setLineWrap(true);
            displayText.setWrapStyleWord(true);

            //Button control for Play Again
            playAgainBtn = new JButton("Play Again");
            playAgainBtn.setFont(regularFont);
            playAgainBtn.setBounds(240, 620, 180, 50);

            //Add all controls Panel
            add(pageLabel);
            add(playerLabel);
            add(monsterLabel);
            add(playerImageLabel);
            add(monsterImageLabel);
            add(displayText);
            add(playAgainBtn);
        }

    //Declare a method to display player's image
    public void displayChoice() {
        warrior = MainFrame.getTheWarrior();
        wizard = MainFrame.getTheWizard();
        cleric = MainFrame.getTheCleric();
        String playerText = "";
        playerImageLabel.setVisible(true);
        monsterImageLabel.setVisible(true);
        monsterImageLabel.setIcon(monster.getMonsterPic());

        if(warrior.getName() != null && warrior.getName() != "") {
            playerText = warrior.toString();
            playerType = warrior.getCharType();
            swapImages(warrior.getWarriorPic());
        }
        else if(wizard.getName() != null && wizard.getName() != ""){
            playerText = wizard.toString();
            playerType = wizard.getCharType();
            swapImages(wizard.getWizardPic());
        }
        else if(cleric.getName() != null && cleric.getName() != "") {
            playerText = cleric.toString();
            playerType = cleric.getCharType();
            swapImages(cleric.getClericPic());
        }

        text = playerText;
        playerLabel.setText("Player: "+playerType);
    }

    //Declare a method to display weapon's image and game summary
    public void displayWeaponChoice() {
        dagger = MainFrame.getTheDagger();
        sword = MainFrame.getTheSword();
        hammer = MainFrame.getTheHammer();
        monster = MainFrame.getTheMonster();
        String weaponText = "", monsterText = "";

        if(dagger.getWeaponType() != null && dagger.getWeaponType() != "") {
            weaponText = dagger.toString();
        }
        else if(sword.getWeaponType() != null && sword.getWeaponType() != ""){
            weaponText = sword.toString();
        }
        else if(hammer.getWeaponType() != null && hammer.getWeaponType() != "") {
            weaponText = hammer.toString();
        }
        monsterText = monster.toString();
        text = text + weaponText + monsterText;
        displayText.setText(text);
    }

    //Declare a method to return play again button
    public JButton getPlayAgainBtn() { return playAgainBtn;}

    public void swapImages(ImageIcon image) { playerImageLabel.setVisible(true);playerImageLabel.setIcon(image); }

    //Method for de-selecting images
    public void setDisplayPanelImages(){playerImageLabel.setVisible(false); monsterImageLabel.setVisible(false);
    }

    //Method for de-selecting game summary
    public void deselectDisplayText() {
        displayText.setText("");
    }

}
