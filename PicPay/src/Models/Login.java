/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Everton
 */
public class Login extends JFrame implements ActionListener{

    JButton jbLogin = new JButton("Criar Conta");
    JLabel jlLogin = new JLabel("Login");
    public Login() {
        
        super("Bem-Vindo ao PicPay");
        setSize(450,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        
        Botoes();
        Label();
    }
        
        private void Botoes(){
            jbLogin.addActionListener(this);
            jbLogin.getToolTipText();
            jbLogin.setBounds(173, 345, 100, 20);
            add(jbLogin);
          
        }
        private void Label(){
            jlLogin.setFont(new Font("arial",4,35));
            jlLogin.setBounds(180, 65, 100, 40);
            jlLogin.setVisible(true);
            add(jlLogin);
        }
          @Override
    public void actionPerformed(ActionEvent e) {
       int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Deseja Criar Conta?", "Criar Conta", dialogButton);
            if(dialogResult == 0) {
              this.dispose();
              new Menu();
              System.out.println("Yes option");
            } else {
              System.out.println("No Option");
            } 
    }

  
    }


