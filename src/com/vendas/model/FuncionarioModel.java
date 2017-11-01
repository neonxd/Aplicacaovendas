
package com.vendas.model;


public class FuncionarioModel {

    public FuncionarioModel() {
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public FuncionarioModel(int cpf, String nome, String endereço, String telefone, String email, String sexo, String salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.salario = salario;
    }
    
    private int cpf;
    private String nome;
    private String endereço;
    private String telefone;
    private String email;
    private String sexo;
    private String salario;
}
