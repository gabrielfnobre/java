// SOBRE ARRAY:

/*  O array é uma estrutura de dados do Java onde é possível que possamos colocar uma coleção de 
    dados de forma indexada.

    Quais são as características de um array em Java?
    Observe a sintaxe de como um array é declarado:

        double[] arrayValues = new double[7];

        Explicando:
                -   Note que o que todo array deve ter apenas um tipo de dado, o array acima por 
                    exemplo é um array que conterá apenas tipos double. Isso significa que 
                    arrays são estruturas homogêneas (apenas um tipo de dado);

                -   Um array deve conter os colchetes após a declaração do tipo, é isso que 
                    mostra que um array é um array;

                -   Um array deve ser armazenado em um espaço de memória, como uma variável, no 
                    caso, esse array está armazenado em "arrayValues";

                -   Um array deve ser instanciado com a palavra reservada "new", note que não o 
                    instanciamos sobre a palavra reservada "Array" como em algumas linguagens,
                    em vez isso usamos novamente o nome do tipo primitivo junto aos colchetes,
                    porém, no java, os arrays deverão ser declarados com um número máximo de 
                    indexação. No caso acima, temos um array que no máximo poderá ter 7 valores;

    Exemplificando o que foi feito acima por através de uma imagem, separando as características
    básicas de um array, teríamos o seguinte:

            ---------> Estático              -----------> Estrutura Indexada
            |                              __|__
            |                             |     | 
            |               __0_____1_____2_____3_____4_____5_____6__
            |              |     |     |     |     |     |     |     |
    double [7] arrayValues | 1.2 | 1.2 | 1.2 | 1.2 | 1.2 | 1.2 | 1.2 |
       |             |     |_____|_____|_____|_____|__|__|__|__|_____|
       |             |                                |_____|
       |             ----> Referencia a                  | 
       ---> Estrutura        um espaço                   -----------> Estrutura Homogênia
             Tipada        de memória em
                               comum         

       Explicando:
    
            # Estrutura Tipada: Significa que todo array deve ser definido com base em um tipo;
            
            # Estático: No java os arrays devem ser declarados sempre com um número máximo de 
                        alocação. Caso quiséssemos aumentar o tamanho de um array, devemos 
                        fazer uma reatribuição sobre a variável, atribuindo um array com uma
                        quantidade maior de alocação e copiando os valores antigos para os
                        novos;

            # Referência a um único espaço de memória em comum: Os array sempre deverão ser 
                        alocados num espaço de memória em comum por através de uma variável;

            # Estrutura Indexada: os valores alocados podem ser referenciados por um valor 
                        índice, que vai de 0 até o valor máximo da alocação - 1;

            # Estrutura Homogênea: todos os arrays em java só podem aloca 1 único tipo de dado
                        não podem alocar tipos de dados diferentes;

 */

public class ArrayAbout {
    
}
