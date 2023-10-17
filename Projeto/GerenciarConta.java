package Projeto;


import java.util.List;
import java.util.Scanner;

public class GerenciarConta{

    private boolean deixa;

    private Gerente g1;
    private List<ContaBancaria> contas;
    private ContaBancaria conta;
 
     Scanner teclado = new Scanner(System.in);
    public GerenciarConta(Gerente g1) {
      
        this.g1 = g1;
        
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
    public ContaBancaria existirLogin(String login){
     for(ContaBancaria c:contas){
        if(c.getLogin().equals(login)){
        return c;
            

        }else{
        System.out.println("login inexistente");
            return null;
        }
      }

    }



    public void verSaldo(){
        System.out.println("Esse é o seu saldo: " + conta.getSaldo());
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

    

    }
