package BANCO;

public class Endereco {
    private  String rua;
    private int numer;
    private String bairro;
    private String cidade;
    private String uf;
    public Endereco(String rua, int numer, String bairro, String cidade, String uf) {
        this.rua = rua;
        this.numer = numer;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setNumer(int numer) {
        this.numer = numer;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getRua() {
        return rua;
    }
    public int getNumer() {
        return numer;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public String getUf() {
        return uf;
    }

    
}

