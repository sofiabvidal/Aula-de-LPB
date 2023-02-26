package lpba02;

import javax.swing.JOptionPane;

/*Implemente um programa que solicita a altura e a largura de um
retângulo e em seguida realiza o cálculo e apresentação do valor
referente à área desta figura geométrica.
package lpba02;*/

//Obs: JOption.QUESTION_MESSAGE = 3- valor da constante

public class LPBA02ex1SofiaBorges {
    public static void main(String[] args) {
        int altura, base, area;
        
        String vrString = JOptionPane.showInputDialog(
            null,
            "Qual é o tamanho da BASE do retângulo?",
            "Entrada de Dados",
            3);
        base = Integer.parseInt(vrString);
        
        vrString = JOptionPane.showInputDialog(
            null, 
            "Qual é o tamanho da ALTURA do retângulo?",
            "Entrada de Dados",
            3);
        altura = Integer.parseInt(vrString);
        
        area = base*altura;
        
        JOptionPane.showMessageDialog(
            null,
            "A área do retângulo é: " +area,
            "resultado",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
