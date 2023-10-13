package Projeto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//arraylista de contas já esta com kauan, para não perder tempo vou fazer outras

public class ContaBancaria extends CadastroUsuario{

    private int codigo;
    private String login;
    private String senha;
    private double saldo;
    private Usuario usuario;
    
    public ContaBancaria(String cpf, String nome, String endereco, String dataNascimento, int codigo, String login,
            String senha, double saldo, Usuario usuario) {
        super(cpf, nome, endereco, dataNascimento);
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    


}
