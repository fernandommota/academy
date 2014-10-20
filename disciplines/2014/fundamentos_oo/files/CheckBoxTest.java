/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos_swing;

/**
 *
 * @author fernandommota
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxTest extends JFrame {

    private JTextField t;
    private JCheckBox bold, italic;

    public CheckBoxTest() {
        super("Teste de CheckBox");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        t = new JTextField("Observe o estilo mudando", 20);
        t.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        c.add(t);
        bold = new JCheckBox("negrito");
        c.add(bold);
        italic = new JCheckBox("itálico");
        c.add(italic);
        CheckBoxHandler handler = new CheckBoxHandler();
        bold.addItemListener(handler);
        italic.addItemListener(handler);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        );
        setSize(275, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        CheckBoxTest checkBoxTest = new CheckBoxTest();
    }

    private class CheckBoxHandler
            implements ItemListener {

        private int valBold = Font.PLAIN;
        private int valItalic = Font.PLAIN;

        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == bold) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    valBold = Font.BOLD;
                } else {
                    valBold = Font.PLAIN;
                }
            }
            if (e.getSource() == italic) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    valItalic = Font.ITALIC;
                } else {
                    valItalic = Font.PLAIN;
                }
            }
            t.setFont(
                    new Font("TimesRoman",
                            valBold + valItalic, 14));
            t.repaint();
        }
    }
}
