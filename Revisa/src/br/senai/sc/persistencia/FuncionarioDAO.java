package br.senai.sc.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *Classe que guarda as informações referentes aos funcionarios.
 * @version 1.0 08/07/2013
 * @author Owner
 */
public class FuncionarioDAO {
    
    /*
     * Método para adicionar um funcionário no vetor de 
     * funcionários.
     */
    
    public void adicionar(Funcionario f, List<Funcionario> funcionarios){
        funcionarios.add(f);
        JOptionPane.showMessageDialog(null, "Funcionário "
                + "adicionado com sucesso. ");
    }
    
    /*
     * Método que lista todos os funcionários
     */
    public void listar(List<Funcionario> funcionarios){
        String msg = " ";
         for (Funcionario f : funcionarios) {
            msg = msg +"\nNome: "                + f.getNome()
                    + "\nData Nascimento: "      + f.getDataNascimento()
                    + "\nRG: "                   + f.getRg()
                    + "\nCPF: "                  + f.getCpf()
                    + "\nEndereço: "             + f.getEndereco()
                    + "\nTelefone: "             + f.getTelefone()
                    + "\nData Cadastro: "        + f.getDataCadastro()
                    + "\nSalário: "              + f.getSalario()
                    + "\nData admissão: "        + f.getDataAdmissão()
                    + "\nCarteira de trabalho: " + f.getCtps()
                    + "\nCargo:"                 + f.getCargo();
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    public void excluir(String nome, List <Funcionario> funcionarios){
        Funcionario fRemove = null;
        for (Funcionario f : funcionarios) {
            if (f.getNome().equals(nome)){
                fRemove = f;
                
            }
        }
        funcionarios.remove(fRemove);
        
        
    }
}
