package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui8 extends JFrame implements ActionListener {

    private JLabel label;
    private JTextField text1;
    private JButton boton;

    public Gui8() {
        super("Gui8 Activacion Oyente");
        setLayout(null);
        setSize(300, 150);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Etiqueta que sirve para escribir texto, tambien sirve para colocar una imagen
        label = new JLabel("XD");
        label.setBounds(10, 10, 100, 30);
        add(label);

        //Campo de Texto
        text1 = new JTextField();
        text1.setBounds(80, 10, 150, 30);
        add(text1);

        //Boton
        boton = new JButton("XD");
        boton.setBounds(10, 80, 100, 30);

        boton.addActionListener(this);
        add(boton);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==boton){
            //Tools.imprimeSalida("Hola "+text1.getText()+" estas?");
            System.out.println("Floppa al enterarse "+text1.getText());
        }
    }
}
