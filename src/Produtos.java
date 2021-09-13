public class Produtos {
    private String nome;
    private String tipo;
    private String tamanho;
    private double valor;

    public Produtos() {
        this.setNome("");
        this.setTipo("");
        this.setTamanho("");
        this.setValor(0.0)
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
