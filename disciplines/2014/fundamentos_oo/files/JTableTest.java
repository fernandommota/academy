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
import java.awt.Container;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class JTableTest extends JFrame {

    private Object[][] data = {
        {"João", "Carlos", "Natação", 5, true},
        {"Francisco", "silva", "remo", 3, false},
        {"Marlon", "Costa", "Natação", 5, true},
        {"José", "Arantes", "Boxe", 3, false},
        {"Carlos", "Roberto", "Futebol", 5, true},
        {"Maria", "Clara", "Salto com vara", 3, false},
        {"Antonio", "da Silva", "basquete", 5, true},
        {"Natália", "Toledo", "remo", 3, false},
        {"Henrique", "Silva", "Futebol", 3, false},
        {"Renan", "Arantes", "Futebol", 3, false},
        {"Willian", "Costa", "Futebol", 3, false},
        {"José", "Arantes", "Boxe", 3, false},
        {"Carlos", "Roberto", "Futebol", 5, true},
        {"Maria", "Clara", "Salto com vara", 3, false},};
    private String[] colunas = {"Nome", "Sobrenome", "Esporte",
        "Prática (ano)", "Vegeteriano"};

    private JTable tabela;
    
    public JTableTest() {
        super("Testando botões");
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        DefaultTableModel modelo = new DefaultTableModel(data, colunas);
        tabela = new JTable(modelo);
        //tabela.setPreferredSize( new Dimension(100, 200) );
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            //@Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tabela.rowAtPoint(evt.getPoint());
                int col = tabela.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {
                    System.out.println("Row: "+row+" col:"+col);
                    
                }
            }
        });
        JScrollPane painelScroll = new JScrollPane(tabela);
        painelScroll.setPreferredSize(new Dimension(400, 200));
        c.add(painelScroll);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.setVisible(true);
    }
    
    public static void main(String args[]) {
        JTableTest obj = new JTableTest();
    }
}
