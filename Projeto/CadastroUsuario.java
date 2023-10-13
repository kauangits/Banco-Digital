package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroUsuario extends Usuario{

    public CadastroUsuario( String cpf, String nome, String endereco, String dataNascimento ){
        super(cpf, nome, endereco, dataNascimento);
        cadastro();
    }

    private  List<CadastroUsuario> listaUsuario = new ArrayList<>();
    private  Scanner scanner = new Scanner(System.in);

    public void cadastro(){
        listaUsuario.add(this);
        System.out.println("Cadastro com sucesso");
    }
    
}
