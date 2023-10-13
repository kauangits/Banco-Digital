package Projeto;

public class Gerente extends Usuario{
//classe gerente só vai chamar os métodos de GerenciarConta
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Gerente(String cpf, String nome, String endereco, String dataNascimento, String cargo) {
        super(cpf, nome, endereco, dataNascimento);
        this.cargo = cargo;
    }

}