package alphacar.entidades;

public class Veiculo {
    private int ano, status;
    private float preco;
    private String marca, modelo, placa, observacoes;

    public void setAno(){
        this.ano = 0;
    }
    
    public void setStatus(){
        this.status = 0;
    }
    
    public void setPreco(){
        this.preco = 0F;
    }
    
    public void setMarca(){
        this.marca = "Indefinido";
    }
    
    public void setModelo(){
        this.modelo = "Indefinido";
    }
    
    public void setPlaca(){
        this.placa = "ABCD1234";
    }
    
    public void setObservacoes(){
        this.observacoes = "Nada consta";
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    public void registrar(){
        
    }
    
    public void consultarVendidos(){
        
    }
    
    public void modificarStatus(int novoStatus){
        
    }
    
    public void mostrar(){
        System.out.println("=================");
        System.out.println("Marca........: " + this.marca);
        System.out.println("Modelo.......:" + this.modelo);
        System.out.println("Placa........:" + this.placa);
        System.out.println("Ano..........:" + this.ano);
        System.out.println("Preço........:" + this.preco);
        System.out.println("Observações..: " + this.observacoes);
        System.out.println("Status.......:" + this.status);
    }
}
