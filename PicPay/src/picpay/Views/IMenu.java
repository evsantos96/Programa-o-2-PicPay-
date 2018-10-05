/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picpay.Views;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author everton
 */
public interface IMenu {
    public JLabel jlMenu = new JLabel("Bem Vindo Usuario");
    public JLabel jlMenu1 = new JLabel("teste");
    public JLabel jlMenu2 = new JLabel("Leste");
    public JLabel jlMenu3 = new JLabel("Oeste");
    public JLabel jlMenu4 = new JLabel("Sul");
    public JLabel jlMenu5 = new JLabel("Sul");
    public JLabel lDialog = new JLabel("Testando");
    public JLabel lDialog1 = new JLabel("Sul");
    public JButton jbMenu = new JButton("Fazer transferência");
    public JButton jbMenu1 = new JButton("Adicionar Saldo");
    public JButton jbMenu2 = new JButton("Retirar Saldo");
    public JButton jbMenu3= new JButton();
    public JPanel jpMenu = new JPanel();
    public JPanel jpMenu1 = new JPanel();
    public JPanel jpMenu2 = new JPanel();
    public JPanel jpMenu3 = new JPanel();
    public JPanel jpMenu4 = new JPanel();
    public JPanel jpDialog = new JPanel();
    public JMenuBar jmbMenu = new JMenuBar();
    public JMenu jMenu = new JMenu("Conta");
    public JMenuItem jmiMenu = new JMenuItem("Perfil");
    public JMenuItem jmiMenu1 = new JMenuItem("Sair da Conta");
    public  JMenuItem jmiMenu2 = new JMenuItem("Sair");
    public  Container cMenu = new Container();
    public  Container cMenu1 = new Container();
    public  Container cMenu2 = new Container();
    public  Container cDialog = new Container();
    
}
