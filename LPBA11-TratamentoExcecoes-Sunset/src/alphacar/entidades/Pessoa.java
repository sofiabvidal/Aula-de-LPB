package alphacar.entidades;

public abstract class Pessoa {
    private String nome, apelido, endereco;

    public Pessoa() {
        nome = "Indefinido";
        apelido = "Indefinido";
        endereco = "Indefinido";
    }

    public Pessoa(String nome, String apelido, String endereco) {
        this.nome = nome;
        this.apelido = apelido;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
