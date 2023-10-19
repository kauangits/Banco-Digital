package Projeto;

import java.util.Scanner;

class AutorizacaoSeguranca  {

   
   Scanner sc = new Scanner(System.in);
   

    public boolean verificarSenha(ContaBancaria conta,int senha) {
    while(conta.getSenha()!=senha){
    System.out.println("senha errada digite novamente");
      int s = sc.nextInt();
      if(s==conta.getSenha()){
       System.out.println("senha correta");
        return true;
      }
     
    }
   return false; 
}

  /*   public boolean autorizarOperacao(String senhaDigitada) {
        if (verificarSenha(getGerencia(), senhaDigitada)) {
            System.out.println("Operação autorizada.");
            return true;
        } else {
            System.out.println("Senha incorreta. Operação não autorizada.");
            return false;
        }
    }*/

    public boolean verificarLogin(ContaBancaria conta,String login){
      while(conta.getLogin().equals(login)){
    System.out.println("senha errada digite novamente");
      String l = sc.nextLine();
      if(l==conta.getLogin()){
       System.out.println("senha correta");
        return true;
      }
     
    }
   return false; 
    }
    
    public boolean entrarNaConta(ContaBancaria contaEntrar,String login,int senha){
     if(verificarLogin(contaEntrar, login)==true&&verificarSenha(contaEntrar, senha)==true){
        return true;
     }
     return false;
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