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
import picpay.Views.ICadastro;


/**
 *
 * @author Everton
 */
public class Cadastro extends JFrame implements ICadastro, FocusListener, ActionListener{

   

    public Cadastro() {
        super("Cadastro - PicPay");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        Label();
        Input();
        Button();
    }

    private void Label() {
        jlCadastro0.setFont(new Font("arial", 4, 35));
        jlCadastro0.setBounds(140, 45, 160, 40);
        jlCadastro0.setVisible(true);

        add(jlCadastro0);
        jlCadastro.setFont(new Font("arial", 1, 14));
        jlCadastro.setBounds(55, 112, 190, 40);
        jlCadastro.setVisible(true);
        add(jlCadastro);
        jlCadastro2.setFont(new Font("arial", 1, 14));
        jlCadastro2.setBounds(10, 152, 190, 40);
        jlCadastro2.setVisible(true);
        add(jlCadastro2);
        jlCadastro5.setFont(new Font("arial", 1, 14));
        jlCadastro5.setBounds(71, 192, 190, 40);
        jlCadastro5.setVisible(true);
        add(jlCadastro5);
        jlCadastro3.setFont(new Font("arial", 1, 14));
        jlCadastro3.setBounds(55, 233, 190, 40);
        jlCadastro3.setVisible(true);
        add(jlCadastro3);
        jlCadastro4.setFont(new Font("arial", 1, 14));
        jlCadastro4.setBounds(30, 273, 190, 40);
        jlCadastro4.setVisible(true);
        add(jlCadastro4);
    }

    private void Input() {

        jtCadastro.setBounds(210, 125, 180, 20);
        jtCadastro.setVisible(true);
        add(jtCadastro);

        jtCadastro1.setBounds(210, 165, 180, 20);
        jtCadastro1.setVisible(true);
        add(jtCadastro1);

        jtCadastro2.setBounds(210, 205, 180, 20);
        jtCadastro2.setVisible(true);
        add(jtCadastro2);

        jpCadastro.setBounds(210, 245, 180, 20);
        jpCadastro.setVisible(true);
        add(jpCadastro);

        jpCadastro2.setBounds(210, 285, 180, 20);
        jpCadastro2.setVisible(true);
        add(jpCadastro2);

       
        jtCadastro.addFocusListener(this);
        jtCadastro1.addFocusListener(this);
        jtCadastro2.addFocusListener(this);
        jpCadastro.addFocusListener(this);
        jpCadastro2.addFocusListener(this);

    }

    private void Button() {
        jbCadastro.setBounds(163, 335, 120, 20);
        jbCadastro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbCadastro.setBackground(Color.decode("#00c266"));
        jbCadastro.setBorderPainted(false);;
        jbCadastro.setVisible(true);
        add(jbCadastro);
        jbCadastro2.setToolTipText("Criar Conta");
        jbCadastro2.setBounds(163, 365, 120, 20);
        jbCadastro2.setBorderPainted(false);
        jbCadastro2.setBackground(Color.decode("#eeeeee"));
        jbCadastro2.setContentAreaFilled(false);
        jbCadastro2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(jbCadastro2);

        
        jbCadastro.addActionListener(this);
        jbCadastro2.addActionListener(this);
    }

   

        @Override
        public void focusGained(FocusEvent fe) {

            if (fe.getSource() == jtCadastro) {
                jtCadastro.setBorder(new LineBorder(Color.decode("#66afe9"), 1));
            } else if (fe.getSource() == jtCadastro1) {
                jtCadastro1.setBorder(new LineBorder(Color.decode("#66afe9"), 1));
            } else if (fe.getSource() == jtCadastro2) {
                jtCadastro2.setBorder(new LineBorder(Color.decode("#66afe9"), 1));
            } else if (fe.getSource() == jpCadastro) {
                jpCadastro.setBorder(new LineBorder(Color.decode("#66afe9"), 1));
            } else {
                jpCadastro2.setBorder(new LineBorder(Color.decode("#66afe9"), 1));
            }

        }

        @Override
        public void focusLost(FocusEvent fe) {
            if (fe.getSource() == jtCadastro) {
                jtCadastro.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));
            } else if (fe.getSource() == jtCadastro1) {
                jtCadastro1.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));
            } else if (fe.getSource() == jtCadastro2) {
                jtCadastro2.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));
            } else if (fe.getSource() == jpCadastro) {
                jpCadastro.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));
            } else {
                jpCadastro2.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));
            }
        }

   
        
   

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == jbCadastro2) {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja Fazer Login?", "Voltar para Login", dialogButton);

                if (dialogResult == 0) {
                    dispose();
                 
                    new Login();
                    System.out.println("Yes option");
                } else {
                    System.out.println("No Option");
                }
            } else {
                dispose();
               
                new Login();
                JOptionPane pane = new JOptionPane("Usuario Cadastrado \nJá pode fazer o seu Login");
                JDialog dialog = pane.createDialog("Bem-Vindo");
                dialog.setVisible(true);
                dialog.setLocationRelativeTo(null);
                int dialogo = JOptionPane.OK_OPTION;
                if (dialogo == 0){
                    dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    System.out.println("Yes option");
                }
            }

        }

    }
   

