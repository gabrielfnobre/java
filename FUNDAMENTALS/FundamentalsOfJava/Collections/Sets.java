//  SETS:

/*  O "set" é uma estrutura de dados dentro dos collections onde é possível armazenar valores das seguintes
    formas:

        # Heterogênea ou Homogênea:
            Podemos armazenar valores que possuem tanto o mesmo tipo de dado como valores com tipos de 
            dados diferente.

            OBSERVAÇÃO: É preferível que os valores não sejam heterogêneos, não é visto como uma boa 
            prática guardar valores heterogêneos num set, num list, num array ou qualquer estrutura que 
            seja. Mas claro podem existir suas excessões, mas via de regra, não é uma boa prática;

        # Não aceita valores duplicados:
            O set não aceita valores iguais, apenas valores diferentes;

        # Pode ser ordenado:

        # Não pode ser indexado:
            Diferente dos arrays e lists, o set não pode ser indexado;

        # Não aceita Tipos Primitivos:
            Não só o set, como todas as collections, não aceitam tipos primitivos, elas só aceitam tipos que
            sejam encarados pelo java como um object, como: String, Wrappers ou Arrays;

            OBSERVAÇÃO: Podemos até atribuir um valor de tipo primitivo diretamente á um set que ele vai 
            aceitar normalmente. Mas o que acontece de verdade é que o set fará a conversão do valor de tipo
            primitivo para um tipo wrapper correspondente.
 */

import java.util.Arrays;
import java.util.HashSet;

public class Sets {
    public static void main(String[] args){
        HashSet oneSet = new HashSet(Arrays.asList("novinho", "novão", "novissimo"));
        oneSet.add(25);
        oneSet.add(4.50);
        oneSet.add(true);
        System.out.println(oneSet);
    }
    
}
