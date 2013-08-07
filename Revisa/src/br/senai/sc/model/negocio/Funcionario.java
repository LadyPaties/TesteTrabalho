package br.senai.sc.model.negocio;

/**
 *Classe que representa os funcionários do software
 * @version 1.0 07/08/2013
 * @author patriciagageiro
 */
public class Funcionario extends PessoaFisica{
    
    private double salario;
    private String dataAdmissão;
    private String ctps;
    private String cargo;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(String dataAdmissão) {
        this.dataAdmissão = dataAdmissão;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
