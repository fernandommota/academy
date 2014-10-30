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


public class GerenciadorLayout extends JFrame {
    private JTextField textOne;
    private JTextField textTwo;
    private JTextField textThree;
    
    public GerenciadorLayout() {
        super("Exemplo Gerenciador FlowLayout");
        
        Container c = getContentPane();
        //c.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        textOne= new JTextField("Campo de texto 1", 20);
        textTwo= new JTextField("Campo de texto 2", 20);
        textThree= new JTextField("Campo de texto 3", 20);
        
        
        JPanel painel = new JPanel();
        //painel.setLayout(new FlowLayout(FlowLayout.LEFT));
        //painel.setLayout(new GridLayout(3,1));
        //painel.setLayout(new GridLayout(2,2));
        painel.setLayout(new BorderLayout());
        
        painel.add(textOne, BorderLayout.CENTER); //BorderLayout.EAST
        painel.add(textTwo, BorderLayout.CENTER); //BorderLayout.NORTH
        painel.add(textThree, BorderLayout.SOUTH); //BorderLayout.SOUTH
        
        c.add(painel);
        setSize(800, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
    }

    public static void main(String[] args) {
        GerenciadorLayout gerenciador = new GerenciadorLayout();
    }
}
