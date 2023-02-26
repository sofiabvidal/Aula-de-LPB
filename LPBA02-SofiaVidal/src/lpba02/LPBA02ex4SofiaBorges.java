package lpba02;

import javax.swing.JOptionPane;

/*Implemente um programa de câmbio de moeda que apresenta o valor
da conversão em Dólar (US$) para um valor informado em Real (R$). O
programa deve solicitar o valor da cotação do US$ em relação ao R$ e a
quantidade de R$ que o usuário pretende converter.*/

public class LPBA02ex4SofiaBorges {
    public static void main(String[] args) {
       try {
           double real, dolar, cotacaoDolar;
           
           cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog
                        ("Coloque a cotação do Dólar atualmente: "));
           real = Double.parseDouble(JOptionPane.showInputDialog("Quantos reais pretende converter?: "));
           dolar = real * cotacaoDolar;
           
           JOptionPane.showMessageDialog(null, "O valor convertido para Dólar é: " + dolar);
           
       }catch(Exception e) {
          JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
       }
    }
}
