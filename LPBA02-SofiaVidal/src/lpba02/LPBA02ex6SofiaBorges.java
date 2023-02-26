package lpba02;

import javax.swing.JOptionPane;

/*Implemente um programa que calcule o salário líquido de um professor que
recebe por aulas ministradas no mês. Para tanto:
a) Solicite que o usuário forneça: o número de aulas ministradas, o valor a ser
pago por aula, e um percentual de desconto de INSS;

b) Calcule: o Salário Bruto (número de aulas ministradas vezes o valor a ser
pago por aula), o Total de Desconto de INSS (Salário Bruto vezes o
percentual de desconto informado dividido por 100), e o Salário Líquido
(Salário Bruto menos o Total de Desconto de INSS);

c) Apresente o resultado na seguinte forma:
(+) Salário Bruto......: R$ 99999.99
(-) INSS...............: R$ 99999.99
------------------------------------
Salário Líquido....: R$ 99999.99*/

public class LPBA02ex6SofiaBorges {
    public static void main(String[] args) {
       try {
           double aula, valorAula, desconto, salarioBruto, valorDesconto, salarioLiquido;
           
           aula = Double.parseDouble(JOptionPane.showInputDialog("Quantas aulas ministrou esse mês?: "));
           valorAula = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor por aula?: "));
           valorDesconto = Double.parseDouble(JOptionPane.showInputDialog
                                             ("Qual o valor do desconto do INSS?: "));
           
           salarioBruto = aula * valorAula;
           desconto = salarioBruto * (valorDesconto / 100);
           salarioLiquido = salarioBruto - desconto;
           
           JOptionPane.showMessageDialog(null, "(+) Salário Bruto......: R$ " + salarioBruto + "\n" +
                                               "(-) INSS...............: R$ " + desconto + "\n" +
                                               "------------------------------------\n" +
                                               "Salário Líquido....: R$ " + salarioLiquido);
           
       }catch(Exception e) {
          JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
       }
    }
}
