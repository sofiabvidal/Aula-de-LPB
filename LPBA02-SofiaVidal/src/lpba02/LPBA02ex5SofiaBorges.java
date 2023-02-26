package lpba02;

import javax.swing.JOptionPane;

/*Implemente um programa que solicita as suas Notas de Provas e Notas de
Trabalho para cada um dos 4 Bimestres do ano e, ao final, ele deve informar se
você passou ou necessita de recuperação final nesta disciplina. Considere os
critérios pertinentes, apresentados nos slides n° 4 e n° 5 do grupo de slides de
apresentação desta disciplina.*/

public class LPBA02ex5SofiaBorges {
    public static void main(String[] args) {
       try {
           double notaProva = 0, notaTrabalho = 0, mediaFinal = 0;
           
           for(int i = 1; i <= 4; i++) {
              notaProva += Double.parseDouble(JOptionPane.showInputDialog
                                 ("Informe a nota de prova do " + i + " bimestre"));
              notaTrabalho += Double.parseDouble(JOptionPane.showInputDialog
                                 ("Informe a nota de trabalho do " + i + " bimestre"));
           }
           
           mediaFinal = ((notaProva * 0.7) + (notaTrabalho * 0.3)) / 4;
           
           if (mediaFinal >= 6) {
               JOptionPane.showMessageDialog(null, "Parabéns, você passou na disciplina!");
           } else {
               JOptionPane.showMessageDialog(null, "Você está de recuperação!");
           }
           
       }catch(Exception e) {
          JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
       }
    }
}
