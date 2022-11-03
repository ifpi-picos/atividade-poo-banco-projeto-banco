package BANCO;

public class Cliente {
    private String nome;
    private String data;
    private String cpf;
    private Endereco endereco;
    public Cliente(String nome, String data, String cpf, Endereco endereco) {
        this.nome = nome;
        this.data = data;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public Cliente() {
    }
    public String getNome() {
        return nome;
    }
    public String getData() {
        return data;
    }
    public String getCpf() {
        return cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    
}
    