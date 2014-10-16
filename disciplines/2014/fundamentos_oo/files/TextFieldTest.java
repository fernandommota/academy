/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author fernandommota
 */
public class TextFieldTest extends JFrame{

    private JTextField text1, text2, text3;
    private JPasswordField password;

    public TextFieldTest() {  //construtor
        super("Testando JTextField e JPasswordField");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        text1 = new JTextField(10);
        c.add(text1);
        text2 = new JTextField("Entre com um texto");
        c.add(text2);
        text3 = new JTextField("Texto nao modificável");
        text3.setEditable(false);
        c.add(text3);
        password = new JPasswordField("Texto oculto");
        c.add(password);

        TextFieldHandler handler = new TextFieldHandler();
        text1.addActionListener(handler);
        text2.addActionListener(handler);
        text3.addActionListener(handler);
        password.addActionListener(handler);
        setSize(425, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        TextFieldTest app = new TextFieldTest();

        app.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }

    private class TextFieldHandler
            implements ActionListener {
                
        public void actionPerformed(ActionEvent e) {
            String s = "";
            if (e.getSource() == text1) {
                s = "text1: " + e.getActionCommand();
            } else if (e.getSource() == text2) {
                s = "text2: " + e.getActionCommand();
            } else if (e.getSource() == text3) {
                s = "text3: " + e.getActionCommand();
            } else if (e.getSource() == password) {
                JPasswordField pwd
                        = (JPasswordField) e.getSource();
                s = "password: "
                        + new String(pwd.getPassword());
            }
            JOptionPane.showMessageDialog(null, s);
        }
    }
}


