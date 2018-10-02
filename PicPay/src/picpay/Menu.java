/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picpay;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Everton
 */
public class Menu extends JFrame {

    JLabel jlMenu = new JLabel("Bem Vindo Everton");
    JLabel jlMenu1 = new JLabel("teste");
    JButton jbMenu = new JButton();
    JPanel jpMenu = new JPanel();
    JPanel jpMenu1 = new JPanel();
    JMenuBar jmbMenu = new JMenuBar();
    JMenu jMenu = new JMenu("Conta");
    JMenuItem jmiMenu = new JMenuItem("Perfil");
    JMenuItem jmiMenu1 = new JMenuItem("Sair da Conta");
    JMenuItem jmiMenu2 = new JMenuItem("Sair");
    
     private void jMenu(){
        setJMenuBar(jmbMenu);
        jmbMenu.add(jMenu); 
        jMenu.add(jmiMenu);
        jMenu.add(jmiMenu1);
        jMenu.addSeparator();
        jMenu.add(jmiMenu2);
       
       JMenuItemHandler handler = new JMenuItemHandler();
       jmiMenu.addActionListener(handler);
       jmiMenu1.addActionListener(handler);
       jmiMenu2.addActionListener(handler);
     }

    public Menu() {
        super("Menu");
        setSize(850,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout(5,5));
        setVisible(true);
        getContentPane().add(jpMenu);
        getContentPane().add(jpMenu1);
        Label();
        Button();
        jMenu();
        
    } 
    private void Label(){
        jlMenu.setFont(new Font("arial", 4, 35));
        jlMenu.setVisible(true);
        jpMenu.add(jlMenu);
        add(jpMenu,BorderLayout.NORTH);
        
        jlMenu1.setFont(new Font("arial", 4, 35));
        
       
        
        add(jpMenu1,BorderLayout.CENTER);
        
        jpMenu1.add(jlMenu1);
        jlMenu1.setVisible(true);
        jpMenu1.setBorder(new TitledBorder("Transferencias"));
        
        
    }
    private void Button(){
    
    }
    private class JMenuItemHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
          if(ae.getSource() == jmiMenu){
              
          }
          else if (ae.getSource() == jmiMenu1){
              dispose();
              System.gc();
              new Login();
          }
          else{
              System.exit(0);
          }
        }
        
    }
}
