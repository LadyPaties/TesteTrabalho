package br.senai.sc.model.negocio;

/**
 * Classe que representas os clientes fisicos do software
 *
 * @version 1.0 07/08/2013
 * @author patriciagageiro
 */
public class ClientePF extends PessoaFisica{

    private double numConta;
    private double limiteCompra;
    private char categoria;
    private int qtVezesComprou;
    private double valorTotalGasto;

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getQtVezesComprou() {
        return qtVezesComprou;
    }

    public void setQtVezesComprou(int qtVezesComprou) {
        this.qtVezesComprou = qtVezesComprou;
    }

    public double getValorTotalGasto() {
        return valorTotalGasto;
    }

    public void setValorTotalGasto(double valorTotalGasto) {
        this.valorTotalGasto = valorTotalGasto;
    }
    public ClientePF(){
        
    }
}
