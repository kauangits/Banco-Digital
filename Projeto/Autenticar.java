package Projeto;

import java.util.ArrayList;
import java.util.List;

public class Autenticar extends AutorizacaoSeguranca {
   private List<ContaBancaria> contasAutenticadas;
    public Autenticar() {
        contasAutenticadas = new ArrayList<>();
    }

    public boolean autenticar(ContaBancaria conta, String login, int senha) {
       if(verificarLogin(conta, login)==true&&verificarSenha(conta, senha)==true){
        // Implemente a lógica de autenticação aqui
        // Verifique se a conta, o login e a senha correspondem a uma conta válida
        // Normalmente, você teria uma estrutura de dados que contém todas as contas válidas
        // Você também pode usar um banco de dados para isso
        // Neste exemplo, vou usar uma lista fictícia para demonstração

        // Verifica se a conta, login e senha correspondem a uma conta válida
        boolean credenciaisValidas = contasAutenticadas.contains(conta) && conta.getLogin().equals(login) && conta.getSenha() == senha;
       
        if (credenciaisValidas) {
            // Se as credenciais forem válidas, adiciona a conta à lista de contas autenticadas
            contasAutenticadas.add(conta);
        }

        return credenciaisValidas;
    }
   System.out.println("nao e a conta");
    return false;
    }

    public boolean isAutenticado() {
        // Verifica se a conta atual está na lista de contas autenticadas
        return contasAutenticadas.contains(contaAtual); // Você deve definir "contaAtual" de alguma forma
    }
}

