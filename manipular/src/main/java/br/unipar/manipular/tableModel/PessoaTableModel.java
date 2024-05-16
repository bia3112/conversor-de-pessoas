/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.manipular.tableModel;

import br.unipar.manipular.models.Pessoa;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Beatr
 */
public class PessoaTableModel extends DefaultTableModel {

    public PessoaTableModel() {
        this.addColumn("nome");
        this.addColumn("idade");
        this.addColumn("cpf");
        this.addColumn("rg");
        this.addColumn("data_nasc");
        this.addColumn("sexo");
        this.addColumn("signo");
        this.addColumn("mae");
        this.addColumn("pai");
        this.addColumn("email");
        this.addColumn("cep");
        this.addColumn("endereco");
        this.addColumn("numero");
        this.addColumn("bairro");
        this.addColumn("cidade");
        this.addColumn("telefone_fixo");
        this.addColumn("celular");
        this.addColumn("altura");
        this.addColumn("peso");
        this.addColumn("tipo");
        this.addColumn("cor");
    }
    
    public PessoaTableModel(List<Pessoa> listPessoa) {
        this();
        
        for(Pessoa pessoa : listPessoa) {
            
            this.addRow(new String [] {
                pessoa.getNome(),
                String.valueOf(pessoa.getIdade()),
                pessoa.getCpf(),
                pessoa.getRg(),
                String.valueOf(pessoa.getData_nasc()),
                pessoa.getSexo(),
                pessoa.getSigno(),
                pessoa.getMae(),
                pessoa.getPai(),
                pessoa.getEmail(),
                pessoa.getSenha(),
                pessoa.getCep(),
                pessoa.getEndereco(),
                pessoa.getNumero(),
                pessoa.getBairro(),
                pessoa.getCidade(),
                pessoa.getEstado(),
                pessoa.getTelefone_fixo(),
                pessoa.getCelular(),
                String.valueOf(pessoa.getAltura()),
                String.valueOf(pessoa.getPeso()),
                pessoa.getTipo_sanguineo(),
                pessoa.getCor()
            }); 
        }
    }
    
    public Pessoa getSelectedPessoa(JTable table, List<Pessoa> pessoas) {
        return null;
    }

}
