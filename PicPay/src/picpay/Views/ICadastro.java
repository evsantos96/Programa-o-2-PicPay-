/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picpay.Views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author everton
 */
public interface ICadastro {
   public JLabel jlCadastro0 = new JLabel("Cadastro");
   public JLabel jlCadastro = new JLabel("Digite seu Nome:");
   public JLabel jlCadastro2 = new JLabel("Digite seu Sobrenome:");
   public JLabel jlCadastro3 = new JLabel("Digite sua Senha:");
   public JLabel jlCadastro4 = new JLabel("Confirme sua Senha:");
   public JLabel jlCadastro5 = new JLabel("Digite seu CPF:");
   public JTextField jtCadastro = new JTextField("");
   public JTextField jtCadastro1 = new JTextField("");
   public JTextField jtCadastro2 = new JTextField("");
   public JPasswordField jpCadastro = new JPasswordField("");
   public JPasswordField jpCadastro2 = new JPasswordField("");
   public JButton jbCadastro = new JButton("Criar Conta");
   public JButton jbCadastro2 = new JButton("Fazer Login");
}
