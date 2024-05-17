/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.manipular.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Beatr
 */
public class EntityManagerUtil {
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    private EntityManagerUtil() {}
    
    public static EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence
                    .createEntityManagerFactory("ManipularArquivo");
           JOptionPane.showMessageDialog(null, 
                        "conexão aberta!"
                        );
        }
        return emf;
    }
    
    public static void closeEntityManagerFactory() {
        if(emf != null && emf.isOpen()) {
            emf.close();
            JOptionPane.showMessageDialog(null, 
                        "Deu erro ou conectar", "Atenção",
                        JOptionPane.ERROR_MESSAGE, null);
        }
    }
    
    public static EntityManager getManager() {
        if(em == null || !em.isOpen()) {
            em = emf.createEntityManager();
           JOptionPane.showMessageDialog(null, 
                        "entity manager aberta!"
                        );
        }
        return em;
    }
}
