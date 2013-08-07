package br.senai.sc.model.negocio;

/**
 * Classe que representa as transportadoras do software.
 * @version 1.0 08/07/2013
  * @author Owner
 */
public class Transportadora extends Pessoa{
    
    private String tipoTransporte;
    private double precoFrete;
    
    public Transportadora(){
        
    }
    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }
    
}
