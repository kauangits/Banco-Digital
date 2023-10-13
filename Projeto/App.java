package Projeto;

public class App{
     public static void main(String[] args) {
        // Crie alguns objetos de exemplo
        Usuario usuario1 = new Usuario("12345678900", "João", "Rua A", "01/01/1990");
        Usuario usuario2 = new Usuario("98765432100", "Maria", "Rua B", "02/02/1985");

        ContaBancaria conta1 = new ContaBancaria(1, "joao123", "senha123", 1000.0, usuario1);
        ContaBancaria conta2 = new ContaBancaria(2, "maria456", "senha456", 500.0, usuario2);

        Transacoes transa1 = new Transacoes(1, "joao123", "senha123", 1000.0, usuario1, "20/11/2023", "pagamento", usuario1);
        Transacoes transa2 = new Transacoes(2, "maria456", "senha456", 500.0, usuario2, "20/11/2023", "deposito", usuario2)
        
        conta1.depositar(200.0);
        conta1.sacar(50.0);

        transa1.Pix(conta2, 100.0, transa1);
        transa2.Pix(conta1, 50.0, transa2);

        conta1.Extrato();
        conta2.Extrato();
    }
}