package ca.nscc.gui;

import javax.swing.*;
import java.awt.*;

public class FirstPanel extends JPanel {

    //Declare properties of FirstPanel
    private JButton buildCharacterBtn;
    private JLabel dimensionsLabel;
    private JLabel imageLabel;

    //Declare constructor of FirstPanel
    public FirstPanel(){

    //Set Panel Properties
    Font myFont = new Font("Matura MT Script Capitals", Font.BOLD, 38);
    Font regularFont = new Font("Calibri", Font.BOLD, 22);

    setLayout(null);
    setVisible(true);
    setBackground(Color.CYAN);

   //Label control for ndn name
    JLabel nameLabel = new JLabel("Dragons and Dungeons");
    nameLabel.setFont(myFont);
    nameLabel.setBounds(180, 30, 500, 100);

    //Labels to show dimensions of each shape in a single field
    dimensionsLabel = new JLabel();
    dimensionsLabel.setFont(myFont);
    dimensionsLabel.setBounds(260, 70, 900, 900);

    //Label for shape image
    imageLabel = new JLabel();
    imageLabel.setIcon(new ImageIcon(getClass().getResource("/Images/d&d.png")));
    imageLabel.setBounds(100, 50, 550, 550);

    //Build a character screen button
    buildCharacterBtn = new JButton("Build A Character");
    buildCharacterBtn.setFont(regularFont);
    buildCharacterBtn.setBounds(250, 520, 200, 50);

    //Add all controls to panel
    add(nameLabel);
    add(imageLabel);
    add(dimensionsLabel);
    add(buildCharacterBtn);

    }

    //Declare a method to return if the button clicks
    public JButton getBuildCharacterBtn(){ return buildCharacterBtn; }

}
