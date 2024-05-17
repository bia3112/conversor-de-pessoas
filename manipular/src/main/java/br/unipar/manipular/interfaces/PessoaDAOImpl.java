/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.manipular.interfaces;

import br.unipar.manipular.models.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.JOptionPane;

/**
 *
 * @author Beatr
 */
public class PessoaDAOImpl implements PessoaDAO {
    
    private EntityManager entityManager;

    public PessoaDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Pessoa save(Pessoa pessoa) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(pessoa);;
        transaction.commit();
        entityManager.close();
        
        System.out.println("Pessoa salvo com sucesso!");
        return pessoa;
    }

    @Override
    public Pessoa update(Pessoa pessoa) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(pessoa);
        transaction.commit();
        entityManager.close();
        
        JOptionPane.showMessageDialog(null, 
                        "Pessoa atualizado com sucesso!"
                        );
        return pessoa;
    }

    @Override
    public Boolean delete(Pessoa pessoa) {
        EntityTransaction transaction = entityManager.getTransaction();
        
        try {
            transaction.begin();
            entityManager.remove(pessoa);
            transaction.commit();
            entityManager.close();

           JOptionPane.showMessageDialog(null, 
                        "Pessoa removido com sucesso!"
                        );
            return true;
        } catch (Exception e) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, 
                        "Pessoa atualizado com sucesso!"
                        );
            return false;
        }
    }

    @Override
    public Pessoa findById(Integer id) {
        return entityManager.find(Pessoa.class, id);
    }

    @Override
    public List<Pessoa> findAll() {
        return entityManager.createQuery("SELECT p FROM Pessoa p",
                Pessoa.class).getResultList();
    }
    
}
