/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picpay;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import picpay.Views.IMenu;
import static picpay.Views.IMenu.cMenu;
import static picpay.Views.IMenu.cMenu1;
import static picpay.Views.IMenu.jMenu;
import static picpay.Views.IMenu.jbMenu;
import static picpay.Views.IMenu.jbMenu1;
import static picpay.Views.IMenu.jbMenu2;
import static picpay.Views.IMenu.jlMenu;
import static picpay.Views.IMenu.jlMenu1;
import static picpay.Views.IMenu.jlMenu2;
import static picpay.Views.IMenu.jlMenu4;
import static picpay.Views.IMenu.jlMenu5;
import static picpay.Views.IMenu.jmbMenu;
import static picpay.Views.IMenu.jmiMenu;
import static picpay.Views.IMenu.jmiMenu1;
import static picpay.Views.IMenu.jmiMenu2;
import static picpay.Views.IMenu.jpMenu;
import static picpay.Views.IMenu.jpMenu1;
import static picpay.Views.IMenu.jpMenu2;
import static picpay.Views.IMenu.jpMenu3;
import static picpay.Views.IMenu.jpMenu4;


/**
 *
 * @author Everton
 */
public class Menu extends JFrame implements IMenu{
   

    public Menu() {
        super("Menu");
        setSize(650, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout(5, 5));
        setVisible(true);
        getContentPane().add(jpMenu);
        getContentPane().add(jpMenu1);
        getContentPane().add(jpMenu2);
        getContentPane().add(cMenu);
        Label();
        Button();
        jMenu();

    }
      private void jMenu()  {
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

    private void Label() {
        jlMenu.setFont(new Font("arial", 4, 25));
        jlMenu.setVisible(true);
        jpMenu.add(jlMenu);
        add(jpMenu,BorderLayout.NORTH);
        
        add(jpMenu1,BorderLayout.CENTER);
        
        jlMenu1.setVisible(true);
        jpMenu1.setBorder(new TitledBorder("Menu"));
        jpMenu1.add(cMenu);
        cMenu.setLayout(new GridLayout(3,0,10,65));
        
       
        
        add(jpMenu2,BorderLayout.WEST);
        jlMenu2.setVisible(true);
        jpMenu2.setBorder(new TitledBorder("Ultimas Atividades"));
        jpMenu2.add(cMenu1);
        cMenu1.setLayout(new GridLayout(3,0,10,15));
        cMenu1.add(jpMenu3);
        cMenu1.add(jpMenu4);
        jpMenu3.add(jlMenu4);
        jpMenu3.setBackground(Color.decode("#00c266"));
        jpMenu3.setPreferredSize(new Dimension(170,80));
        jlMenu4.setText("<html>transferência:<br&gtcom HTML!> Valor: 20,00 R$ <br&gtcom HTML!> Conta: 2012 <br&gtcom HTML!> Nome: Alan </body></html>");
        jpMenu4.add(jlMenu5);
        jpMenu4.setBackground(Color.decode("#00c266"));
        jpMenu4.setPreferredSize(new Dimension(170,20));
        jlMenu5.setText("<html><br&gtcom HTML!>Saque:<br&gtcom HTML!> Valor: 20,00 R$ </body></html>");
       
    }

    private void Button() {
        
        cMenu.add(jbMenu);
        cMenu.add(jbMenu1);
        cMenu.add(jbMenu2);
        jbMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbMenu1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbMenu2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        JButtonHandler handler = new JButtonHandler();
          jbMenu.addActionListener(handler);
          jbMenu1.addActionListener(handler);      
          jbMenu2.addActionListener(handler);      
    }

    private class JMenuItemHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == jmiMenu) {
                
                new Perfil();
            } else if (ae.getSource() == jmiMenu1) {
                dispose();
                new Login();
            } else {
                System.exit(0);
            }
        }
    }
    private class JButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource() == jbMenu ){
               JOptionPane.showInputDialog("Numero da conta:");
               JOptionPane.showInputDialog("Valor da Transferência");
                   
            }else if(ae.getSource() == jbMenu1){
               JOptionPane.showInputDialog("Numero da conta:");
               JOptionPane.showInputDialog("Valor da Transferência");
            }else{
                JOptionPane.showInputDialog("Valor da Transferência");
                JOptionPane.showInputDialog("Numero da conta:");
               
            }
        }
        
    }
}
