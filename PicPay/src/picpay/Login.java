/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picpay;


import java.awt.Color;
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
public class Login extends JFrame implements FocusListener, ActionListener{

   public JButton jbLogin = new JButton("Criar Conta");
   public JButton jbLogin2 = new JButton("Login");
   public JLabel jlLogin = new JLabel("Login");
   public JLabel jlLogin2 = new JLabel("Email:");
   public JLabel jlLogin3 = new JLabel("Senha:");
   public JTextField jtLogin = new JTextField("PicPay2018@mail.com");
   public JPasswordField jpLogin = new JPasswordField("Picp");
   
    public Login() {

        super("Bem-Vindo ao PicPay");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);

        Button();
        Label();
        Input();
    }

    private void Button() {

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

        jbLogin.addActionListener(this);
        jbLogin2.addActionListener(this);

    }

    private void Label() {
        jlLogin.setFont(new Font("arial", 4, 35));
        jlLogin.setBounds(180, 45, 100, 40);
        jlLogin.setVisible(true);

        jlLogin2.setFont(new Font("arial", 1, 14));
        jlLogin2.setBounds(83, 155, 180, 20);
        jlLogin2.setVisible(true);

        jlLogin3.setFont(new Font("arial", 1, 14));
        jlLogin3.setBounds(75, 205, 180, 16);
        jlLogin3.setVisible(true);

        add(jlLogin);
        add(jlLogin2);
        add(jlLogin3);
    }

    private void Input() {
        jtLogin.setBounds(153, 155, 180, 20);
        jtLogin.setVisible(true);
        jpLogin.setBounds(153, 205, 180, 20);
        jpLogin.setVisible(true);

        add(jtLogin);
        add(jpLogin);

        
        jtLogin.addFocusListener(this);
        jpLogin.addFocusListener(this);

    }

   

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jbLogin) {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja Criar Conta?", "Criar Conta", dialogButton);

                if (dialogResult == 0) {
                    dispose(); 
                    new Cadastro();
                    System.out.println("Yes option");
                } else {
                    System.out.println("No Option");
                }
            } else {
                dispose();
                new Menu();
               
                JOptionPane pane = new JOptionPane("Bem-VIndo Usuario");
                JDialog dialog = pane.createDialog("Bem-Vindo");
                dialog.setVisible(true);
                dialog.setLocationRelativeTo(null);
            }
        }

   

   

        @Override
        public void focusGained(FocusEvent e) {
            if (e.getSource() == jtLogin) {
                if (jtLogin.getText().equals("PicPay2018@mail.com")) {
                    jtLogin.setText("");

                }
                jtLogin.setBorder(new LineBorder(Color.decode("#66afe9"), 1));

            } else {
                if (jpLogin.getPassword().length == 4) {
                    jpLogin.setText("");
                }
                jpLogin.setBorder(new LineBorder(Color.decode("#66afe9"), 1));
            }

        }

        @Override
        public void focusLost(FocusEvent e) {
            if (e.getSource() == jtLogin) {
                if (jtLogin.getText().equals("")) {
                    jtLogin.setText("PicPay2018@mail.com");
                }
                jtLogin.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));

            } else {
                if (jpLogin.getPassword().length == 0) {
                    jpLogin.setText("Picp");
                }
                jpLogin.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));
            }
        }

    }


