package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroUsuario  {
  
    private Usuario usuario;
    private List<Usuario> usuarios;
  
  
  
    public CadastroUsuario() {
        usuarios = new ArrayList<>();
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
    ValidaCpf.VerficaCpf(Cpf);
    ValidaCpf.ValidaNumber(Cpf);

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

    public Usuario escolherUsuario(String n) {
    
    for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(n)) {
                return usuario;
            }
        }
        return null;
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

