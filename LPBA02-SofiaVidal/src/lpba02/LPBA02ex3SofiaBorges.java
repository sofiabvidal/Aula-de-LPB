package lpba02;

import javax.swing.JOptionPane;

/*Implemente um programa que solicite os valores para duas variáveis (A e
B), troque os valores entre estas variáveis e os exiba na tela. Em outras
palavras, após a troca, B deverá conter o valor informado para A e A
deverá conter o valor informado para B.*/

public class LPBA02ex3SofiaBorges {

    public static void main(String[] args) {
        try {
            double A, B, troca;
            A = Double.parseDouble(JOptionPane.showInputDialog("Atribua um valor para A: "));
            B = Double.parseDouble(JOptionPane.showInputDialog("Atribua um valor para B: "));

            troca = A;
            A = B;
            B = troca;

            JOptionPane.showMessageDialog(null, "O valor de A é: " + A);
            JOptionPane.showMessageDialog(null, "O valor de B é: " + B);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        }
    }
}
