package ca.nscc;


import ca.nscc.gui.MainFrame;
import java.awt.*;

//Free Pic Source : https://www.dreamstime.com/photos-images/dungeons-dragons.html

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame frame = new MainFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
