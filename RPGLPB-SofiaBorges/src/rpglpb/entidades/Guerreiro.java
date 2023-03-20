package rpglpb.entidades;

public class Guerreiro {
    private int vidas, forca, destreza, energia;

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public void andar() {
        
    }
    
    public void pular() {
        
    }
    
    public void defender() {
        
    }
    
    public void golpear(int golpe, Guerreiro adversario) {
        
    }
    
    public void receberGolpe(int golpe) {
        
    }
    
    @Override
    public String toString() {
        return "Vidas: " + this.vidas +
                "\nForça: " + this.forca +
                "\nDestreza: " + this.destreza +
                "\nEnergia: " + this.energia;
    }
}

