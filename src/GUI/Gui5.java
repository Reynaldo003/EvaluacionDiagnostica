package GUI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui5 extends JFrame{
    public Gui5(){
        super("Ventana Herencia");
        getContentPane().setLayout(new FlowLayout());//Se agrega el flowlayout a la ventana
        JButton boton = new JButton("Boton");
        JLabel etiqueta = new JLabel("Dato");
        JTextField textfield = new JTextField(10);
        JCheckBox checkbox = new JCheckBox("Check Box");
        
        getContentPane().add(boton);
        getContentPane().add(etiqueta);
        getContentPane().add(textfield);
        getContentPane().add(checkbox);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();//Muestra la ventana con el tamaño justo
        setVisible(true);
    }
}
