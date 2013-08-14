package br.senai.sc.view;


import br.senai.sc.model.negocio.Produto;
import br.senai.sc.persistencia.ProdutoDAO;
import br.senai.sc.validacao.Validacao;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class JanelaProduto {
     public void menuProduto(List<Produto>produtos) {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Produto \n"
                    +"Informe a opção desejada:"
                    + "\n1 - Inserir"
                    + "\n2 - Excluir"
                    + "\n3 - Alterar"
                    + "\n4 - Buscar"
                    + "\n5 - Listar"
                    + "\n6 - Sair"));
            switch(opcao){
                case 1 :
                   adicionaProduto(produtos);                                
                   break;
                case 2:
                    removeProduto(produtos);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    ListaProduto(produtos);
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção incorreta");
                
            }
        } while (opcao != 6);
      }
        void adicionaProduto(List<Produto> Produtos){            
            Produto p  = new Produto();
            
            String produto;
            
            do{
                produto = JOptionPane.showInputDialog("informe o nome do produto");
            }while(!Validacao.somenteLetras(produto));
            
            p.setNome(produto);
            p.setDataValidade(JOptionPane.showInputDialog("Informe a data de validade do produto"));
            p.setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto")));
                                                                                       
                                                                                                     
           ProdutoDAO dao = new ProdutoDAO();
                    dao.adicionar(p, Produtos);
          
      }

    private void ListaProduto(List <Produto> produtos) {
        ProdutoDAO dao = new ProdutoDAO();
        dao.listar(produtos);
    }

    private void removeProduto(List<Produto> produtos) {
        ProdutoDAO dao = new ProdutoDAO();
        String nome = JOptionPane.showInputDialog
                ("Informe o nome do produto a ser excluído");
        
      dao.excluir(nome, produtos);
      
     
    }
}
