package Projeto;

public class Pagamentos {
    
    private String beneficiario;
    private String descricao;
    private double valor;
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Pagamentos(String beneficiario, String descricao, double valor, String data) {
        this.beneficiario = beneficiario;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void processarPagamento() {
        
        System.out.println("Pagamento de R$" + valor + " para " + beneficiario + " processado com sucesso.");
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "beneficiario='" + beneficiario + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
