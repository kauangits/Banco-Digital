package Projeto;

import java.util.Scanner;

class AutorizacaoSeguranca extends Gerente {

    
    public AutorizacaoSeguranca(String cpf, String nome, String endereco, String dataNascimento, String cargo, GerenciarConta gerencia) {
        super(cpf, nome, endereco, dataNascimento, cargo, gerencia);
    }

    public boolean verificarSenha(ContaBancaria conta, String senhaDigitada) {
    while (!conta.getSenha().equals(senhaDigitada)) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Senha incorreta. Digite sua senha novamente: ");
        senhaDigitada = scanner.nextLine();
    }
    System.out.println("Senha verificada com sucesso.");
    return true;
}

    public boolean autorizarOperacao(String senhaDigitada) {
        if (verificarSenha(getGerencia(), senhaDigitada)) {
            System.out.println("Operação autorizada.");
            return true;
        } else {
            System.out.println("Senha incorreta. Operação não autorizada.");
            return false;
        }
    }

    public void verificarLogin(ContaBancaria conta){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu login:");
        String loginDigitado = sc.nextLine();

        if(conta.getLogin().equals(loginDigitado)){
            System.out.println("login correto");
        }
        else{
            System.out.println("login errado digite novamente");
        }
    }
    
    /*public void verificarLogin(ContaBancaria conta){
    Scanner sc = new Scanner(System.in);
    String loginDigitado;

    do {
        System.out.println("Digite seu login: ");
        loginDigitado = sc.nextLine();

        if (conta.getLogin().equals(loginDigitado)) {
            System.out.println("Login correto.");
        } else {
            System.out.println("Login errado, digite novamente.");
        }
    } while (!conta.getLogin().equals(loginDigitado));

    System.out.println("Login verificado com sucesso.");
}*/


    /*public boolean solicitarSenhaNovamente(ContaBancaria conta) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha novamente: ");
        String senhaDigitada = scanner.nextLine();

        if (verificarSenha(conta, senhaDigitada)) {
            System.out.println("Senha verificada com sucesso.");
            return true;
        } else {
            System.out.println("Senha incorreta. Tente novamente.");
            return false;
        }
    }*/
}