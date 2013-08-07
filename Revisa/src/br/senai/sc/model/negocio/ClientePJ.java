package br.senai.sc.model.negocio;

/**
 * Classe que representa os clientes juridicos do software
 *
 * @version 1.007/08/2013
 * @author patriciagageiro
 */
public class ClientePJ extends PessoaJuridica{

    private double limite;
    private int numConta;
    private char categoria;
    private int qtVezesComprou;
    private double valorTotalGasto;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
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
}
