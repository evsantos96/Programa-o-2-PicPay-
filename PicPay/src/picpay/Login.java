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
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JDialog;
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
public class Login extends JFrame  {

    JButton jbLogin = new JButton("Criar Conta");
    JButton jbLogin2 = new JButton("Login");
    JLabel jlLogin = new JLabel("Login");
    JLabel jlLogin2 = new JLabel("Email:");
    JLabel jlLogin3 = new JLabel("Senha:");

    JTextField jtLogin = new JTextField("PicPay2018@mail.com");
    JPasswordField jpLogin = new JPasswordField("654321");

    public Login() {

        super("Bem-Vindo ao PicPay");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);

        Botoes();
        Label();
        Input();
    }

    private void Botoes() {
        
        jbLogin.setToolTipText("Criar Conta");
        jbLogin.setBounds(163, 345, 120, 20);
        jbLogin.setBorderPainted(false);
        jbLogin.setBackground(Color.decode("#eeeeee"));
        jbLogin.setContentAreaFilled(false);
        jbLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));

       
        jbLogin2.setToolTipText("Login");
        jbLogin2.setBounds(163, 290, 120, 20);
        jbLogin2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbLogin2.setBackground(Color.decode("#00c266"));
        jbLogin2.setBorderPainted(false);
        jbLogin2.setVisible(true);
        add(jbLogin);
        add(jbLogin2);
        
        
        
        ButtonHandler Cadastro = new ButtonHandler();
        jbLogin.addActionListener(Cadastro);
        
        jButtonHandler Login = new jButtonHandler();
        jbLogin2.addActionListener(Login);
        
    }

    private void Label() {
        jlLogin.setFont(new Font("arial", 4, 35));
        jlLogin.setBounds(180, 45, 100, 40);
        jlLogin.setVisible(true);
        
        jlLogin2.setFont(new Font("arial", 1, 14));
        jlLogin2.setBounds(73, 155, 180, 20);
        jlLogin2.setVisible(true);
        
        jlLogin3.setFont(new Font("arial", 1, 14));
        jlLogin3.setBounds(70, 205, 180, 16);
        jlLogin3.setVisible(true);
        
        add(jlLogin);
        add(jlLogin2);
        add(jlLogin3);
    }

    private void Input() {
        jtLogin.setBounds(133, 155, 180, 20);
        jtLogin.setFocusCycleRoot(false);
        jtLogin.setVisible(true);
        jpLogin.setBounds(133, 205, 180, 20);
        jpLogin.setVisible(true);

        add(jtLogin);
        add(jpLogin);
        TextFieldHandler email = new TextFieldHandler();

        jtLogin.addFocusListener(email);

        PasswordHandler senha = new PasswordHandler();
        jpLogin.addFocusListener(senha);

    }
private class ButtonHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja Criar Conta?", "Criar Conta", dialogButton);
          
        if (dialogResult == 0) {
            dispose();
            new Cadastro();
            
            System.out.println("Yes option");
        } else {
            System.out.println("No Option");
        }
    }
}
    private class jButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
          dispose();
          new Menu();
         JOptionPane pane = new JOptionPane("Bem-VIndo Usuario");
         JDialog dialog = pane.createDialog("Bem-Vindo");
            dialog.setVisible(true);
            dialog.setLocationRelativeTo(null);
        }
    
    
    
    } 
    private class TextFieldHandler implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            if (jtLogin.getText().equals("PicPay2018@mail.com")) {
                jtLogin.setText("");

            }
            jtLogin.setBorder(new LineBorder(Color.decode("#66afe9"), 1));

        }

        @Override
        public void focusLost(FocusEvent e) {
            if (jtLogin.getText().equals("")) {
                jtLogin.setText("PicPay2018@mail.com");
            }
            jtLogin.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));

        }
    }

    public class PasswordHandler implements FocusListener {

        @Override
        public void focusGained(FocusEvent fe) {
            if (jpLogin.getPassword().length == 6) {
                jpLogin.setText("");
            }
            jpLogin.setBorder(new LineBorder(Color.decode("#66afe9"), 1));
        }

        @Override
        public void focusLost(FocusEvent fe) {
            if (jpLogin.getPassword().length == 0) {
                jpLogin.setText("654321");
            }
            jpLogin.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));
        }
    }

}

    

/*
  
 
*/
