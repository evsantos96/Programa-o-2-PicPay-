/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picpay.Views;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author everton
 */
public interface IPerfil {
  
    public  JLabel lPerfil1 = new JLabel();
    public  JLabel lPerfil2 = new JLabel();
    public  JLabel lPerfil3 = new JLabel();
    public  JLabel lPerfil4 = new JLabel();
    public  JTextField jtPerfil = new JTextField("Everton");
    public  JTextField jtPerfil1 = new JTextField("Santos");
    public  JTextField jtPerfil2 = new JTextField();
    public  JTextField jtPerfil3 = new JTextField();
    public  JPasswordField jpfPerfil = new JPasswordField("1234");
    public  JPanel jpPerfil = new JPanel();
    public  JPanel jpPerfil1 = new JPanel();
    public  JPanel jpPerfil2 = new JPanel();
    public  JPanel jpPerfil3 = new JPanel();
   
    public  JButton jbPerfil = new JButton("Salvar Mundanças");
    public  JCheckBox jcPerfil = new JCheckBox("Fazer Alterações");
    
}
