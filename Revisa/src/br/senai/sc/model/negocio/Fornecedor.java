package br.senai.sc.model.negocio;

/**
 *Classe que representa os fornecedores do softaware
 * @version 1.0 08/07/2013
 * @author Owner
 */
public class Fornecedor extends PessoaJuridica {
    
    private String tipoProduto;
    
    public Fornecedor(){
        
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
}
