/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picpay;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import picpay.Views.IPerfil;



/**
 *
 * @author everton
 */
public class Perfil extends JFrame implements IPerfil,ItemListener,FocusListener,ActionListener {
    public JLabel lPerfil = new JLabel();
    public final Icon perfil = new ImageIcon(getClass().getResource( "perfil.png"));
    
    public Perfil() {
        super("Conta");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        Img();
        Label();
        Imput();
        Button();
        CheckBox();
    }
    public void Label() {  
       lPerfil.setCursor(new Cursor(Cursor.HAND_CURSOR));
       lPerfil.setBounds(160, 45, 120, 100);
       add(lPerfil);
       lPerfil1.setText("Nome:");
       lPerfil1.setVisible(true);
       lPerfil1.setBounds(105, 122, 100, 100);
       add(lPerfil1);
       lPerfil2.setText("Sobrenome:");
       lPerfil2.setVisible(true);
       lPerfil2.setBounds(65, 152, 100, 100);
       add(lPerfil2);
       lPerfil3.setText("Senha:");
       lPerfil3.setVisible(true);
       lPerfil3.setBounds(100, 182, 100, 100);
       add(lPerfil3);
       lPerfil4.setText("CPF:");
       lPerfil4.setVisible(true);
       lPerfil4.setBounds(118, 212, 100, 100);
       add(lPerfil4); 
    }
    private void Imput(){
       jtPerfil.setBounds(175, 164, 180, 20);
       jtPerfil.setVisible(true);
       add(jtPerfil);
       jtPerfil1.setBounds(175, 194, 180, 20);
       jtPerfil1.setVisible(true);
       add(jtPerfil1);
       jpfPerfil.setBounds(175, 224, 180, 20);
       jpfPerfil.setVisible(true);
       add(jpfPerfil);
       jtPerfil2.setBounds(175, 224, 180, 20);
       jtPerfil2.setVisible(true);
       add(jtPerfil2);
       jtPerfil3.setBounds(175, 254, 180, 20);
       jtPerfil3.setVisible(true);
       add(jtPerfil3);
       
       
       jtPerfil.addFocusListener(this);
       jtPerfil1.addFocusListener(this);
       jtPerfil2.addFocusListener(this);
       jtPerfil3.addFocusListener(this);
       
        jtPerfil.setEditable(false);    
        jtPerfil1.setEditable(false);
        jtPerfil2.setEditable(false);
        jtPerfil3.setEditable(false);
        jpfPerfil.setEditable(false);
    }
 
    private void Img(){
        lPerfil = new JLabel(perfil);
        lPerfil.setToolTipText("Imagem de Perfil");
        lPerfil.setVisible(true);
   }

    private void Button(){  
        jbPerfil.setBounds(138, 335, 180, 30);
        jbPerfil.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbPerfil.setBackground(Color.decode("#00c266"));
        jbPerfil.setBorderPainted(false);;
        jbPerfil.setVisible(true);
        jbPerfil.addActionListener(this);
        add(jbPerfil);
        
    }

    private void CheckBox() {
        jcPerfil.setBounds(158, 385, 180, 30);
        add(jcPerfil);
        jcPerfil.addItemListener(this);
        jcPerfil.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

        @Override
        public void itemStateChanged(ItemEvent ie) {
            if(jcPerfil.isSelected()){
                jtPerfil.setEditable(true);
                jtPerfil1.setEditable(true);
                jtPerfil2.setEditable(true);
                jtPerfil3.setEditable(true);
                jpfPerfil.setEditable(true);
            }else{
                jtPerfil.setEditable(false);
                jtPerfil1.setEditable(false);
                jtPerfil2.setEditable(false);
                jtPerfil3.setEditable(false);
                jpfPerfil.setEditable(false);
            }
        } 

    
   

        @Override
        public void focusGained(FocusEvent fe) {
            if(jcPerfil.isSelected() == true){
            if (fe.getSource() == jtPerfil) {
                jtPerfil.setBorder(new LineBorder(Color.decode("#66afe9"), 1));
            } else if (fe.getSource() == jtPerfil1) {
                jtPerfil1.setBorder(new LineBorder(Color.decode("#66afe9"), 1));
            } else if (fe.getSource() == jtPerfil2) {
                jtPerfil2.setBorder(new LineBorder(Color.decode("#66afe9"), 1));
            } else if (fe.getSource() == jtPerfil3) {
                jtPerfil3.setBorder(new LineBorder(Color.decode("#66afe9"), 1));
            } else {
                jpfPerfil.setBorder(new LineBorder(Color.decode("#66afe9"), 1));
            } 
          }
        }


        @Override
        public void focusLost(FocusEvent fe) {
            if(jcPerfil.isSelected() == true){
            if (fe.getSource() == jtPerfil) {
                jtPerfil.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));
            } else if (fe.getSource() == jtPerfil1) {
                jtPerfil1.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));
            } else if (fe.getSource() == jtPerfil2) {
                jtPerfil2.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));
            } else if (fe.getSource() == jtPerfil3) {
                jtPerfil3.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));
            } else {
                jpfPerfil.setBorder(new LineBorder(Color.decode("#a8a8a8"), 1));
            } 
           }
        }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if((ae.getSource() == jbPerfil) && (jcPerfil.isSelected() == true)){
                JOptionPane pane = new JOptionPane("Dados Modificados com Sucesso");
                JDialog dialog = pane.createDialog("Perfil Modificado");
                dialog.setVisible(true);
                dialog.setLocationRelativeTo(null);
        }
    }
        
    }
