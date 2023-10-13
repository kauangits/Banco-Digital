package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroUsuario {
    private String login;
    private String senha;
    private Usuario usuario;
    private List<Usuario> usuarios;
    
    public CadastroUsuario() {
        usuarios = new ArrayList<>();
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

  Scanner teclado = new Scanner(System.in);   
   

   

    public void Cadastro(){
   
    System.out.println("digite o nome");
        String nome = teclado.nextLine(); 
       System.out.println("digite data de nascimento");
        String nascimento = teclado.nextLine(); 
       System.out.println("digite endereço");
        String  endereco = teclado.nextLine();
      System.out.println("digite cpf");
    String Cpf = teclado.nextLine();
    

        if((!existirUsuarioCpf(Cpf))&&(!existirUsuarioEndereco(endereco))&&(!existirUsuarioNome(nome))&&!existirUsuarioEndereco(endereco)){
      Usuario usuario = new Usuario(Cpf, nome, endereco, nascimento);
    
      usuarios.add(usuario);
  
    


    System.out.println("usuario cadastrado");
   System.out.println("usuario"+usuario.getNome());
   
  

}else{
    System.out.println("usuario ja esta cadastrado");
  }
   

}


    public boolean existirUsuarioCpf(String Cpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(Cpf)) {
                return true;
            }
        }
        return false;
    }

   public boolean existirUsuarioNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

   public boolean existirUsuarioNascimento(String nascimento) {
        for (Usuario usuario : usuarios) {
            if (usuario.getDataNascimento().equals(nascimento)) {
                return true;
            }
        }
        return false;
    }
   public boolean existirUsuarioEndereco(String endereco) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEndereco().equals(endereco)) {
                return true;
            }
        }
        return false;
    }

    public boolean escolherUsuario() {
    System.out.println("digite o cpf do usuario para criaçao da conta");
        String n = teclado.nextLine(); 
    
    for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(n)) {
                return true;
            }
        }
        return false;
    }

    public Usuario getUsuario() {
    return usuario;
}

public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
}

public Scanner getTeclado() {
    return teclado;
}

public void setTeclado(Scanner teclado) {
    this.teclado = teclado;
}

public List<Usuario> getUsuarios() {
    return usuarios;
}

public void setUsuarios(List<Usuario> usuarios) {
    this.usuarios = usuarios;
}

@Override
public String toString() {
    return  "usuario=" + usuario + ", usuarios=" + usuarios;
           
}

   /*  private String pedirEntradaNaoVazia(String mensagem) {
        String entrada;
        do {
            System.out.print(mensagem);
            entrada = teclado.nextLine().trim();
        } while (entrada.isEmpty());

        return entrada;
    }*/


}

