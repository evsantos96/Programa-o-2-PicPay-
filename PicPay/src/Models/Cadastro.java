/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Everton
 */
public class Cadastro extends JFrame {
    JButton jbCadastro = new JButton("Criar Conta");
    JLabel jlCadastro = new JLabel("Cadastrar");
    public Cadastro() {
        super("Cadastro - PicPay");
        setSize(450,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);
    }
    
}
