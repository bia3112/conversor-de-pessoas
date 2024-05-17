/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.manipular.Menu;
import br.unipar.manipular.ExportacaodeArquivos;
import br.unipar.manipular.TelaManipulacaoArquivo;
import br.unipar.manipular.util.EntityManagerUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author vinid
 */
public class Menu  extends JFrame{
    
     public Menu() {
        setTitle("Menu");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuExercicios = new JMenu("Menu");
        
        JMenuItem manipulcao = new JMenuItem("Abrir Importação de arquivos");
        JMenuItem exportacao = new JMenuItem("Abrir Exportção de arquivos");
        
        menuExercicios.add(manipulcao);
        menuExercicios.add(exportacao);
        
        menuBar.add(menuExercicios);
         
           manipulcao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaManipulacaoArquivo().setVisible(true);
            }
            
        });
           exportacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ExportacaodeArquivos().setVisible(true);
            }});
        
        setJMenuBar(menuBar);
        
  
    }
   private void abrirPanel(JFrame panel) {
        getContentPane().removeAll();
        getContentPane().add(panel);
        revalidate();
        repaint();
    }
  

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                EntityManagerUtil.getEntityManagerFactory();
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });
    }

    @Override
    public void dispose() {
        EntityManagerUtil.closeEntityManagerFactory();
        super.dispose(); 
    }
    
}
