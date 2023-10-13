package Projeto;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria extends CadastroUsuario{

    private int codigo;
    private String login;
    private String senha;
    private double saldo;
    private Usuario usuario;
    

public ContaBancaria(int codigo, String login, String senha, double saldo, Usuario usuario) {
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
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     public double getSaldo() {
        return saldo;
    }

public void sacar(double valor){
    if(getSaldo()>0&&valor>0){
        setSaldo(getSaldo()-valor);
       }else{
           System.out.println("valor sacado");

  }
}
  public void depositar(double valor){
    if(valor>0){
        setSaldo(getSaldo()+valor);
       }else{
           System.out.println("valor nao foi depositado");
       }
  }

public void setSaldo(double saldo) {
    this.saldo = saldo;
}

public List <Transacoes> histransacoes = new ArrayList<>();

public void Extrato(){
    System.out.println("Extrato da conta do:" + usuario.getNome());
    for( Transacoes transacoes : histransacoes){
        System.out.println(transacoes.toString());
    }
}


@Override
public String toString() {
  return "Conta [saldo=" + saldo + ", usuario=" + getUsuario()+ "]";
}

}
