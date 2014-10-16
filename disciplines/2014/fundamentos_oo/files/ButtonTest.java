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
public class ButtonTest extends JFrame {

    private JButton botao1, botao2;
    private JLabel label = new JLabel("Area de Teste");
    private JPanel painel;

    public ButtonTest() {
        super("Testando botões");
        Container c = getContentPane();

        painel = new JPanel();
        painel.setLayout(new GridLayout(0, 1));
        TrataBotoes tratador = new TrataBotoes();

        painel.add(label);
        botao1 = new JButton("Botao Um");
        botao1.addActionListener(tratador);
        painel.add(botao1);

        botao2 = new JButton("Botao Dois");
        botao2.addActionListener(tratador);
        painel.add(botao2);

        c.add(painel, BorderLayout.CENTER);
        setSize(300, 100);
        setVisible(true);

    }  //construtor

    public static void main(String[] args) {
        ButtonTest buttonTest = new ButtonTest();
    }

    private class TrataBotoes implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botao1) {
                label.setText("Pressionado botao 1");
            } else {
                label.setText("Pressionado botao 2");
            }
        }
    }//fim da classe TrataBotoes
} //fim da classe buttonTest


