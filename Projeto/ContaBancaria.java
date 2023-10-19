package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaBancaria extends AutorizacaoSeguranca {

    private int codigo;
    private String login;
    private int senha;
    private double saldo;
    private Usuario usuario;
    

public ContaBancaria(int codigo, String login, int senha,Usuario usuario) {
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
        this.saldo = 0.0;
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
   
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     public double getSaldo() {
        return saldo;
    }

public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException{
    if(getSaldo()>0 && valor>0 && getSaldo()>valor){
        setSaldo(getSaldo()-valor);
       }
    if (valor <= 0) {
        throw new ValorInvalidoException("Valor inválido para saque");
    }
    if (getSaldo() < valor) {
        throw new SaldoInsuficienteException("Saldo insuficiente para saque");
    }
}

  public void depositar(double valor) throws ValorInvalidoException{
    if(valor<=0){
        throw new ValorInvalidoException("Valo insuficente para o deposito");
  }
        setSaldo(getSaldo()+valor);
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}

public List <Transacoes> histransacoes = new ArrayList<>();
private List<ContaBancaria> contas = new ArrayList<>();

public List<Transacoes> getHistransacoes() {
    return histransacoes;
}


public void Transacao( ContaBancaria destinatario, double valor, Transacoes transacoes) throws ContaNaoExisteException, ValorInvalidoException, SaldoInsuficienteException{

    if(valor <=0){
        throw new ValorInvalidoException("Valor inválido para transação");
    }

    if (!contas.contains(destinatario)) {
        throw new ContaNaoExisteException("Conta destinatária inexistente");
    }

    if(getSaldo() < valor){
        throw new SaldoInsuficienteException("Saldo insuficiente para transação");
    }

    setSaldo(getSaldo() - valor);
    destinatario.setSaldo(destinatario.getSaldo() + valor);

    /*if( getSaldo() >= valor){
        if(contas.contains(destinatario)){
            setSaldo(getSaldo() - valor);
            destinatario.setSaldo(destinatario.getSaldo()+valor);
            System.out.println("Transação ralizada com sucesso");
        }
        else{
            System.out.println("Essa conta não existe");
        }
    }else{
        System.out.println("Saldo insufiecente para realizar transação");
    }*/

    histransacoes.add(transacoes);
    System.out.println("Transação ralizada com sucesso");
    
}

public void Extrato(){
    System.out.println("Extrato da conta do:" + usuario.getNome());
    for( Transacoes transacoes : histransacoes){
        System.out.println(transacoes.toString());
    }
}

public void realizarOperacoes(ContaBancaria conta) {
    Scanner scanner = new Scanner(System.in);
 
    while (true) {
        try {
            System.out.println("Escolha a operação:");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Transação");
            System.out.println("4. Ver informações");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o valor do depósito: ");
                double valor = scanner.nextDouble();
                conta.depositar(valor);
                System.out.println("Depósito realizado com sucesso.");
            } else if (escolha == 2) {
                System.out.print("Digite o valor do saque: ");
                double valor = scanner.nextDouble();
                conta.sacar(valor);
                System.out.println("Saque realizado com sucesso.");
            } else if (escolha == 3) {
                System.out.print("Digite o valor da transação: ");
                double valor = scanner.nextDouble();
                Transacao(null, valor, null);
            } else if (escolha == 4) {
             
            } else if (escolha == 5) {
                System.out.println("Saindo do menu.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } catch (ValorInvalidoException | SaldoInsuficienteException | ContaNaoExisteException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    scanner.close();
}


@Override
public String toString() {
  return "Conta [saldo=" + saldo + ", usuario=" + getUsuario()+ "]";
}

public int getSenha() {
    return senha;
}

public List<ContaBancaria> getContas() {
    return contas;
}

}
