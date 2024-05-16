/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.manipular.interfaces;

import br.unipar.manipular.models.Pessoa;
import java.util.List;

/**
 *
 * @author Beatr
 */
public interface PessoaDAO {
    Pessoa save(Pessoa pessoa);
    Pessoa update(Pessoa pessoa);
    Boolean delete(Pessoa pessoa);
    
    Pessoa findById(Integer id); 
    List<Pessoa> findAll();
}
