package br.senai.sc.persistencia;
import br.senai.sc.model.negocio.Produto;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    public void adicionar(Produto p, List<Produto> produtos) {
        produtos.add(p);
        JOptionPane.showMessageDialog(null, "Produto "
                + "adicionado com sucesso. ");
    }

    public void listar(List<Produto> produtos) {
        String msg = " ";
        for (Produto p : produtos) {
            msg = msg + "\nNome: " + p.getNome()
                    + "\nData de validade do produto:" + p.getDataValidade()
                    + "\nValor do produto: " + p.getValor();

        }
        JOptionPane.showMessageDialog(null, msg);
    }

    public void excluir(String nome, List<Produto> produtos) {
        
    }

    
}
