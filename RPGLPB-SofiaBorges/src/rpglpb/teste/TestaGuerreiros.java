package rpglpb.teste;

import javax.swing.JOptionPane;
import rpglpb.entidades.Arqueiro;
import rpglpb.entidades.Cavaleiro;
import rpglpb.entidades.Lanceiro;

public class TestaGuerreiros {
    public static void main(String[] args) {
        Cavaleiro cavaleiro = new Cavaleiro();
        Arqueiro arqueiro = new Arqueiro();
        Lanceiro lanceiro = new Lanceiro();
        
        // Definindo valores para o cavaleiro
        cavaleiro.setVidas(10);
        cavaleiro.setForca(5);
        cavaleiro.setEnergia(3);
        cavaleiro.setDestreza(1);
        
        // Definindo valores para o arqueiro
        arqueiro.setVidas(9);
        arqueiro.setForca(6);
        arqueiro.setEnergia(4);
        arqueiro.setDestreza(2);
        
        // Definindo valores para o lanceiro
        lanceiro.setVidas(8);
        lanceiro.setForca(7);
        lanceiro.setEnergia(5);
        lanceiro.setDestreza(3);
        
        JOptionPane.showMessageDialog(null, "Cavaleiro: \n" + cavaleiro.toString());
        JOptionPane.showMessageDialog(null, "Arqueiro: \n" + arqueiro.toString());
        JOptionPane.showMessageDialog(null, "Lanceiro: \n" + lanceiro.toString());
    }
}
