package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.negocio.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *Classe que controla toda a parte visual da aplicação
 * @version 1.0 31/07/2013
 * @author patricia_gageiro
 *
 */
public class JanelaPrincipal {
    public static void main(String[] args) {
            //Vetor dinâmico para armazenar os funcionários cadastrados.
     List<Funcionario> funcionarios = new ArrayList<>();
     List<Produto> produtos = new ArrayList<>();
        mostraMenu(funcionarios, produtos);
    }

    public static void mostraMenu(List<Funcionario>funcionarios, List<Produto> produtos) {
        JanelaFuncionario jf = new JanelaFuncionario();
        JanelaProduto jp = new JanelaProduto();
        int opcao = 0;

        do {
            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Informe a opção:"
                    + "\n1 - Funcionário"
                    + "\n2 - Cliente"
                    + "\n3 - Fornecedor"
                    + "\n4 - Tranportadora"
                    + "\n5 - Produto"
                    + "\n6- Sair"));
        
            switch (opcao) {
                case 1:
                    jf.menuFuncionario(funcionarios);
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;
                case 5:
                    jp.menuProduto(produtos);
                    break;
                case 6:                 
                 break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opção inexistente! ");
            }

            }while (opcao != 6);
    }
       
    
}
