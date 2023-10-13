package Projeto;

import java.util.ArrayList;
import java.util.List;

public abstract class GerenciarConta extends ContaBancaria{

    private boolean deixa;

    private Gerente g1;
    private List<ContaBancaria> contas;
    private ContaBancaria conta;

    
    public GerenciarConta(int codigo, String login, String senha, double saldo, Usuario usuario, Gerente g1,
            List<ContaBancaria> contas, ContaBancaria conta) {
        super(codigo, login, senha, saldo, usuario);
        this.g1 = g1;
        this.contas = contas;
        this.conta = conta;
    }

    public Gerente getG1() {
        return g1;
    }

    public void setG1(Gerente g1) {
        this.g1 = g1;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(List<ContaBancaria> contas) {
        this.contas = contas;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

    public boolean isDeixa() {
        return deixa;
    }

    public void setDeixa(boolean deixa) {
        this.deixa = deixa;
    }

    public boolean Permitir(){
        if( deixa == true){
            System.out.println("pode criar sua conta");
            return true;
        }
        else{
            System.out.println("não pode criar sua conta");
        }
        return false;
    }

    public void criarConta(ContaBancaria conta){
    
        contas.add(conta);
      
      


    }

    public void verSaldo(){
        System.out.println("Esse é o seu salo: " + getSaldo());
    }

    public void exibirInfo() {
        for (ContaBancaria conta : contas) {
            Usuario usuario = conta.getUsuario();
            if (usuario != null) {
                System.out.println("Informações do usuário: " + usuario.toString());
            } else {
                System.out.println("Usuário não encontrado para a conta ");
            }
        }
    }
    
    public void Encerrar(){
        if (conta.getSaldo() == 0.0) { 
            contas.remove(conta); 
            System.out.println("Conta encerrada com sucesso.");
        } else {
            System.out.println("Não é possível encerrar a conta. O saldo não é zero.");
        }
    }

     @Override
    public String toString() {
        return "GerenciadorDeConta [g1=" + g1 + ", contas=" + contas + ", conta=" + conta + "]";
    }

    }
