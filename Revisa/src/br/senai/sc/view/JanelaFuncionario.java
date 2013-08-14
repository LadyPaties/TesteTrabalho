/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.persistencia.FuncionarioDAO;
import br.senai.sc.validacao.Validacao;
import java.util.List;
import javax.swing.JOptionPane;
    
    public class JanelaFuncionario {
        
      public void menuFuncionario(List<Funcionario> funcionarios) {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Funcionário \n"
                    +"Informe a opção desejada:"
                    + "\n1 - Inserir"
                    + "\n2 - Excluir"
                    + "\n3 - Alterar"
                    + "\n4 - Buscar"
                    + "\n5 - Listar"
                    + "\n6 - Sair"));
            switch(opcao){
                case 1 :
                   adicionaFuncionario(funcionarios);                                     
                   break;
                case 2:
                    removeFuncionario(funcionarios);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    ListaFuncionario(funcionarios);
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção incorreta");
                
            }
        } while (opcao != 6);
      }
        void adicionaFuncionario(List <Funcionario> funcionarios){            
            Funcionario f = new Funcionario();
            String nome;
            String telefone;
            String cargo;
            
            do{
                nome = JOptionPane.showInputDialog("informe o nome do funcionário");
            
            }while(!Validacao.somenteLetras(nome));
            
            
            f.setNome(nome);
            
            f.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do funcionário"));
            f.setRg(JOptionPane.showInputDialog("Informe o rg do funcionário"));
            f.setCpf(JOptionPane.showInputDialog("Informe o cpf do funcionário"));
            f.setEndereco(JOptionPane.showInputDialog("Informe o endereço do funcionário"));
            
            do{
                telefone = JOptionPane.showInputDialog("Informe o telefone do funcionário");
            }while(!Validacao.somenteNumeros(telefone));
            
            f.setTelefone(telefone);
            f.setDataCadastro(JOptionPane.showInputDialog("Informe a data de cadastro do funcionário"));
            f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Infome o salário do funcionário")));
            f.setDataAdmissão(JOptionPane.showInputDialog("infome a data de admissão do funcionário"));
            f.setCtps(JOptionPane.showInputDialog("Informe o número da Ctps do funcionário"));
            
            do{
                cargo = JOptionPane.showInputDialog("Informe o cargo do funcionário");
            }while(!Validacao.somenteLetras(cargo));
            f.setCargo(cargo);                                                                              
                                                                                                     
           FuncionarioDAO dao = new FuncionarioDAO();
                    dao.adicionar(f, funcionarios);
          
      }

    private void ListaFuncionario(List <Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.listar(funcionarios);
    }

    private void removeFuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog
                ("Informe o nome do funcionários a ser excluído");
        
      dao.excluir(nome, funcionarios);
      
     
    }
    }
   

   
