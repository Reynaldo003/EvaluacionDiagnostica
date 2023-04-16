package GUI;

import javax.swing.JFrame;

public class Gui2 {

    public Gui2() {
        JFrame frame = new JFrame("Ventana sin Herencia");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
