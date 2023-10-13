package Projeto;

import java.util.List;

public abstract class GerenciarConta extends ContaBancaria{

    private boolean deixa;
    
    public GerenciarConta(String cpf, String nome, String endereco, String dataNascimento, int codigo, String login,
            String senha, double saldo, Usuario usuario, boolean deixa) {
        super(cpf, nome, endereco, dataNascimento, codigo, login, senha, saldo, usuario);
        this.deixa = deixa;
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

    public void verSaldo(){
        System.out.println("Esse é o seu salo: " + getSaldo());
    }

    List<ContaBancaria> contas;

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
// precisamos da lista de contas de usuarios que ta com kauan 
// então provavevelmnte funcionaria

    public void Encerrar(){
        if (conta.getSaldo() == 0.0) { 
            contas.remove(conta); 
            System.out.println("Conta encerrada com sucesso.");
        } else {
            System.out.println("Não é possível encerrar a conta. O saldo não é zero.");
        }
    }

    }
