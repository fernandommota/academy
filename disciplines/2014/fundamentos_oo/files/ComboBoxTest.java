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

public class ComboBoxTest extends JFrame {

    private JComboBox images;
    private JLabel label;
    private String path="C:\\Users\\fernandommota\\Dropbox\\academy\\UFMS\\disciplinas\\FUNDAMENTOS EM ORIENTAÇÃO A OBJETOS\\labs\\LabsTOO2014\\src\\exemplos_swing";
    private String names[]
            = {"bug1.gif", "bug2.gif",
                "travelbug.gif", "buganim.gif"};
    private Icon icons[]
            = {new ImageIcon(path+"\\"+names[ 0]),
                new ImageIcon(path+"\\"+names[ 1]),
                new ImageIcon(path+"\\"+names[ 2]),
                new ImageIcon(path+"\\"+names[ 3])};

    //Construtor nos próximos slides
    public ComboBoxTest() {
        super("Testing JComboBox");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        images = new JComboBox(names);
        images.setMaximumRowCount(3);
        images.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        label.setIcon(icons[images.getSelectedIndex()]);
                    }
                }
        );
        c.add(images);
        label = new JLabel(icons[ 0]);
        c.add(label);
        setSize(350, 100);
        setVisible(true);
    }

    public static void main(String args[]) {
        ComboBoxTest app = new ComboBoxTest();

        app.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }
} //fim da classe ComboBoxTest
