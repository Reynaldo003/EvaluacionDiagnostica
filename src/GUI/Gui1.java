
package GUI;

import javax.swing.JFrame;


public class Gui1 extends JFrame{
    public Gui1(){
        super("Ventana usando Herencia");
        setSize(370, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
