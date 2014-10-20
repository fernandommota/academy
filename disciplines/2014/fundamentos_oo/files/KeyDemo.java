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
public class KeyDemo extends JFrame implements KeyListener {

    private String line1 = "", line2 = "";
    private String line3 = "";
    private JTextArea textArea;

    public KeyDemo() {
        super("Demonstrating Keystroke Events");

        textArea = new JTextArea(10, 15);
        textArea.setText("Pressione qualquer tecla...");
        textArea.setEnabled(false);
        addKeyListener(this);
        getContentPane().add(textArea);

        setSize(350, 100);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        line1 = "Key pressed: "
                + e.getKeyText(e.getKeyCode());
        textArea.setText(line1);
        System.out.println(line1);
    }

    public void keyReleased(KeyEvent e) {
        line1 = "Key released: "
                + e.getKeyText(e.getKeyCode());
        textArea.setText(line1);
        System.out.println(line1);
    }

    public void keyTyped(KeyEvent e) {
        line1 = "Key typed: " + e.getKeyChar();
        textArea.setText(line1);
        System.out.println(line1);
    }

    public static void main(String args[]) {
        KeyDemo app = new KeyDemo();

        app.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }
}
