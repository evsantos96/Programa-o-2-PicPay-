/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
/**
 *
 * @author Everton
 */
public class Login extends JFrame implements ActionListener,FocusListener{

    JButton jbLogin = new JButton("Criar Conta");
    JLabel jlLogin = new JLabel("Login");
    JTextField jtLogin = new JTextField("PicPay2018@mail.com");
    JPasswordField jpLogin = new JPasswordField("");
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
        Input();
    }
        
        private void Botoes(){
            jbLogin.addActionListener(this);
            jbLogin.getToolTipText();
            jbLogin.setBounds(173, 345, 100, 20);
            jbLogin.setBorderPainted(false);
            jbLogin.setBackground(Color.decode("#eeeeee"));
            jbLogin.setContentAreaFilled(false);
            jbLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
            
            add(jbLogin);
          
        }
        private void Label(){
            jlLogin.setFont(new Font("arial",4,35));
            jlLogin.setBounds(180, 45, 100, 40);
            jlLogin.setVisible(true);
            add(jlLogin);
        }
        private void Input(){
            jtLogin.setBounds(173, 155, 100, 20);
            jtLogin.setVisible(true);
            jtLogin.setFocusCycleRoot(false);
            
            jpLogin.setBounds(173, 205, 100, 20);
            jpLogin.setVisible(true);
            
            jtLogin.addFocusListener(this);
            add(jtLogin);
      
          
            add(jpLogin);
            
            
        }
          @Override
    public void actionPerformed(ActionEvent e) {
       int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Deseja Criar Conta?", "Criar Conta", dialogButton);
            if(dialogResult == 0) {
              this.dispose();
              new Cadastro();
              System.out.println("Yes option");
            } else {
              System.out.println("No Option");
            } 
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(jtLogin.getText().equals("PicPay2018@mail.com")){
            jtLogin.setText("");
            
        }
       jtLogin.setBorder(new LineBorder(Color.decode("#66afe9"),1));
       
       }
    

    @Override
    public void focusLost(FocusEvent e) {
         if(jtLogin.getText().equals("")){
            jtLogin.setText("PicPay2018@mail.com");
        }
       jtLogin.setBorder(new LineBorder(Color.decode("#a8a8a8"),1));
       
       
    }
        
    }


