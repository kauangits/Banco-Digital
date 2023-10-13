package Projeto;

import java.util.Scanner;
class AutorizacaoSeguranca extends GerenciarConta {

    public AutorizacaoSeguranca(String cpf, String nome, String endereco, String dataNascimento, int codigo, String login,
            String senha, double saldo, Usuario usuario, boolean deixa) {
        super(cpf, nome, endereco, dataNascimento, codigo, login, senha, saldo, usuario, deixa);
    }

    public static boolean verificarSenha(ContaBancaria conta, String senhaDigitada) {
        return conta.getSenha().equals(senhaDigitada);
    }

    public boolean autorizarOperacao(String senhaDigitada) {
        if (AutorizacaoSeguranca.verificarSenha(this, senhaDigitada)) {
            System.out.println("Operação autorizada.");
            return true;
        } else {
            System.out.println("Senha incorreta. Operação não autorizada.");
            return false;
        }
    }

    public static boolean solicitarSenhaNovamente(ContaBancaria conta) {
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
    }
}