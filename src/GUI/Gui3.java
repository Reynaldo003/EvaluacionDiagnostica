package GUI;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui3 extends JFrame{
    
    private Container panel;
    private JButton miboton;
    
    public Gui3(){    
        super("Ventana Herencia");
        miboton = new JButton("Aceptar");
        panel = getContentPane();
        panel.add(miboton);
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
