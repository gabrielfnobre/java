//O desafio consiste em criar uma calculadora que receba...
// Primeiro: numero 1
// Segundo: numero 2
// Terceiro: o operador
// Deixando claro que os operadores só podem ser: "+ - * / %"

//Observação não pode usar laço if

import javax.swing.JOptionPane;

public class calculator {
 
    public static void main(String[] args){

        Double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero:"));
        Double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero:"));
        String operator = JOptionPane.showInputDialog(null, "Digite a operacao (+ - * / %):");
        Double result =  "+".equals(operator) ? numero1 + numero2 : 0;
        result =  "-".equals(operator) ? numero1 - numero2 : result;
        result =  "/".equals(operator) ? numero1 / numero2 : result;
        result =  "*".equals(operator) ? numero1 * numero2 : result;
        result =  "%".equals(operator) ? numero1 % numero2 : result;

        JOptionPane.showMessageDialog(null, "O resultado eh: " + result);

        System.exit(0);

    }

}
