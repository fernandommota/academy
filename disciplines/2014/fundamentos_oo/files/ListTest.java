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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListTest extends JFrame {

    private JList colorList;
    private Container c;

    public ListTest() {       //construtor
        super("List Test");
        c = getContentPane();
        c.setLayout(new FlowLayout());

        colorList = new JList(colorNames);
        colorList.setVisibleRowCount(5);
        colorList.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION);
        c.add(new JScrollPane(colorList));
        colorList.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent e) {
                        c.setBackground(
                                colors[ colorList.getSelectedIndex()]);
                    }
                }
        );
        setSize(350, 150);
        setVisible(true);
    }

    private String colorNames[]
            = {"Black", "Blue", "Cyan", "Dark Gray", "Gray",
                "Green", "Light Gray", "Magenta", "Orange",
                "Pink", "Red", "White", "Yellow"};

    private Color colors[]
            = {Color.black, Color.blue, Color.cyan,
                Color.darkGray, Color.gray, Color.green,
                Color.lightGray, Color.magenta, Color.orange,
                Color.pink, Color.red, Color.white, Color.yellow
            };

    public static void main(String args[]) {
        ListTest app = new ListTest();

        app.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }
} // ListTest

