//  SWITCH:

/*  O laço "switch" é um laço usado para quando queremos fazer a comparação de um valor
    recebido com vários valores diferentes e gerar um resultado específico dependendo 
    do valor que foi recebido.

    A forma de utilizá-lo é muito simples:

        switch(variavelQueSeraComparada){
            case valorDeComparacao:
                Sentenca a ser executada;
                break;
            case valorDeComparacao2:
                Sentenca a ser executada;
                break;
            default:
                Sentenca a ser executada por padrao caso nenhuma seja satisfeita;
        }

        Explicação:
            # Dentro dos parâmetros do switch não vamos receber uma operação booleana
                como acontece nos demais laços. Em vez disso recebemos a variável que
                contém o valor que será comparado com cada caso "case";

            # Os cases recebem os valores que serão comparados à variável. Se o valor
                for identico ao valor que está no case, o laço vai entrar na 
                execução do case.
                AQUI VALE UMA OBSERVAÇÃO! Caso um valor entre no case e não possua um
                break dentro da sentença, todos os outros cases também serão 
                executados!

            # O uso do break é opcional, ele é usado para que saíamos do laço depois 
                de entrar em um case e não executemos nenhum outro;

            # O default é usado como um valor padrão caso nenhum case seja satisfeito,
                ele sempre deve ser usado por último, se usarmos o default em primeiro
                ou antes de outros cases, eles serão executados, por que o default 
                abre o espaço para executar tudo!

    Vejamos um exemplo...
 */

import javax.swing.JOptionPane;

public class Switch {
    public static void main(String[] args){

        String animal = JOptionPane.showInputDialog(null, "O animal e o que? (terrestre, aquatico ou anfibio)");

        switch(animal.toLowerCase()){
            case "anfibio":
                JOptionPane.showMessageDialog(null, "O animal sabe andar e nadar");
            case "terrestre":
                JOptionPane.showMessageDialog(null, "O animal sabe andar");
                break;
            case "aquatico":
                JOptionPane.showMessageDialog(null, "O animal sabe nadar");
                break;
            default:
                JOptionPane.showMessageDialog(null, "voce nao colocou valor nenhum");
        }

        System.exit(0);
    }
}
