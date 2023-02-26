package lpba02;

import javax.swing.JOptionPane;

/*Implemente um programa que solicite um valor de temperatura em
graus Celsius e apresente este valor convertido em graus Fahrenheit.

psvm = ctrl + espaço*/

public class LPBA02ex2SofiaBorges {

    public static void main(String[] args) {
        try {
            double celsius, fahrenheit, conversao;

            celsius = Double.parseDouble(JOptionPane.showInputDialog("Qual sua temperatura em graus Celsius?: "));

            conversao = (celsius * 1.8) + 32;

            JOptionPane.showMessageDialog(null, "A sua temperatura em Fahrenheit é: " + conversao);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        }
    }
}
