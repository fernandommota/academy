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
public class MouseTracker extends JFrame
        implements MouseListener,
        MouseMotionListener {

    private JLabel statusBar;

    public MouseTracker() {
        super("Demonstrating Mouse Events");

        statusBar = new JLabel();
        getContentPane().add(statusBar,
                BorderLayout.SOUTH);

        this.addMouseListener(this);
        this.addMouseMotionListener(this);

        setSize(275, 100);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        statusBar.setText("Clicked at [" + e.getX()
                + ", " + e.getY() + "]");
    }

    public void mousePressed(MouseEvent e) {
        statusBar.setText("Pressed at [" + e.getX()
                + ", " + e.getY() + "]");
    }

    public void mouseReleased(MouseEvent e) {
        statusBar.setText("Released at [" + e.getX()
                + ", " + e.getY() + "]");
    }

    public void mouseEntered(MouseEvent e) {
        statusBar.setText("Mouse in window");
    }

    public void mouseExited(MouseEvent e) {
        statusBar.setText("Mouse outside window");
    }

    public void mouseDragged(MouseEvent e) {
        statusBar.setText("Dragged at [" + e.getX()
                + ", " + e.getY() + "]");
    }

    public void mouseMoved(MouseEvent e) {
        statusBar.setText("Moved at [" + e.getX()
                + ", " + e.getY() + "]");
    }

    public static void main(String args[]) {
        MouseTracker app = new MouseTracker();
        app.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }
}
